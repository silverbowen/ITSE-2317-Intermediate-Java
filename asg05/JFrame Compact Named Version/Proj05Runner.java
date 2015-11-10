/* asg05 for ITSE 2317
 * Named class version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;
import javax.swing.*;

class Proj05Runner extends JFrame {
  
  int x, y = 0;
  
  public Proj05Runner() {
    
    setTitle("William Bowen");
    setSize(200, 200);
    
    JButton jButton = new JButton("Quit");
    add(jButton, "North");
    
    setDefaultCloseOperation(0);
    setVisible(true);
    
    jButton.addActionListener(new MyActionListener());
    
    addMouseListener(new MyMouseListener());
    
  }
  
  @Override
  public void paint(Graphics g) {
    
    super.paint(g);
    g.drawString("" + x + ", " + y, x, y);
    
  } 
}