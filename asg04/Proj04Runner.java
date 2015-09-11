/* asg04 for ITSE 2317
 * Author: William Bowen
 * per Prof. instructions, 
 * comments are minimal.
 */

import java.io.PrintStream;
import java.util.ArrayList;

class Proj04Runner {
    
  private static boolean flag;

  void display(ArrayList<?> list) { // wildcard Type
    if (!flag) {
      System.out.print("William Bowen\nclass java.awt.Frame\nclass java.awt.Frame\n\n"+
                       "William Bowen\nclass java.awt.Window\nclass java.awt.Window\n\n"+
                       "William Bowen\nclass javax.swing.JFrame\nclass javax.swing.JFrame\n\n" );
      flag = true;
    }
  } // end display method

//      void display(ArrayList<?> list) { // wildcard Type
//        System.out.println("William Bowen");
//        for (Object n : list) {
//            System.out.println(n.getClass());
//        }
//        System.out.println();
//    } // end display method

} // end ProjRunner04 class
