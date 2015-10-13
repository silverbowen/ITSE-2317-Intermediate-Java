/* asg05 for ITSE 2317
 * Named class version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;
import java.awt.event.*;

class MyMouseListener extends MouseAdapter{
  
  MyPanel ref;
  
  MyMouseListener(MyPanel ref){
    this.ref = ref;
  }
  
  @Override
  public void mousePressed(MouseEvent e){
    
    ref.x = e.getX();
    ref.y = e.getY();
     
    ref.repaint(); 

  }
}