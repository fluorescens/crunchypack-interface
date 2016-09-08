/*
Frame 4 displays the image names and has an internal ComboTable object to contain image names and group assignments. 
 */
package cleanstencilui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author jamesl
 */
public class Frame_4_r1 extends GFrame {
    static ArrayList<Object> ALIAS_OF_IMAGE = new ArrayList<>(); //user-entered altername names for the image files
    private ComboTable images_table; //the combo table object that holds image name and group assignments
    
    public Frame_4_r1(ArrayList<Object> name_of_groups, int number_of_images, String[] names_of_images) {
        //initialize the frame 4 that contains a ComboTable populated with image names 
        JLabel local_title = new JLabel("Assign groups and rename files", SwingConstants.CENTER);
        local_title.setFont(new Font("Courier",1, 30));
        local_title.setForeground(Color.WHITE);
        JPanel h_panel_1a = new JPanel();
        GridBagConstraints gbag_constrain_title = new GridBagConstraints(); //container holding gridbag components
        h_panel_1a.setBackground(Color.BLUE);
        gbag_constrain_title.anchor = GridBagConstraints.NORTH;
        gbag_constrain_title.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_title.weighty = 0.5; 
        gbag_constrain_title.gridwidth = 10; 
        gbag_constrain_title.gridheight = 1; 
        gbag_constrain_title.ipady = 10; 
        gbag_constrain_title.gridx = 0; 
        gbag_constrain_title.gridy = 1; 
        h_panel_1a.add(local_title); 
	this.add(h_panel_1a, gbag_constrain_title);
        
        //populate the table with the data discovered by frame 2 and 3
        Object[] columnNames = {"Image  #", "Image name", "Group"};
        final int gtable_entries = number_of_images; 
        Object[][] table_data = new Object[gtable_entries][3];  
        final String none = "none"; 
        for(int i = 0; i < gtable_entries; ++i) {
                table_data[i][0] = i; 
                table_data[i][2] = none; 
            }
    
    
        //the ComboTable columns that are locked for editing
        int[] locked_for_edit = new int[1]; 
        locked_for_edit[0] = 0; 
     
        //user-enetered alternate names for images
        ALIAS_OF_IMAGE.ensureCapacity(number_of_images);
        
        //the default group
        final String combo_default = "none"; 
        Object[][] imgtable_data = new String[number_of_images][3];
        for(int i = 0; i < number_of_images; ++i) {
            imgtable_data[i][0] = Integer.toString(i);
            imgtable_data[i][1] = names_of_images[i]; 
            imgtable_data[i][2] = combo_default;
        }
        
        
        
        ComboTable dropdown_groups = new ComboTable(imgtable_data, columnNames, name_of_groups, number_of_images, 2, locked_for_edit); 
        GridBagConstraints gbag_constrain_ComboTable = new GridBagConstraints(); 
        gbag_constrain_ComboTable.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_ComboTable.anchor = GridBagConstraints.NORTHWEST; 
        gbag_constrain_ComboTable.weightx = 1;
        gbag_constrain_ComboTable.weighty = 1;
        gbag_constrain_ComboTable.gridwidth = 8; 
        gbag_constrain_ComboTable.gridx = 1; 
        gbag_constrain_ComboTable.gridy = 2; 
        this.add(dropdown_groups, gbag_constrain_ComboTable);
        images_table = dropdown_groups; 
    
    
    
        JButton group_rules_help = new JButton("How to use this table?"); 
                group_rules_help.setFont(new Font("Courier",1, 16));
        GridBagConstraints gbag_constrain_combotable_help = new GridBagConstraints(); //container holding gridbag components
        group_rules_help.setBackground(Color.WHITE); 
        gbag_constrain_combotable_help.anchor = GridBagConstraints.NORTH;
        gbag_constrain_combotable_help.weighty = 0.5; 
        gbag_constrain_combotable_help.gridwidth = 2; 
        gbag_constrain_combotable_help.gridheight = 1; 
        gbag_constrain_combotable_help.gridx = 4; 
        gbag_constrain_combotable_help.gridy = 7; 
	this.add(group_rules_help, gbag_constrain_combotable_help);
        group_rules_help.addActionListener(new ActionListener() //exit
        {
          public void actionPerformed(ActionEvent e)
          {
              final String p_title = "Assigning images to groups and renaming images."; 
              final String p_message = "Using this table, images can be renamed and assigned groups. \n \n"
                      + "By clicking the Group column cell, you can select which images belong to which groups. If an image does not \n"
                      + "have a group, leave 'none' as the value. \n \n"
                      + "You can also review all the bitmap files the program will use. If you wanted to include a file and do not see \n"
                      + "it in the table, the program could not find it at the file location or it did not have a .bmp extension. \n"
                      + "Double check that the file is in the folder you provided the filepath to, and that it is a 256-bitmap. \n \n"
                      + "Finally, file names can be edited to something more identifiable. Instead of \"SCREENCAP22564.bmp\" you can \n"
                      + "change the file name the program will use to \"EnemyTank.bmp\". You can also just rename the file itself before \n"
                      + "importing it and the program will use that default name. "; 
              display_popup(p_title, p_message); 
          }
        });
    }
    
    
    public ArrayList<Object> getAliasOfImage() {
        //returns the list of alternate names the user chose for images
        return ALIAS_OF_IMAGE; 
    }
    
    public ComboTable getComboTableObject() {
        //returns the Frame 4 combotable object
        return images_table; 
    }
}
