/* asg08 for ITSE 2317
 * Lambda version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Proj08Runner extends JFrame {
  
  private JPanel numPanel = new JPanel();
  private JSlider jSlider = new JSlider();
  private JLabel jLabel = new JLabel("50");
  
  public Proj08Runner() {
    
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
    
    setSize(300, 100);
    setTitle("William Bowen");
    setVisible(true);
        
    add(numPanel, BorderLayout.PAGE_START);
    add(jSlider, BorderLayout.CENTER);
    
    numPanel.add(jLabel);
    
    jSlider.setMajorTickSpacing(10);
    jSlider.setMinorTickSpacing(5);
    jSlider.setPaintTicks(true);
    jSlider.setPaintLabels(true);
    
    jSlider.addChangeListener(e -> jLabel.setText("" + jSlider.getValue()));
  
  }
  
}