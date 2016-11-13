/*
Frame 2 has three fields; full path from root to where folder containing images is, the name of the crunchypack, and the 
number of groups the images will be split into. 
Frame 2 will make this data available to cardmanager, who will validate it when the next button is pressed.
If all data is valid, cardmanager will advance to frame 3. If any part is invalid, cardmanager will pop an error message.
 */
package cleanstencilui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author jamesl
 */
public class Frame_2_r1 extends GFrame{
    private JTextArea path_to_images; //full root to folder path containing images
    private JTextArea name_of_crunchypack; //user-enetered name for this pack
    private JTextArea number_of_groups; //number of groups the user wants to divide images into. 
    
    public Frame_2_r1() {
        JLabel local_title = new JLabel("Pack size setup");
        local_title.setFont(new Font("Courier",1, 30));
        local_title.setForeground(Color.WHITE);
        JPanel v_panel_1 = new JPanel();
        GridBagConstraints gbag_constrain_title = new GridBagConstraints(); //container holding gridbag components
        v_panel_1.setBackground(Color.BLUE);
        gbag_constrain_title.anchor = GridBagConstraints.NORTH;
        gbag_constrain_title.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_title.weighty = 0.5; 
        gbag_constrain_title.gridwidth = 10; 
        gbag_constrain_title.gridheight = 1; 
        gbag_constrain_title.ipady = 10; 
        gbag_constrain_title.gridx = 0; 
        gbag_constrain_title.gridy = 1; 
        v_panel_1.add(local_title); 
	this.add(v_panel_1, gbag_constrain_title);
        
        
        JLabel file_path = new JLabel("Filepath to image folder: ");
        file_path.setFont(new Font("Courier",1, 20));
        file_path.setForeground(Color.BLACK);
        GridBagConstraints gbag_constrain_file_label = new GridBagConstraints(); //container holding gridbag components
        gbag_constrain_file_label.anchor = GridBagConstraints.SOUTH;
        gbag_constrain_file_label.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_file_label.weighty = 0.5; 
        gbag_constrain_file_label.weightx = 0.5; 
        gbag_constrain_file_label.gridwidth = 2; 
        gbag_constrain_file_label.gridheight = 1; 
        gbag_constrain_file_label.ipady = 10; 
        gbag_constrain_file_label.gridx = 1; 
        gbag_constrain_file_label.gridy = 1; 
	this.add(file_path, gbag_constrain_file_label);
        
        
        JTextArea imgitem = new JTextArea(); 
                  imgitem.setFont(new Font("Courier",1, 16));
        JScrollPane scrollimg = new JScrollPane(imgitem);
        scrollimg.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        GridBagConstraints gbag_constrain_images = new GridBagConstraints(); //container holding gridbag components
        gbag_constrain_images .anchor = GridBagConstraints.SOUTHWEST;
        gbag_constrain_images .fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_images .weighty = 0.5; 
        gbag_constrain_images .weightx = 0.5;
        gbag_constrain_images .gridwidth = 6; 
        gbag_constrain_images .gridheight = 1; 
        gbag_constrain_images .gridx = 2; 
        gbag_constrain_images .gridy = 1; 
        path_to_images = imgitem; 
	this.add(scrollimg, gbag_constrain_images);
        
      
        
        JButton help_whatis_filepath = new JButton("Example filepath"); 
               help_whatis_filepath.setFont(new Font("Courier",1, 13));
        GridBagConstraints gbag_constrain_filepath = new GridBagConstraints(); //container holding gridbag components
        gbag_constrain_filepath.anchor = GridBagConstraints.NORTHWEST;
        gbag_constrain_filepath.weighty = 0.5; 
        gbag_constrain_filepath.weightx = 0.5;
        gbag_constrain_filepath.gridwidth = 2; 
        gbag_constrain_filepath.gridheight = 1; 
        gbag_constrain_filepath.gridx = 2; 
        gbag_constrain_filepath.gridy = 2; 
	this.add(help_whatis_filepath, gbag_constrain_filepath);
        help_whatis_filepath.addActionListener(new ActionListener() //exit
        {
          public void actionPerformed(ActionEvent e)
          {
              final String title_about_filepaths = "About paths and images"; 
              final String text_about_filepaths = "The filepath is the path to a folder that holds the images. \n"
                      +"Example: C:\\Users\\Kevin\\Screenshots\\ChessImg where folder ChessImg holds all the images we plan to use. \n"
                      + "Images MUST be in 24-bitmap format. To make an image a 24-bitmap, "
                      + "open the image file in an editing program like Paint and click: \n"
                      + "File -> Save As -> and under Save as type, choose \"24 Color bitmap\" ";  
              display_popup(title_about_filepaths, text_about_filepaths); 
          }
        });
        
         JLabel pack_name = new JLabel("Choose file name: ");
        pack_name.setFont(new Font("Courier",1, 20));
        pack_name.setForeground(Color.BLACK);
        GridBagConstraints gbag_constrain_file_name = new GridBagConstraints(); //container holding gridbag components
        gbag_constrain_file_name.anchor = GridBagConstraints.CENTER;
        gbag_constrain_file_name.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_file_name.weighty = 0.5; 
        gbag_constrain_file_name.gridwidth = 2; 
        gbag_constrain_file_name.gridheight = 1; 
        gbag_constrain_file_name.ipady = 10; 
        gbag_constrain_file_name.gridx = 1; 
        gbag_constrain_file_name.gridy = 3; 
	this.add(pack_name, gbag_constrain_file_name);
        
        JTextArea name_item = new JTextArea(); 
                  name_item.setFont(new Font("Courier",1, 16));
                  name_item.setForeground(Color.BLACK);
        GridBagConstraints gbag_constrain_name = new GridBagConstraints(); //container holding gridbag components
        gbag_constrain_name .anchor = GridBagConstraints.CENTER;
        gbag_constrain_name .fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_name .weighty = 0.5; 
        gbag_constrain_name .weightx = 0.5;
        gbag_constrain_name .gridwidth = 6; 
        gbag_constrain_name .gridheight = 1; 
        gbag_constrain_name .gridx = 2; 
        gbag_constrain_name .gridy = 3; 
        name_of_crunchypack = name_item; 
	this.add(name_item, gbag_constrain_name);
        
        
        JLabel label_group = new JLabel("Number of groups:");  
               label_group.setFont(new Font("Courier",1, 20));
               label_group.setForeground(Color.BLACK);
        GridBagConstraints gbag_constrain_group = new GridBagConstraints(); //container holding gridbag components
        gbag_constrain_group .anchor = GridBagConstraints.SOUTH;
        gbag_constrain_group .fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_group.weighty = 0.5; 
        gbag_constrain_group.gridwidth = 1; 
        gbag_constrain_group.gridheight = 1; 
        gbag_constrain_group.gridx = 1; 
        gbag_constrain_group.gridy = 4; 
	this.add(label_group, gbag_constrain_group);
        
        
        JTextArea label_group_number = new JTextArea(); 
                  label_group_number.setFont(new Font("Courier",1, 16));
        JScrollPane label_scrollbar = new JScrollPane(label_group_number);
        label_scrollbar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        GridBagConstraints gbag_constrain_group_number = new GridBagConstraints(); //container holding gridbag components
        gbag_constrain_group_number.anchor = GridBagConstraints.CENTER;
        gbag_constrain_group_number.anchor = GridBagConstraints.SOUTHWEST; 
        gbag_constrain_group_number.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_group_number.weighty = 0.5; 
        gbag_constrain_group_number.gridwidth = 1; 
        gbag_constrain_group_number.gridheight = 1; 
        gbag_constrain_group_number.gridx = 2; 
        gbag_constrain_group_number.gridy = 4; 
        number_of_groups = label_group_number; 
	this.add(label_scrollbar, gbag_constrain_group_number);
        
        
        JButton button_group_help = new JButton("What is a group?"); 
                button_group_help.setFont(new Font("Courier",1, 13));
        GridBagConstraints gbag_constrain_help_group = new GridBagConstraints(); //container holding gridbag components
        gbag_constrain_help_group.anchor = GridBagConstraints.NORTHWEST;
        gbag_constrain_help_group.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_help_group.weighty = .9; 
        gbag_constrain_help_group.gridwidth = 1; 
        gbag_constrain_help_group.gridheight = 1; 
        gbag_constrain_help_group.gridx = 2; 
        gbag_constrain_help_group.gridy = 5; 
	this.add(button_group_help, gbag_constrain_help_group);
        button_group_help.addActionListener(new ActionListener() //exit
        {
          public void actionPerformed(ActionEvent e)
          {
              final String group_title_help = "About groups"; 
              final String group_title_text = "Groups are a collection of images that represent the same object. \n"
                      + "If you have 5 images of the same lake from different angles, you would have"
                      + " 5 images in 1 group \"Lake\"."; 
              display_popup(group_title_help, group_title_text); 
          }
        });
        
    }
      
    String get_path_to_images() {
        //get the user supplied path to image folder
        return path_to_images.getText(); 
    }
    
    int get_number_of_groups() {
        //get the number of files found at path to image location
        if(CleanStencilUI.DEBUG_MODE == 1) {
            return CardsManager.DEBUG_GROUP_COUNT; 
        }
        else {
            return Integer.parseInt(number_of_groups.getText()); 
        }
    }
    
    String get_name_of_pack() {
        //get user supplied name of crunchypack
        return name_of_crunchypack.getText(); 
    }
}
