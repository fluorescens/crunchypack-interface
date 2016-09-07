
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

public class Frame_3_r1 extends GFrame {
    private JTable table_frame3; 
    public Frame_3_r1(final int number_of_groups) {
        JLabel local_title = new JLabel("Assign images to Group");
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
        
        
        final String[] columnNames = {"Group  #", "Group name"};
     
        Object[][] data2 = new Object[number_of_groups][2];   
        for(int i = 0; i < number_of_groups; ++i) {
            data2[i][0] = i; 
        }
        
        
    JTable gtable = new JTable(data2, columnNames)
    {
           @Override 
           public boolean isCellEditable(int row, int column) 
           {
                if(column == 0) {
                    return false; 
                }
                else {
                    return true; 
                }
           }
    }; 
    gtable.putClientProperty("terminateEditOnFocusLost", true);
    gtable.setPreferredScrollableViewportSize(new Dimension(700, 270));
    gtable.setFillsViewportHeight(true);
    gtable.setRowHeight(30);
    gtable.getColumnModel().getColumn(0).setPreferredWidth(150);
    gtable.getColumnModel().getColumn(1).setPreferredWidth(1000);
    gtable.setFont(new Font("Courier", Font.PLAIN, 20));
    gtable.setBackground(Color.WHITE);
    
    JScrollPane scrolln = new JScrollPane(gtable);
    scrolln.setViewportView(gtable);
    scrolln.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    table_frame3 = gtable; 
    
        JPanel v_panel_8 = new JPanel();
    v_panel_8.add(scrolln); 
    v_panel_8.setBackground(Color.RED);
    GridBagConstraints v8 = new GridBagConstraints(); //container holding gridbag components
    v8.anchor = GridBagConstraints.SOUTH; 
    v8.fill = GridBagConstraints.BOTH; 
    v8.gridwidth = 4; 
    v8.gridheight = 5; 
    v8.weighty = 0.1; 
    v8.gridx = 3; 
    v8.gridy = 2; 
    this.add(v_panel_8, v8);
    
    
    JButton group_rules_help = new JButton("Rules: Assigning group names"); 
                group_rules_help.setFont(new Font("Courier",1, 16));
        GridBagConstraints giws = new GridBagConstraints(); //container holding gridbag components
        group_rules_help.setBackground(Color.WHITE); 
        giws.anchor = GridBagConstraints.NORTH;
        giws.weighty = 0.5; 
        giws.gridwidth = 2; 
        giws.gridheight = 1; 
        giws.gridx = 4; 
        giws.gridy = 7; 
	this.add(group_rules_help, giws);
        group_rules_help.addActionListener(new ActionListener() //exit
        {
          public void actionPerformed(ActionEvent e)
          {
              final String p_title = "Assigning group names."; 
              final String p_message = "A few rules about naming groups: \n \n"
                      + "A group name can be something simple like: "
                      + "black_rock, enemy car, a, 1, or a12# \n"
                      + "A good name should be related to all the images in the group. \n"
                      + "'black_helicopter' is the group that holds all our images of black helicopters. \n"
                      + "Group names must be unique. There cannot be two 'black_rock' groups, but there can be a 'black_rock1'. \n \n"
                      + "'none' CANNOT be used as a group name. It is a program reserved word."; 
              display_popup(p_title, p_message); 
          }
    });
        
    
        
        
        
    }
    
    public JTable getTable() {
        return table_frame3; 
    }
}
