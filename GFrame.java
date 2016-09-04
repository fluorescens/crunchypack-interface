/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleanstencilui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

/**
 *
 * @author jamesl
 */
abstract public class GFrame extends JPanel{
    public static final int FHEIGHT = 500; 
    public static final int FWIDTH = 1100; 
    static Dimension fsize = new Dimension(FWIDTH, FHEIGHT); //minimum prefered size of a window
    
    public GFrame() {
         this.setLayout(new GridBagLayout()); //use this layout
         this.setBackground(Color.GRAY);
    GridBagConstraints gbag_constrain_dummy = new GridBagConstraints(); //container holding gridbag components

  
        //Dummy test alignment panels. 
	JPanel h_panel_1 = new JPanel();
        h_panel_1.setBackground(Color.RED);
        gbag_constrain_dummy.anchor = GridBagConstraints.NORTHWEST;
        gbag_constrain_dummy.anchor = GridBagConstraints.NORTH;
        gbag_constrain_dummy.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_dummy.weightx = 0.1; 
        gbag_constrain_dummy.gridx = 0; 
        gbag_constrain_dummy.gridy = 0; 
	this.add(h_panel_1, gbag_constrain_dummy);
        
        JPanel h_panel_2 = new JPanel();
        h_panel_2.setBackground(Color.GREEN);
        gbag_constrain_dummy.anchor = GridBagConstraints.NORTH;
        gbag_constrain_dummy.fill = GridBagConstraints.HORIZONTAL;  
        gbag_constrain_dummy.weightx = 0.1; 
        gbag_constrain_dummy.gridx = 1; 
        gbag_constrain_dummy.gridy = 0; 
	this.add(h_panel_2, gbag_constrain_dummy);
        
        JPanel h_panel_3 = new JPanel();
        h_panel_3.setBackground(Color.RED);
        gbag_constrain_dummy.anchor = GridBagConstraints.NORTH;
        gbag_constrain_dummy.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_dummy.weightx = 0.1; 
        gbag_constrain_dummy.gridx = 2; 
        gbag_constrain_dummy.gridy = 0; 
	this.add(h_panel_3, gbag_constrain_dummy);
        
        	JPanel h_panel_4 = new JPanel();
        h_panel_4.setBackground(Color.GREEN);
        gbag_constrain_dummy.anchor = GridBagConstraints.NORTH;
        gbag_constrain_dummy.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_dummy.weightx = 0.1; 
        gbag_constrain_dummy.gridx = 3; 
        gbag_constrain_dummy.gridy = 0; 
	this.add(h_panel_4, gbag_constrain_dummy);
        
        	JPanel h_panel_5 = new JPanel();
        h_panel_5.setBackground(Color.RED);
        gbag_constrain_dummy.anchor = GridBagConstraints.NORTH;
        gbag_constrain_dummy.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_dummy.weightx = 0.1; 
        gbag_constrain_dummy.gridx = 4; 
        gbag_constrain_dummy.gridy = 0; 
	this.add(h_panel_5, gbag_constrain_dummy);
        
        	JPanel h_panel_6 = new JPanel();
        h_panel_6.setBackground(Color.GREEN);
        gbag_constrain_dummy.anchor = GridBagConstraints.NORTH;
        gbag_constrain_dummy.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_dummy.weightx = 0.1; 
        gbag_constrain_dummy.gridx = 5; 
        gbag_constrain_dummy.gridy = 0; 
	this.add(h_panel_6, gbag_constrain_dummy);
        
        	JPanel h_panel_7 = new JPanel();
        h_panel_7.setBackground(Color.RED);
        gbag_constrain_dummy.anchor = GridBagConstraints.NORTH;
        gbag_constrain_dummy.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_dummy.weightx = 0.1; 
        gbag_constrain_dummy.gridx = 6; 
        gbag_constrain_dummy.gridy = 0; 
	this.add(h_panel_7, gbag_constrain_dummy);
        
        JPanel h_panel_8 = new JPanel();
        h_panel_8.setBackground(Color.GREEN);
        gbag_constrain_dummy.anchor = GridBagConstraints.NORTH;
        gbag_constrain_dummy.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_dummy.weightx = 0.1; 
        gbag_constrain_dummy.gridx = 7; 
        gbag_constrain_dummy.gridy = 0; 
	this.add(h_panel_8, gbag_constrain_dummy);
        
        JPanel h_panel_9 = new JPanel();
        h_panel_9.setBackground(Color.RED);
        gbag_constrain_dummy.anchor = GridBagConstraints.NORTH;
        gbag_constrain_dummy.fill = GridBagConstraints.HORIZONTAL;  
        gbag_constrain_dummy.weightx = 0.1; 
        gbag_constrain_dummy.gridx = 8; 
        gbag_constrain_dummy.gridy = 0; 
	this.add(h_panel_9, gbag_constrain_dummy);
        
        JPanel h_panel_10 = new JPanel();
        h_panel_10.setBackground(Color.GREEN);
        gbag_constrain_dummy.anchor = GridBagConstraints.NORTH;
        gbag_constrain_dummy.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_dummy.weightx = 0.1; 
        gbag_constrain_dummy.gridx = 9; 
        gbag_constrain_dummy.gridy = 0; 
	this.add(h_panel_10, gbag_constrain_dummy);
        

        this.setPreferredSize(fsize);
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
      
}
