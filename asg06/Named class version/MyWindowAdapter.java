/* asg06 for ITSE 2317
 * Named class version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */
 
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
  
  @Override
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  } 
  
}