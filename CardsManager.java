/*
"Master" frame using a cardlayout style layout defining a single view and always-visible controls 
for top level navigation that control which subframe is displayed. 
Global controls include three buttons: an exit, website launcher, and "next" that advances the frame. 
All frames are subclasses of GFrame which defines the generic gridbag layout of each frame. 
*/
package cleanstencilui;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*; 

/*
 * @author jamesl
 */
public class CardsManager extends JFrame{
    //the one and only cards object that holds the panel components and provides navigation. 
     static private JPanel cardPanel; //the  holder for all the subpanels
     private int currentCard = 1; //the starting identifer
     private static CardLayout cards; //the one and only cards object
     public static final int DEBUG_GROUP_COUNT = 3; //Test value for debugging mode
     private static Frame_3_r1 refFrame3; //refrence to the created on-the-fly frame 3 object
     private static Frame_4_r1 refFrame4; //refrence to the created on-the-fly frame 4 object
     private static ArrayList<Object> NAME_OF_GROUPS = new ArrayList<>(); //the names of all the user-defined groups
     private static String[] NAMES_OF_IMAGES; //the names of all the discovered files
     public int NUMBER_OF_GROUPS; //numer of user defined groups
     public int NUMBER_OF_IMAGES; //number of user defined images
     private String PATH_TO_IMG_FOLDER; //the absolute full path from root to image folder
     private String PACK_NAME; //the user defined name of the crunchypack. 
     
