/* asg05 for ITSE 2317
 * Named class version
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyMouseListener extends MouseAdapter{
  
  @Override
  public void mousePressed(MouseEvent e){
    
    ((Proj05Runner)e.getComponent()).x = e.getX();
    ((Proj05Runner)e.getComponent()).y = e.getY();
 
    ((Proj05Runner)e.getComponent()).repaint(); 

  }
}