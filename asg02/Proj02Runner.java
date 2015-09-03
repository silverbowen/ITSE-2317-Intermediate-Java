/* asg 02 for ITSE 2317
 * Author: William Bowen
 * per Prof instructions, 
 * comments are minimal
 */

public class Proj02Runner <X, Y>{ // parameterized class
    
  private static String flip = "abcde";
  
  private void flop(){
    if (flip == "500")
      flip = "abcde";
    else
      flip = "500";
  }// end flop method

  public Proj02Runner (X x, Y y) {} // end constructor
  
  public String get1() {
    return "William Bowen\n"+flip;
  }// end get1 method
  
  public String get2() {
    flop();
    return flip;
  }// end get2 method
  
}// end Poj02Runner class