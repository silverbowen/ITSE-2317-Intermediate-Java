/* asg05 for ITSE 2317
 * Named class version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import javax.swing.*;

class Proj05Runner {
  
  public Proj05Runner() {
    
    JFrame jFrame = new JFrame("William Bowen");
    jFrame.setSize(200, 200);
    
    JButton jButton = new JButton("Quit");
    jFrame.add(jButton, "North");
    
    MyPanel myPanel = new MyPanel();
    jFrame.add(myPanel, "Center");
        
    jFrame.setDefaultCloseOperation(0);
    jFrame.setVisible(true);
    
    jButton.addActionListener(new MyActionListener());
    
    myPanel.addMouseListener(new MyMouseListener(myPanel));

  }
  
}