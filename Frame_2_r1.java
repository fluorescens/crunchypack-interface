/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    private JTextArea path_to_images; 
    private JTextArea name_of_crunchypack; 
    private JTextArea number_of_groups; 
    
    public Frame_2_r1() {
        JLabel local_title = new JLabel("Pack size setup");
        local_title.setFont(new Font("Courier",1, 30));
        local_title.setForeground(Color.WHITE);
        JPanel v_panel_1 = new JPanel();
        GridBagConstraints v1 = new GridBagConstraints(); //container holding gridbag components
        v_panel_1.setBackground(Color.BLUE);
        v1.anchor = GridBagConstraints.NORTH;
        v1.fill = GridBagConstraints.HORIZONTAL; 
        v1.weighty = 0.5; 
        v1.gridwidth = 10; 
        v1.gridheight = 1; 
        v1.ipady = 10; 
        v1.gridx = 0; 
        v1.gridy = 1; 
        v_panel_1.add(local_title); 
	this.add(v_panel_1, v1);
        
        
        JLabel file_path = new JLabel("Filepath to image folder: ");
        file_path.setFont(new Font("Courier",1, 20));
        file_path.setForeground(Color.BLACK);
        GridBagConstraints f1 = new GridBagConstraints(); //container holding gridbag components
        f1.anchor = GridBagConstraints.SOUTH;
        f1.fill = GridBagConstraints.HORIZONTAL; 
        f1.weighty = 0.5; 
        f1.gridwidth = 2; 
        f1.gridheight = 1; 
        f1.ipady = 10; 
        f1.gridx = 1; 
        f1.gridy = 1; 
	this.add(file_path, f1);
        
        
        JTextArea imgitem = new JTextArea(); 
                  imgitem.setFont(new Font("Courier",1, 16));
        JScrollPane scrollimg = new JScrollPane(imgitem);
        scrollimg.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        GridBagConstraints imgvtx = new GridBagConstraints(); //container holding gridbag components
        imgvtx .anchor = GridBagConstraints.SOUTHWEST;
        imgvtx .fill = GridBagConstraints.HORIZONTAL; 
        imgvtx .weighty = 0.5; 
        imgvtx .gridwidth = 6; 
        imgvtx .gridheight = 1; 
        imgvtx .gridx = 2; 
        imgvtx .gridy = 1; 
        path_to_images = imgitem; 
	this.add(scrollimg, imgvtx);
        
      
        
        JButton item_whatis = new JButton("Example filepath"); 
               item_whatis.setFont(new Font("Courier",1, 13));
        GridBagConstraints viws = new GridBagConstraints(); //container holding gridbag components
        viws.anchor = GridBagConstraints.NORTHWEST;
        viws.weighty = 0.5; 
        viws.gridwidth = 2; 
        viws.gridheight = 1; 
        viws.gridx = 2; 
        viws.gridy = 2; 
	this.add(item_whatis, viws);
        item_whatis.addActionListener(new ActionListener() //exit
        {
          public void actionPerformed(ActionEvent e)
          {
              final String i_title = "About paths and images"; 
              final String i_message = "The filepath is the path to a folder that holds the images. \n"
                      +"Example: C:\\Users\\Kevin\\Screenshots\\ChessImg where folder ChessImg holds all the images we plan to use. \n"
                      + "Images MUST be in 256-bitmap format. To make an image a 256-bitmap, "
                      + "open the image file in an editing program like Paint and click: \n"
                      + "File -> Save As -> and under Save as type, choose \"256 Color bitmap\" ";  
              display_popup(i_title, i_message); 
          }
        });
        
         JLabel pack_name = new JLabel("Choose file name: ");
        pack_name.setFont(new Font("Courier",1, 20));
        pack_name.setForeground(Color.BLACK);
        GridBagConstraints p1 = new GridBagConstraints(); //container holding gridbag components
        p1.anchor = GridBagConstraints.CENTER;
        p1.fill = GridBagConstraints.HORIZONTAL; 
        p1.weighty = 0.5; 
        p1.gridwidth = 2; 
        p1.gridheight = 1; 
        p1.ipady = 10; 
        p1.gridx = 1; 
        p1.gridy = 3; 
	this.add(pack_name, p1);
        
        JTextArea name_item = new JTextArea(); 
                  name_item.setFont(new Font("Courier",1, 16));
                  name_item.setForeground(Color.BLACK);
        GridBagConstraints namevtx = new GridBagConstraints(); //container holding gridbag components
        namevtx .anchor = GridBagConstraints.CENTER;
        namevtx .fill = GridBagConstraints.HORIZONTAL; 
        namevtx .weighty = 0.5; 
        namevtx .gridwidth = 6; 
        namevtx .gridheight = 1; 
        namevtx .gridx = 2; 
        namevtx .gridy = 3; 
        name_of_crunchypack = name_item; 
	this.add(name_item, namevtx);
        
        
        JLabel groupc = new JLabel("Number of groups:");  
               groupc.setFont(new Font("Courier",1, 20));
               groupc.setForeground(Color.BLACK);
        GridBagConstraints v4 = new GridBagConstraints(); //container holding gridbag components
        v4 .anchor = GridBagConstraints.SOUTH;
        v4 .fill = GridBagConstraints.HORIZONTAL; 
        v4.weighty = 0.5; 
        v4.gridwidth = 1; 
        v4.gridheight = 1; 
        v4.gridx = 1; 
        v4.gridy = 4; 
	this.add(groupc, v4);
        
        
        JTextArea groupn = new JTextArea(); 
                  groupn.setFont(new Font("Courier",1, 16));
        JScrollPane scrolln = new JScrollPane(groupn);
        scrolln.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        GridBagConstraints vtnx = new GridBagConstraints(); //container holding gridbag components
        vtnx.anchor = GridBagConstraints.CENTER;
        vtnx.anchor = GridBagConstraints.SOUTHWEST; 
        vtnx.fill = GridBagConstraints.HORIZONTAL; 
        vtnx.weighty = 0.5; 
        vtnx.gridwidth = 1; 
        vtnx.gridheight = 1; 
        vtnx.gridx = 2; 
        vtnx.gridy = 4; 
        number_of_groups = groupn; 
	this.add(scrolln, vtnx);
        
        
        JButton group_whatis = new JButton("What is a group?"); 
                group_whatis.setFont(new Font("Courier",1, 13));
        GridBagConstraints giws = new GridBagConstraints(); //container holding gridbag components
        giws.anchor = GridBagConstraints.NORTHWEST;
        giws.fill = GridBagConstraints.HORIZONTAL; 
        giws.weighty = .9; 
        giws.gridwidth = 1; 
        giws.gridheight = 1; 
        giws.gridx = 2; 
        giws.gridy = 5; 
	this.add(group_whatis, giws);
        group_whatis.addActionListener(new ActionListener() //exit
        {
          public void actionPerformed(ActionEvent e)
          {
              final String p_title = "About groups"; 
              final String p_message = "Groups are a collection of images that represent the same object. \n"
                      + "If you have 5 images of the same lake from different angles, you would have"
                      + " 5 images in 1 group \"Lake\"."; 
              display_popup(p_title, p_message); 
          }
        });
        
    }
      
    //adding acccessr functions
    String get_path_to_images() {
        return path_to_images.getText(); 
    }
    
    int get_number_of_groups() {
        return Integer.parseInt(number_of_groups.getText()); 
    }
    
    String get_name_of_pack() {
        return name_of_crunchypack.getText(); 
    }
}
