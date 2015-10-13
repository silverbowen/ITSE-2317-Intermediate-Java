/* asg06 for ITSE 2317
 * Named class version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;

class MyFrame extends Frame {
  
  int x, y = 0;
  
  @Override
  public void paint(Graphics g) {
    g.drawString("" + x + ", " + y, x, y);
  }
  
}