     public CardsManager() {
         //Initialize the empty jframe container and top level buttons. 
         cardPanel = new JPanel(); 
         this.setTitle("Crunchypack Build 1.0");
         cards = new CardLayout(); 
         cardPanel.setLayout( cards );    
        
         
         //build the jpanel button row
         JPanel panel_buttons = new JPanel(); 
         panel_buttons.setLayout( new GridBagLayout() );
         
         //dummy alignment panels to align the various frames
            GridBagConstraints gbag_constraint_h1 = new GridBagConstraints(); //container holding gridbag components
            JPanel h_panel_1 = new JPanel();
            h_panel_1.setBackground(Color.RED);
            gbag_constraint_h1.anchor = GridBagConstraints.NORTHWEST;
            gbag_constraint_h1.fill = GridBagConstraints.HORIZONTAL; 
            gbag_constraint_h1.weightx = 0.1; 
            gbag_constraint_h1.gridx = 0; 
            gbag_constraint_h1.gridy = 0; 
            panel_buttons.add(h_panel_1, gbag_constraint_h1);

            JPanel h_panel_2 = new JPanel();
            h_panel_2.setBackground(Color.GREEN);
            gbag_constraint_h1.anchor = GridBagConstraints.NORTH;
            gbag_constraint_h1.fill = GridBagConstraints.HORIZONTAL;  
            gbag_constraint_h1.weightx = 0.1; 
            gbag_constraint_h1.gridx = 1; 
            gbag_constraint_h1.gridy = 0; 
            panel_buttons.add(h_panel_2, gbag_constraint_h1);

            JPanel h_panel_3 = new JPanel();
            h_panel_3.setBackground(Color.RED);
            gbag_constraint_h1.anchor = GridBagConstraints.NORTH;
            gbag_constraint_h1.fill = GridBagConstraints.HORIZONTAL; 
            gbag_constraint_h1.weightx = 0.1; 
            gbag_constraint_h1.gridx = 2; 
            gbag_constraint_h1.gridy = 0; 
            panel_buttons.add(h_panel_3, gbag_constraint_h1);

            JPanel h_panel_4 = new JPanel();
            h_panel_4.setBackground(Color.GREEN);
            gbag_constraint_h1.anchor = GridBagConstraints.NORTH;
            gbag_constraint_h1.fill = GridBagConstraints.HORIZONTAL; 
            gbag_constraint_h1.weightx = 0.1; 
            gbag_constraint_h1.gridx = 3; 
            gbag_constraint_h1.gridy = 0; 
            panel_buttons.add(h_panel_4, gbag_constraint_h1);

            JPanel h_panel_5 = new JPanel();
            h_panel_5.setBackground(Color.RED);
            gbag_constraint_h1.anchor = GridBagConstraints.NORTH;
            gbag_constraint_h1.fill = GridBagConstraints.HORIZONTAL; 
            gbag_constraint_h1.weightx = 0.1; 
            gbag_constraint_h1.gridx = 4; 
            gbag_constraint_h1.gridy = 0; 
            panel_buttons.add(h_panel_5, gbag_constraint_h1);

            JPanel h_panel_6 = new JPanel();
            h_panel_6.setBackground(Color.GREEN);
            gbag_constraint_h1.anchor = GridBagConstraints.NORTH;
            gbag_constraint_h1.fill = GridBagConstraints.HORIZONTAL; 
            gbag_constraint_h1.weightx = 0.1; 
            gbag_constraint_h1.gridx = 5; 
            gbag_constraint_h1.gridy = 0; 
            panel_buttons.add(h_panel_6, gbag_constraint_h1);

            JPanel h_panel_7 = new JPanel();
            h_panel_7.setBackground(Color.RED);
            gbag_constraint_h1.anchor = GridBagConstraints.NORTH;
            gbag_constraint_h1.fill = GridBagConstraints.HORIZONTAL; 
            gbag_constraint_h1.weightx = 0.1; 
            gbag_constraint_h1.gridx = 6; 
            gbag_constraint_h1.gridy = 0; 
            panel_buttons.add(h_panel_7, gbag_constraint_h1);

            JPanel h_panel_8 = new JPanel();
            h_panel_8.setBackground(Color.GREEN);
            gbag_constraint_h1.anchor = GridBagConstraints.NORTH;
            gbag_constraint_h1.fill = GridBagConstraints.HORIZONTAL; 
            gbag_constraint_h1.weightx = 0.1; 
            gbag_constraint_h1.gridx = 7; 
            gbag_constraint_h1.gridy = 0; 
            panel_buttons.add(h_panel_8, gbag_constraint_h1);

            JPanel h_panel_9 = new JPanel();
            h_panel_9.setBackground(Color.RED);
            gbag_constraint_h1.anchor = GridBagConstraints.NORTH;
            gbag_constraint_h1.fill = GridBagConstraints.HORIZONTAL;  
            gbag_constraint_h1.weightx = 0.1; 
            gbag_constraint_h1.gridx = 8; 
            gbag_constraint_h1.gridy = 0; 
            panel_buttons.add(h_panel_9, gbag_constraint_h1);

            JPanel h_panel_10 = new JPanel();
            h_panel_10.setBackground(Color.GREEN);
            gbag_constraint_h1.anchor = GridBagConstraints.NORTH;
            gbag_constraint_h1.fill = GridBagConstraints.HORIZONTAL; 
            gbag_constraint_h1.weightx = 0.1; 
            gbag_constraint_h1.gridx = 9; 
            gbag_constraint_h1.gridy = 0; 
            panel_buttons.add(h_panel_10, gbag_constraint_h1);
        //end dummy alignment panels    
            
            
            
        //Add basic frames to deck
        Frame_1_r1 GFrame_Frame_1 = new Frame_1_r1();
        Frame_2_r1 GFrame_Frame_2 = new Frame_2_r1(); 
        cardPanel.add(GFrame_Frame_1, "1"); //panel, identifier
        cardPanel.add(GFrame_Frame_2, "2"); 
                                    
        //Cardmanager frame navigation buttons
        JButton button_exit = new JButton("Exit");
        button_exit.setFont(new Font("Courier", Font.PLAIN, 20));
        button_exit.addActionListener(new ActionListener()
        {
          @Override
          public void actionPerformed(ActionEvent e)
          { 
              if(currentCard == 1) {
                 System.exit(0);
              }
              else {
                  --currentCard;
                  cards.show(cardPanel, Integer.toString(currentCard));
              }
          }
        });
            GridBagConstraints gabg_constraint_exit = new GridBagConstraints(); //container holding gridbag components
            gabg_constraint_exit.anchor = GridBagConstraints.WEST;
            gabg_constraint_exit.fill = GridBagConstraints.HORIZONTAL; 
            gabg_constraint_exit.weightx = 0.1; 
            gabg_constraint_exit.weighty = 1; 
            gabg_constraint_exit.gridwidth = 2; 
            gabg_constraint_exit.gridheight = 2;
            gabg_constraint_exit.ipady = 5;
            gabg_constraint_exit.gridx = 1; 
            gabg_constraint_exit.gridy = 1; 
            panel_buttons.add(button_exit, gabg_constraint_exit);
            
        JButton button_sitelaunch = new JButton("Visit the Site"); 
                button_sitelaunch.setFont(new Font("Coutier", Font.PLAIN, 20));
         button_sitelaunch.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
              //launch browser to site address & page tag for cpack
          }
        });
        
            GridBagConstraints gbag_constrain_sitelaunch = new GridBagConstraints(); //container holding gridbag components
            gbag_constrain_sitelaunch.anchor = GridBagConstraints.CENTER;
            gbag_constrain_sitelaunch.fill = GridBagConstraints.HORIZONTAL; 
            gbag_constrain_sitelaunch.weightx = 0.1; 
            gbag_constrain_sitelaunch.gridwidth = 2;
            gbag_constrain_sitelaunch.gridheight = 3;
            gbag_constrain_sitelaunch.ipady = 5;
            gbag_constrain_sitelaunch.weighty = 1; 
            gbag_constrain_sitelaunch.gridx = 4; 
            gbag_constrain_sitelaunch.gridy = 1; 
            panel_buttons.add(button_sitelaunch, gbag_constrain_sitelaunch);
            
            
    
        /*
        Next button validates current frame data and advances if correct. 
        If incorrect, prporgram launches a popup with the approriate case matching error message. 
        */
        JButton button_next = new JButton("Next >");
                button_next.setFont(new Font("Courier", Font.PLAIN, 20));
        button_next.addActionListener(new ActionListener()
        {
          @Override
          public void actionPerformed(ActionEvent e)
          {
              switch(currentCard) {
                  case 1:
                        ++currentCard; 
                        cards.show(cardPanel, Integer.toString(currentCard)); 
                      break; 
                  case 2:
                    int proceed_counter = 0; 
                    String fpath; 
                    if(CleanStencilUI.DEBUG_MODE == 1) {
                      fpath = "C:\\Users\\JamesH\\Documents\\NetBeansProjects\\CrunchyUI\\src\\crunchyui\\testfolder"; 
                      //C:\Users\JamesH\Documents\NetBeansProjects\CrunchyUI\src\crunchyui\testfolder
                    }
                     else {
                      fpath = GFrame_Frame_2.get_path_to_images(); 
                    }
                    Path path = Paths.get(fpath);
                    if(Files.exists(path) && !fpath.isEmpty()) {
                       Path IMGFOLDER = path; 
                       NAMES_OF_IMAGES = imgnames(fpath);
                       PATH_TO_IMG_FOLDER = fpath; 
                       NUMBER_OF_IMAGES = NAMES_OF_IMAGES.length;  
                       ++proceed_counter; 
 
                       if(CleanStencilUI.DEBUG_MODE == 1) {
                            PACK_NAME  = "samplepack";  
                           ++proceed_counter; 
                       }
                        else {
                            String candidate_name = GFrame_Frame_2.get_name_of_pack(); 
                            int test_name = sanitize_filename(candidate_name); 
                            if(test_name == 0) {
                                PACK_NAME =  candidate_name;
                                ++proceed_counter; 
                            }
                            else {
                                String filename_error = "Illegal name for file. \n"
                                        + "Name your pack like you would a regular file. Your name cannot contain \n"
                                        + "characters that a normal Windows file would not allow." ; 
                                        display_popup("File name error", filename_error);
                            }
                        }
                   
                        if(CleanStencilUI.DEBUG_MODE == 1) {
                           NUMBER_OF_GROUPS = (DEBUG_GROUP_COUNT); 
                        }
                        else {
                           NUMBER_OF_GROUPS = GFrame_Frame_2.get_number_of_groups();  
                        }

                        int validate_status = validate_groupn(NUMBER_OF_GROUPS, NAMES_OF_IMAGES .length);
                        System.out.println(NUMBER_OF_GROUPS + " " + NAMES_OF_IMAGES.length);
                        if(validate_status != 0) {
                            display_inputError(validate_status); 
                        }
                        else {
                             String final_confirm = "Double check that all images are 256 bitmaps. \n"
                             + "This is not indicating an error, but is just a reminder that non-256 bitmaps can create bad data. \n"
                             + "There are different types of bitmap (.bmp) formats and only 256 bitmaps should be used. \n"
                             + "To check if a file is a 256 bitmap, right click the image, click properties and under the details tab check bit depth. \n"
                             + "This value should be 8; a 4 or 24 are the wrong formats (16 and 24 bitmap). Resave the file in the correct format. \n"
                             + "If you sure are the images are in the correct format, proceed with Crunchypack creation.";
                            display_popup("Double check bitmap formats", final_confirm);
                            ++proceed_counter; 
                         }
                        
                        
                        if(proceed_counter == 3) {
                            Frame_3_r1 jp3 = new Frame_3_r1(GFrame_Frame_2.get_number_of_groups()); 
                            cardPanel.add(jp3, "3");
                            refFrame3 = jp3; 
                            ++currentCard; 
                            cards.show(cardPanel, Integer.toString(currentCard));
                        }
                        else {
                           System.out.println("No go to next" + proceed_counter);
                        }
                    }
                    else {
                         display_inputError(4); 
                    }
                      break; 
              case 3:
                    int group_process = validate_group_table(refFrame3.getTable()); 
                    if(group_process != -1) {
                        //problem, returns the i of the issue. 
                        String group_fail_error = "Error in assigning row " + group_process + ". Review assignment rules";
                        display_popup("Group setup error", group_fail_error); 
                    }
                    else {
                        build_group_table(refFrame3.getTable()); 
                        Frame_4_r1 jp4 = new Frame_4_r1(NAME_OF_GROUPS, NUMBER_OF_IMAGES, NAMES_OF_IMAGES); 
                        refFrame4 = jp4; 
                        cardPanel.add(jp4, "4");
                        ++currentCard; 
                        cards.show(cardPanel, Integer.toString(currentCard));
                    }
                      break; 
               case 4:
                    int combo_add = validate_ComboTable(refFrame4.getComboTableObject()); 
                    if(combo_add != -1) {
                        String error_validate_COmboTable = "Error in row " + combo_add; 
                        String error_validate_COmboTable_row = "Row " + combo_add + " contains an invalid value. \n"
                                + "New image names cannot be empty, duplicates, a single space, or none."; 
                        display_popup(error_validate_COmboTable, error_validate_COmboTable_row); 
                    }
                    else {
                        //prepare a final package of the data for the IMGReduce algorithm program to use. 
                        Object[][] finalized_data =  build_ComboTable(refFrame4.getComboTableObject()); 
                        data_pkg(finalized_data); 
                        cardPanel.setVisible(false);
                        //shut the program down. Pack build was successful. 
                        System.exit(0);
                    }
                  break; 
              }
          }
        });
            //add buttons to top-level cardmanager frame
            GridBagConstraints gbag_constrain_next = new GridBagConstraints(); //container holding gridbag components
            gbag_constrain_next.anchor = GridBagConstraints.EAST;
            gbag_constrain_next.fill = GridBagConstraints.HORIZONTAL; 
            gbag_constrain_next.weightx = 0.1; 
            gbag_constrain_next.gridwidth = 2;
            gbag_constrain_next.gridheight = 3;
            gbag_constrain_next.ipady = 5; 
            gbag_constrain_next.weighty = 1; 
            gbag_constrain_next.gridx = 7; 
            gbag_constrain_next.gridy = 1; 
            panel_buttons.add(button_next, gbag_constrain_next);

            //the empty display panel object that shows subframes
            JPanel panel_filler = new JPanel();
            panel_filler.setBackground(Color.GREEN);
            gbag_constraint_h1.anchor = GridBagConstraints.NORTH;
            gbag_constraint_h1.fill = GridBagConstraints.HORIZONTAL; 
            gbag_constraint_h1.weightx = 1; 
            gbag_constraint_h1.gridheight = 4; 
            gbag_constraint_h1.gridwidth = 10; 
            gbag_constraint_h1.gridx = 0; 
            gbag_constraint_h1.gridy = 5; 
            panel_buttons.add(panel_filler, gbag_constraint_h1);
            
         
         this.getContentPane().add(panel_buttons, BorderLayout.SOUTH); //add the button panel
         this.getContentPane().add(cardPanel, BorderLayout.CENTER); //add the frame area
     }
     
     

      private void display_popup(String title, String message) {
      //Displays popup messages with a title. 
      Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
      UIManager.put("OptionPane.messageFont", font); //sets the size of popup fonts. 
      JFrame popup_parent = new JFrame(); 
      JOptionPane jpop = new JOptionPane(); 
      jpop.showOptionDialog(
                              popup_parent, message, title, JOptionPane.DEFAULT_OPTION,
                              JOptionPane.INFORMATION_MESSAGE, null, null, null
                            );
      popup_parent.setVisible(false);
      popup_parent.dispose();
  }
     
    private String[] imgnames(String imgpath) {
      //parses the provided PATH_TO_IMG_FOLDER location and adds files with a .bmp extension to the file collection.
      File fsource = new File(imgpath); 
      FilenameFilter textFilter = new FilenameFilter() {
        @Override
	public boolean accept(File fsource, String name) {
		if (name.endsWith(".bmp")) {
			return true;
		} else {
			return false;
		}
	}
        };
      
      String[] bmpfiles = fsource.list(textFilter); //only adds .bmp files
      return bmpfiles; 
    }
    
   private int sanitize_filename(String test) {
      //checks that the user-enetred filename is not an empty string or other illegal character
      //Disallow values that would make the file difficult for IMGReduce to fine. 
      if( (test.equals(" ")) || (test.equals("\n")) || (test.isEmpty() == true)) {
          return - 1; 
      }
      
      return 0;
  }
      
   
    private void display_inputError(int error_code) 
  {
      /*
      When various input functions fail and return an error code, this function takes the error code and 
      generates a popup message with information to help resolve the problem. 
      */
      switch(error_code) {
          case 1:  //The number of items is not an integer
              final String bad_1 = "Number of items must be an integer from 1 to 999"; 
              display_popup("Input error", bad_1); 
              break; 
          case 2: //the number of groups is not an integer
              final String bad_2 = "Number of groups must be an integer from 1 to 999"; 
               display_popup("Input error", bad_2);
              break; 
          case 3: //the number of groups is > the number of items
              final String bad_3 = "Number of groups cannot exceed number of items"; 
              display_popup("Input error", bad_3);
              break; 
          case 4:
              //The PATH_TO_IMG_FOLDER could not be resolved
              final String bad_4 = "Your filepath could not be found. Re-check the input. \n"
                      + "Common error sources include misspellings or added spaces."; 
              display_popup("Filepath error", bad_4); 
              break; 
          case 5: 
              //The location at PATH_TO_IMG_FOLDER contains items without a .bmp extension
              final String bad_5 = "Your filepath contains non-bitmap files. \n "
                      + "ALL images need to be 256-bitmap files. Review \"What are images\" to see how to convert image formats.";
              display_popup("Non .bmp files in folder", bad_5); 
              break; 
          default:
              break; 
      }
  }
   
   
   
   
    private static int validate_groupn(int validate, int images) 
    {
      //Validate that numbers for groups aren't excessivly large or negative. 
      if(validate < 0) {
          return 2; 
      }
      if(validate > 999) {
          return 2; 
      }

      if((validate) > images) {
          return 3; 
      }
      
    return 0; 
    }
      
    
    
    
    
     private static int validate_group_table(JTable tdat) {
      /*
      Validates that every group name is unique and actually has an identifiable name. 
      */
      if(CleanStencilUI.DEBUG_MODE == 1) {
          return -1; 
      }
      else {
           HashMap<Object, Integer> hcheck = new HashMap<>(); 
           int rowCount = tdat.getRowCount();
           for(int i = 0; i < rowCount; ++i) {
               Object cellValue = tdat.getModel().getValueAt(i, 1); 
               if(cellValue == null || cellValue == "" || cellValue == " " || cellValue == "none") {
                   return i; 
               }
               else {
                   String cv = cellValue.toString();
                   if(cv.isEmpty() == true) {
                         return i; 
                   }
                   if(hcheck.containsKey(cv)) {
                       return i; 
                   }
                   else {
                       hcheck.put(cv, 0); 
                   }
               }
           }
           return -1; //-1, all OK. Any other number is returns the error. 
      }
  }
    
     
     
     
  private void build_group_table(JTable tdat) { 
      //After validation, adds the group names, in order, to the group_names arraylist. 
      //This list will be used to build drop-down options 
      if(CleanStencilUI.DEBUG_MODE == 1) {
            for(int i = 0; i < DEBUG_GROUP_COUNT; ++i) {
              NAME_OF_GROUPS.add(Integer.toString(i)); 
            }
          NAME_OF_GROUPS.add("none"); //The last index is always the reserved keyword
      }
      else {
            for(int i = 0; i < NUMBER_OF_GROUPS; ++i) {
              Object cellValue = tdat.getModel().getValueAt(i, 1); 
              NAME_OF_GROUPS.add(cellValue.toString()); 
            }
          NAME_OF_GROUPS.add("none"); //The last index is always the reserved keyword
      }
  }
    
      
   private int validate_ComboTable(ComboTable tdat) {
      /*
      Validates that the alias names for images are unique, and not reserved words, empty or whitespace. 
      */
      if(CleanStencilUI.DEBUG_MODE == 1) {
          for(int i = 0; i < NUMBER_OF_IMAGES; ++i) {
              Object cellValue = tdat.retrieve_table_value(i, 1);
              refFrame4.getAliasOfImage().add(i, cellValue);
          }
          return -1; 
      }
      else {
           HashMap<Object, Integer> hcheck = new HashMap<>(); 
           int rowCount = NUMBER_OF_IMAGES; 
           for(int i = 0; i < rowCount; ++i) {
               Object cellValue = tdat.retrieve_table_value(i, 1); 
               if(cellValue == null || cellValue == "" || cellValue == " " || cellValue == "none") {
                   refFrame4.getAliasOfImage().clear();
                   return i; 
               }
               else {
                   String cv = cellValue.toString();
                   if(cv.isEmpty() == true) {
                         refFrame4.getAliasOfImage().clear();
                         return i; 
                   }
                   if(hcheck.containsKey(cv)) {
                       refFrame4.getAliasOfImage().clear();
                       return i; 
                   }
                   else {
                       hcheck.put(cv, 0); 
                       refFrame4.getAliasOfImage().add(i, cellValue);
                   }
               }
           }
           return -1; //-1, all OK. Any other number is returns the error. 
      }
  }
      
      
      
      
  private Object[][] build_ComboTable(ComboTable ComboTable_data) {
      //Copies the data from Frame 4 image table into a 2-D Object array
      Object[][] finalized = new Object[NUMBER_OF_IMAGES][3];
      for(int i = 0; i < NUMBER_OF_IMAGES; ++i) {
               for(int k = 0; k < 3; ++k) {
                    Object valueAt = ComboTable_data.retrieve_table_value(i, k);
                    finalized[i][k] = valueAt; 
                    System.out.println(valueAt);
                }
      }      
      return finalized; 
  }
      
      
      
   private void data_pkg(Object[][] finalized_data) {
      //Packages PATH_TO_IMG_FOLDER, groups number, images names, pack name, and group identification to a text file
      //text file will be passed to IMGReduce, which will generate the BGR-Reduced table for the image set
      String localpath = PATH_TO_IMG_FOLDER; 
      if(localpath.charAt(localpath.length() - 1) != '\\' ) {
          localpath += '\\'; 
      }
      else {
          
      }
      System.out.println(NAME_OF_GROUPS.size() + " " + NUMBER_OF_IMAGES + " " + refFrame4.getAliasOfImage().size() ); 
      
      String selectname = System.lineSeparator() + PACK_NAME; 
      
      String final_data_write = localpath + selectname + System.lineSeparator(); 
      for(int i = 0; i < NAME_OF_GROUPS.size(); ++i) {
          final_data_write += NAME_OF_GROUPS.get(i) + ","; 
      }
      final_data_write += System.lineSeparator(); 
      for(int i = 0; i < NUMBER_OF_IMAGES; ++i) {
          final_data_write += NAMES_OF_IMAGES[i] + ","; 
          if(refFrame4.getAliasOfImage().get(i) == null) {
              final_data_write += " ,"; 
              
          }
          else {
              final_data_write += refFrame4.getAliasOfImage().get(i) + ","; 
          }
          int match = 0; 
          for(int b = 0; b < NAME_OF_GROUPS.size(); ++b) {
               if(NAME_OF_GROUPS.get(b) == finalized_data[i][2].toString()) {
                  final_data_write += Integer.toString(b) + "," + System.lineSeparator();
                  break; 
               }
               else {
                   
               }
          } 
      }

        try {
            File file = new  File("cpack_fpath_condense_" + PACK_NAME + ".txt");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(final_data_write);
            bw.close();
        } catch (IOException e) {
            //An unexpected, unmanagable error occured when trying to create the file. 
            //e.printStackTrace();
        }
  }
      
      
      
     public void ui_teardown() {
         //Debug utility for frame visibility control. 
         this.setVisible(false);
     }
}
