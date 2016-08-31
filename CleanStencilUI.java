/*
Entry point and top level frame namagement. 
 */
package cleanstencilui;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * @author jamesl
 */
public class CleanStencilUI {
    public final static int DEBUG_MODE = 1; 
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
        //create the cardmanager object to hold individual frames
        CardsManager c1 = new CardsManager();
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setLocationRelativeTo(null); 
        c1.pack();
        c1.setVisible(true);   
    }
}
