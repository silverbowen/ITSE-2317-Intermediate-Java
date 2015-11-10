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
  
  public Proj06Runner() {
    
    JFrame jFrame = new JFrame("William Bowen");
    jFrame.setSize(300, 200);
    
    jFrame.add(new JPanel() {
      
      int x, y = 0;
      
      {addMouseMotionListener(new MouseMotionAdapter() {
        
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
      
      }
      
      @Override
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("" + x + ", " + y, x, y);
      }
      
    }, "Center");
  
    jFrame.setVisible(true);
    
    jFrame.addWindowListener(new WindowAdapter() {
      
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
      
    });
  
  }

}