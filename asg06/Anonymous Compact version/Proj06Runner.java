/* asg06 for ITSE 2317
 * Lambda version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Proj06Runner extends Frame{
  
  int x, y = 0;
    
  @Override
  public void paint(Graphics g) {
    super.paint(g);
    g.drawString("" + x + ", " + y, x, y);
  }
  
  public Proj06Runner() {
    
    addMouseMotionListener(new MouseMotionAdapter() {
      
      @Override
      public void mouseDragged(MouseEvent e) {
        setForeground(Color.red);
        x = e.getX();
        y = e.getY();
        repaint();
      }
      
      @Override
      public void mouseMoved(MouseEvent e) {
        setForeground(Color.black);
        x = e.getX();
        y = e.getY();
        repaint();
      }
      
    });
    
    addWindowListener(new WindowAdapter() {
      
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
      
    });
    
    setTitle("William Bowen");
    setSize(300, 200);
    setVisible(true);
    
  }
  
}