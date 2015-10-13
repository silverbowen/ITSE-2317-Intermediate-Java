/* asg05 for ITSE 2317
 * Lambda version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Proj05Runner {
  
  public Proj05Runner() {
    
    JFrame jFrame = new JFrame("William Bowen");
    jFrame.setSize(200, 200);
    
    JButton jButton = new JButton("Quit");
    jFrame.add(jButton, "North");
    
    jFrame.add(new JPanel() {
      int x, y = 0;
      {addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
          x = e.getX();
          y = e.getY();
          repaint(); 
        }});
      }
      @Override
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("" + x + ", " + y, x, y);
      }
    }, "Center");
    
    jFrame.setDefaultCloseOperation(0);
    jFrame.setVisible(true);
    
    jButton.addActionListener(
        e ->  System.exit(0)
    );    
  }  
}