/*
Entry point and top level frame management. 
 */
package cleanstencilui;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Dimension; 

/*
 * @author jamesl
 */
public class CleanStencilUI {
    public final static int DEBUG_MODE = 0; 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable()
        {
          @Override
          public void run()
          {
            //GUI queue
            frame_manager(); 
          }
        });
    }
    
    static void frame_manager() {
        /*
        Create cardmanager object to contain the individual frames. 
        Define close operations
        */
        CardsManager c1 = new CardsManager();
        c1.setMaximumSize(new Dimension(1000,400));
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setLocationRelativeTo(null); 
        c1.pack();
        c1.setVisible(true);   
    }
}
