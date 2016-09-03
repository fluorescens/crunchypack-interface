package cleanstencilui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/*
 * @author jamesl
 */
public class Frame_1 extends JPanel{
    //first frame displayed by the cardmanager. 
    //Contains a text area with usage information about the purpose of this program and how to navigate the interface.
     public static final int FHEIGHT = 500; 
     public static final int FWIDTH = 1100; 
     static Dimension fsize = new Dimension(FWIDTH, FHEIGHT); //minimum prefered size of a window
     
     
    public Frame_1() {
        //all frames are gridbag layout based
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
        
        
        //Title panel
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
        String DEBUG_instructions_data = "this\n\nshould\n\n\n\nscroll\n\n\nthis is the bottom"; 
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

        this.setPreferredSize(fsize);
    }
    
}
