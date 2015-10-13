/* asg06 for ITSE 2317
 * Named class version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;

class Proj06Runner extends Frame {
  
  int x, y = 0;  
  
  public Proj06Runner() {
    
    setTitle("William Bowen");
    setSize(300, 200);
    setVisible(true);
    
    addWindowListener(new MyWindowAdapter());
    
    addMouseMotionListener(new MyMouseMotionAdapter(this));
  } 
  
  @Override
  public void paint(Graphics g){
    g.drawString("" + x + ", " + y, x, y);
  }
  
}