/* asg07 for ITSE 2317
 * Anonymous class/Lambda version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Proj07Runner extends JFrame {  
  
  public Proj07Runner() {
    
    JButton lButton = new JButton("Left");
    JButton rButton = new JButton("Right");
    JLabel jLabel = new JLabel("Left");
 
    setLayout(new FlowLayout(FlowLayout.RIGHT));
    
    add(lButton);   
    add(jLabel);
    add(rButton);
    
    jLabel.setBackground(Color.yellow);
    jLabel.setForeground(Color.red);
    jLabel.setOpaque(true);
    
    addWindowListener(new WindowAdapter() {
      
      @Override
      public void windowClosing(WindowEvent e) { System.exit(0); }         
      
    });    
    
    lButton.addActionListener(e -> jLabel.setText("Left"));
    
    rButton.addActionListener(e -> jLabel.setText("Right"));
    
    setTitle("William Bowen");
    setSize(250, 100);
    setVisible(true);
  
  }
  
}