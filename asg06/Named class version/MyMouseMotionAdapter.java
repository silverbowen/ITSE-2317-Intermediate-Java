/* asg06 for ITSE 2317
 * Named class version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;
import java.awt.event.*;

class MyMouseMotionAdapter extends MouseMotionAdapter {
  
  @Override
  public void mouseDragged(MouseEvent e) {
    e.getComponent().setForeground(Color.red);
    ((MyFrame)e.getComponent()).x = e.getX();
    ((MyFrame)e.getComponent()).y = e.getY();
    e.getComponent().repaint();
  }
  
  @Override
  public void mouseMoved(MouseEvent e) {
    e.getComponent().setForeground(Color.black);
    ((MyFrame)e.getComponent()).x = e.getX();
    ((MyFrame)e.getComponent()).y = e.getY();
    e.getComponent().repaint();
  }
  
}