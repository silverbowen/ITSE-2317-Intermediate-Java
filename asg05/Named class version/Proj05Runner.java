/* asg05 for ITSE 2317
 * Named class version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;
import javax.swing.*;

class Proj05Runner {
  
  public Proj05Runner() {
    
    JFrame jFrame = new JFrame("William Bowen");    
    MyPanel myPanel = new MyPanel();
    JButton jButton = new JButton("Quit");
    
    jFrame.setSize(200, 200);    
    jFrame.setDefaultCloseOperation(0);
    jFrame.setVisible(true);
    
    jFrame.add(jButton, "North");    
    jFrame.add(myPanel, "Center");
    
    jButton.addActionListener(new MyActionListener());
    
    myPanel.addMouseListener(new MyMouseListener(myPanel));
    
  }
  
}