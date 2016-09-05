
package cleanstencilui;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.*; 

/*
 * @author jamesl
 */
public class CardsManager extends JFrame{
    //the one and only cards object that holds the panel components and provides navigation. 
     static private JPanel cardPanel; //the  holder for all the subpanels
     private int currentCard = 1; //the starting identifer
     private static CardLayout cards; //the one and only cards object
     private final int DEBUG_GROUP_COUNT = 3; 
     
     
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
            
            
            
            //ADD FRAMES TO CARD DECK
            Frame_1_r1 jp1 = new Frame_1_r1();
            Frame_2_r1 jp2 = new Frame_2_r1(); 
            //Frame_3 far_ref; 
            cardPanel.add(jp1, "1"); //panel, indeitifer
            cardPanel.add(jp2, "2"); 
                                    
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
                      proceed_counter = 3; 
                      fpath = "C:\\Users\\JamesH\\Documents\\NetBeansProjects\\CrunchyUI\\src\\crunchyui\\testfolder"; 
                      //C:\Users\JamesH\Documents\NetBeansProjects\CrunchyUI\src\crunchyui\testfolder
                    }
                     else {
                      fpath = jp2.get_path_to_images(); 
                    }
                    Path path = Paths.get(fpath);
                    if(Files.exists(path)) {
                       Path IMGFOLDER = path; 
                       String[] named = imgnames(fpath); 
                       int NUMBER_OF_IMAGES = named.length;  
                       ++proceed_counter; 
 
                       String PACK_NAME; 
                       if(CleanStencilUI.DEBUG_MODE == 1) {
                            PACK_NAME  = "samplepack";            
                       }
                        else {
                            String candidate_name = jp2.get_name_of_pack(); 
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
                  
                        int number_of_groups;  
                        if(CleanStencilUI.DEBUG_MODE == 1) {
                           number_of_groups = (DEBUG_GROUP_COUNT); 
                        }
                        else {
                           number_of_groups = jp2.get_number_of_groups();  
                        }

                        int validate_status = validate_groupn(number_of_groups, named.length);
                        System.out.println(number_of_groups + " " + named.length);
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
                            System.out.println("Go to next" + proceed_counter);
                        }
                        else {
                           System.out.println("No go to next" + proceed_counter);
                        }
                    }
              else {
                   display_inputError(4); 
              }
                    
                      //need to query card 2 for a bunch of data. 
                      //set the appropriate global functions. 
                      //Incriment card if no error to 3, else error and keep at 2. 
                      break; 
                  case 3:
                      break; 
              }
          }
        });
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

            //the empty display panel object
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
     
     
     private void optionpane_error(String error_msg) {
         //Popup that displays its argument as an error message in a popup window
        final String p_title = "An error occured:"; 
              
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
        UIManager.put("OptionPane.messageFont", font); //sets the size of popup fonts. 
        JFrame popup_parent = new JFrame(); 
        JOptionPane jpop = new JOptionPane(); 
        jpop.showOptionDialog(
            popup_parent, error_msg, p_title, JOptionPane.DEFAULT_OPTION,
            JOptionPane.ERROR_MESSAGE, null, null, null
            );
        popup_parent.setVisible(false);
        popup_parent.dispose();
     }
     
     
     
      protected void display_popup(String title, String message) {
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
     
    private static String[] imgnames(String imgpath) {
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
    
   private static int sanitize_filename(String test) {
      if( (test.equals(" ")) || (test.equals("\n")) || (test.isEmpty() == true)) {
          return - 1; 
      }
      
      return 0;
  }
      
   
    private void display_inputError(int error_code) 
  {
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
              final String bad_4 = "Your filepath could not be found. Re-check the input. \n"
                      + "Common error sources include misspellings or added spaces."; 
              display_popup("Filepath error", bad_4); 
              break; 
          case 5: 
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
      
    
    
     public void ui_teardown() {
         this.setVisible(false);
     }
}
