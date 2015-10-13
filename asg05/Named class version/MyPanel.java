/* asg05 for ITSE 2317
 * Named class version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel {
  
  int x, y = 0;
  
  @Override
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawString("" + x + ", " + y, x, y);
  }
  
}