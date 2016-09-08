/*
A custom extended class of JTable that provides dropdown box functionality on its columns
 */

package cleanstencilui;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

/**
 *
 * @author JamesH
 */
public class ComboTable extends JPanel{
        private final Object[][] table_data; //keeps track of the data in the table. 
        private final Object[] column_names; //names of table columns
        private final ArrayList<Object> combo_names; //things to put into the combobox
        private final int item_count; //number of images
        private JScrollPane table_scrollpane; 
        private final int[] locked_for_edit; 
        
        public ComboTable(Object[][] tabdata, 
                Object[] colnames, ArrayList<Object> combo_source, 
                int dat_itemn, int dropcol, int edit_lock[]) {
            
            table_data = tabdata; //the default data is passed from outside. 
            column_names = colnames; 
            combo_names = combo_source; 
            item_count = dat_itemn; 
            locked_for_edit = edit_lock; 
           
            JTable table = new JTable(new MyTableModel()); //makes a new jtable with overriden functions
            table.putClientProperty("terminateEditOnFocusLost", true); //terminate edit on click away
            table.setFont(new Font("Courier", Font.PLAIN, 20));
            //table.setPreferredSize(new Dimension(700, 150));
            table.getColumnModel().getColumn(0).setMaxWidth(100);
            table.setRowHeight(30);
            table.setPreferredScrollableViewportSize(new Dimension(800, 200)); 
            table.setFillsViewportHeight(true);

            //set up the combo cell. 
            comboBoxSetup(table, table.getColumnModel().getColumn(dropcol));
            
            JScrollPane scrollPane = new JScrollPane(table); 
            this.add(scrollPane); 
        };
        
       
        
        private void comboBoxSetup(JTable table, TableColumn dropdown) {
            //passed the table, and the information about the column that contains the combo table
            //Set up the editor for the sport cells.
            JComboBox comboBox = new JComboBox();
            for(int i = 0; i < combo_names.size(); ++i) {
               comboBox.addItem(combo_names.get(i)); //add the names in groups to the combobox
            }
            dropdown.setCellEditor(new DefaultCellEditor(comboBox)); //set column default editor to combobox
            //Set up tool tips for the rendering sport cells.
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setToolTipText("Click for combo box");
            dropdown.setCellRenderer(renderer);
        }
        
        public Object retrieve_table_value(int row, int col) {
            //return the data at a ComboTable index
            return table_data[row][col]; 
        }
        
        class MyTableModel extends AbstractTableModel {
            //override the return methods to use the custom ComboTable behavior
            @Override
            public int getColumnCount() {
                return column_names.length;
            }

            @Override
            public int getRowCount() {
                return item_count;
            }

            @Override
            public String getColumnName(int col) {
                return column_names[col].toString();
            }

            @Override
            public Object getValueAt(int row, int col) {
                return table_data[row][col];
            }


            @Override
            public Class getColumnClass(int c) {
                return getValueAt(0, c).getClass();
            }


            @Override
            public boolean isCellEditable(int row, int col) {
                //Note that the data/cell address is constant,
                //no matter where the cell appears onscreen.
                for(int i = 0; i < locked_for_edit.length; ++i) {
                    if(col == locked_for_edit[i]) {
                        return false; 
                    }
                    else {
                        return true; 
                    }
                }
                return true; 
            }

            @Override
            public void setValueAt(Object value, int row, int col) { 
                table_data[row][col] = value;
                fireTableCellUpdated(row, col); //notifies listeners up change
            }
    }
}
