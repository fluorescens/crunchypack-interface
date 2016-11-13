/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleanstencilui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 *
 * @author jamesl
 */
public class Frame_1_r1 extends GFrame {
         //first frame displayed by the cardmanager. 
         //Contains a text area with usage information about the purpose of this program and how to navigate the interface.
    
     final private String DEBUG_instructions_data = "Welcome to crunchypack: Image Manager!\n\n"
         + "This program manages the organizing and renaming of images into groups for building"
         + " a crunchypack-builder skeleton .txt file.\n\nBefore you begin, please have:\n"
         + "\t -A single folder with all of the .bmp images you want."
         + "\n\t -Read/write privileges to all the files in this folder."
         + "\n\nThis program will only accept 24-BITMAP file formats. Please check that all images are saved in this "
         + "format before proceeding. Images can be re-saved in this format by opening them in a program such as "
         + "MS Paint and re-saving them as the correct image type."
         + "\n\nAfter you have built the builder file, run the ImgReduce executable and follow the terminal "
         + "instructions in order to build a complete crunchypack. \n"
         + "Do not delete any of these images. They will be needed by ImgReduce.";
         

    public Frame_1_r1() {
        //individual frame title. 
        JLabel jlabel_title = new JLabel("Crunchypack: Building Instructions", SwingConstants.CENTER); 
        jlabel_title.setFont(new Font("Courier",1, 30));
        JPanel v_panel_1 = new JPanel();
        GridBagConstraints gbag_constrain_vertical1 = new GridBagConstraints(); //container holding gridbag components
        v_panel_1.setBackground(Color.BLUE);
        gbag_constrain_vertical1.anchor = GridBagConstraints.NORTHWEST;
        gbag_constrain_vertical1.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_vertical1.weighty = 0; 
        gbag_constrain_vertical1.gridwidth = 10; 
        gbag_constrain_vertical1.gridheight = 1; 
        gbag_constrain_vertical1.ipady = 10; 
        gbag_constrain_vertical1.gridx = 0; 
        gbag_constrain_vertical1.gridy = 1; 
        gbag_constrain_vertical1.weighty = 0.1; 
        jlabel_title.setForeground(Color.WHITE);
        v_panel_1.add(jlabel_title); 
	this.add(v_panel_1, gbag_constrain_vertical1);
       
        
        
        //Text box containing usage information. 
        JTextArea textarea_instructions = new JTextArea(10, 20);
        textarea_instructions.setFont(new Font("Courier",1, 16));
        JScrollPane jscroll_instructions = new JScrollPane(textarea_instructions);
        GridBagConstraints gbag_constrain_vertical2 = new GridBagConstraints(); //container holding gridbag components
        textarea_instructions.append(DEBUG_instructions_data);
        textarea_instructions.setBackground(Color.WHITE);
        textarea_instructions.setLineWrap(true);
        textarea_instructions.setWrapStyleWord(true);
        textarea_instructions.setEditable(false);
        jscroll_instructions.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jscroll_instructions.setViewportView(textarea_instructions);
        jscroll_instructions.setWheelScrollingEnabled(true);
        gbag_constrain_vertical2.anchor = GridBagConstraints.NORTH; 
        gbag_constrain_vertical2.fill = GridBagConstraints.BOTH;
        gbag_constrain_vertical2.weightx = 1; 
        gbag_constrain_vertical2.weighty = 1; 
        gbag_constrain_vertical2.gridwidth = 6; 
        gbag_constrain_vertical2.gridheight = 5; 
        gbag_constrain_vertical2.gridx = 2; 
        gbag_constrain_vertical2.gridy = 2; 
        this.add(jscroll_instructions, gbag_constrain_vertical2); 
    }
}
