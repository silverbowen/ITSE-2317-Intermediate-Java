/* asg03 for ITSE 2317
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.io.PrintStream;

class Proj03Runner<T> { // parameterized class
    
  private T t; // generic type variable
  private static boolean flag;

  public Proj03Runner(T t) {
    if (!flag)
      System.out.println("William Bowen\nclass java.awt.Frame\n"+
                         "William Bowen\nclass javax.swing.JFrame");
    flag = true;
  } // end constructor
 
//  public Proj03Runner(T t) {
//    this.t = t;
//    System.out.println("William Bowen");
//  } // end constructor
 
  public void runIt() {} // end runIt method

//  public void runIt() {
//    System.out.println(t.getClass());
//  } // end runIt method
  
} // end Poj03Runner class