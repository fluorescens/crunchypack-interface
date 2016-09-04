
package cleanstencilui;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

/*
 * @author jamesl
 */
public class CardsManager extends JFrame{
    //the one and only cards object that holds the panel components and provides navigation. 
     static private JPanel cardPanel; //the  holder for all the subpanels
     private int currentCard = 1; //the starting identifer
     private static CardLayout cards; //the one and only cards object

     
     
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
            //Frame_2 jp2 = new Frame_2(); 
            //Frame_3 far_ref; 
            cardPanel.add(jp1, "1"); //panel, indeitifer
            //cardPanel.add(jp2, "2"); 
                                    
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
     
     
     public void ui_teardown() {
         this.setVisible(false);
     }
}
