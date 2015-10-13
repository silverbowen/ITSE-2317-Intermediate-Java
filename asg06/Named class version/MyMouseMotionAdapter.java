/* asg06 for ITSE 2317
 * Named class version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;
import java.awt.event.*;

class MyMouseMotionAdapter extends MouseMotionAdapter {
 
  MyFrame ref;
  
  MyMouseMotionAdapter(MyFrame ref) {
    this.ref = ref;
  }
  
  @Override
  public void mouseDragged(MouseEvent e) {
    ref.setForeground(Color.red);
    ref.x = e.getX();
    ref.y = e.getY();
    ref.repaint();
  }
  
  @Override
  public void mouseMoved(MouseEvent e) {
    ref.setForeground(Color.black);
    ref.x = e.getX();
    ref.y = e.getY();
    ref.repaint();
  }
  
}