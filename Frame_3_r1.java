/*
Frame 3 displays the group names table and contains the internal group table object
*/
package cleanstencilui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 


/**
 *
 * @author jamesl
 */

public class Frame_3_r1 extends GFrame {
    private JTable table_frame3; //the internal table object that holds group names
    public Frame_3_r1(final int number_of_groups) {
        JLabel local_title = new JLabel("Choose Group Names");
        local_title.setFont(new Font("Courier",1, 30));
        local_title.setForeground(Color.WHITE);
        JPanel title_panel = new JPanel();
        GridBagConstraints gbag_constrain_title = new GridBagConstraints(); //container holding gridbag components
        title_panel.setBackground(Color.BLUE);
        gbag_constrain_title.anchor = GridBagConstraints.NORTH;
        gbag_constrain_title.fill = GridBagConstraints.HORIZONTAL; 
        gbag_constrain_title.weighty = 0.5; 
        gbag_constrain_title.gridwidth = 10; 
        gbag_constrain_title.gridheight = 1; 
        gbag_constrain_title.ipady = 10; 
        gbag_constrain_title.gridx = 0; 
        gbag_constrain_title.gridy = 1; 
        title_panel.add(local_title); 
	this.add(title_panel, gbag_constrain_title);
        
        
        final String[] columnNames = {"Group  #", "Group name"};
     
        Object[][] table_group_data = new Object[number_of_groups][2];   
        for(int i = 0; i < number_of_groups; ++i) {
            table_group_data[i][0] = i; 
        }
        
        
    JTable group_table = new JTable(table_group_data, columnNames)
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
    group_table.putClientProperty("terminateEditOnFocusLost", true);
    group_table.setPreferredScrollableViewportSize(new Dimension(900, 270));
    group_table.setFillsViewportHeight(true);
    group_table.setRowHeight(30);
    group_table.getColumnModel().getColumn(0).setPreferredWidth(150);
    group_table.getColumnModel().getColumn(1).setPreferredWidth(1000);
    group_table.setFont(new Font("Courier", Font.PLAIN, 20));
    group_table.setBackground(Color.WHITE);
    
    JScrollPane table_group_scrollpane = new JScrollPane(group_table);
    table_group_scrollpane.setViewportView(group_table);
    table_group_scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    table_frame3 = group_table; 
    
        JPanel panel_group_table = new JPanel();
    panel_group_table.add(table_group_scrollpane); 
    panel_group_table.setBackground(Color.GRAY);
    GridBagConstraints gbag_constrain_group_table = new GridBagConstraints(); //container holding gridbag components
    gbag_constrain_group_table.anchor = GridBagConstraints.NORTH; 
    gbag_constrain_group_table.fill = GridBagConstraints.VERTICAL; 
    gbag_constrain_group_table.gridwidth = 5; 
    gbag_constrain_group_table.gridheight = 7; 
    gbag_constrain_group_table.weighty = 0.9; 
    gbag_constrain_group_table.gridx = 3; 
    gbag_constrain_group_table.gridy = 2; 
    this.add(panel_group_table, gbag_constrain_group_table);
    
    
    JButton group_rules_help = new JButton("Rules: Assigning group names"); 
                group_rules_help.setFont(new Font("Courier",1, 16));
        GridBagConstraints gbag_constrain_group_rules = new GridBagConstraints(); //container holding gridbag components
        group_rules_help.setBackground(Color.WHITE); 
        gbag_constrain_group_rules.anchor = GridBagConstraints.NORTHWEST;
        gbag_constrain_group_rules.weighty = 0.5; 
        gbag_constrain_group_rules.gridwidth = 2; 
        gbag_constrain_group_rules.gridheight = 1; 
        gbag_constrain_group_rules.gridx = 7; 
        gbag_constrain_group_rules.gridy = 9; 
	this.add(group_rules_help, gbag_constrain_group_rules);
        group_rules_help.addActionListener(new ActionListener() //exit
        {
          public void actionPerformed(ActionEvent e)
          {
              final String title_group_help = "Assigning group names."; 
              final String text_group_help = "A few rules about naming groups: \n \n"
                      + "A group name can be something simple like: "
                      + "black_rock, enemy car, a, 1, or a12# \n"
                      + "A good name should be related to all the images in the group. \n"
                      + "'black_helicopter' is the group that holds all our images of black helicopters. \n"
                      + "Group names must be unique. There cannot be two 'black_rock' groups, but there can be a 'black_rock1'. \n \n"
                      + "'none' CANNOT be used as a group name. It is a program reserved word."; 
              display_popup(title_group_help, text_group_help); 
          }
    });
        
    
        
        
        
    }
    
    public JTable getTable() {
        //return Frame 3's internal table object of group names
        return table_frame3; 
    }
}
