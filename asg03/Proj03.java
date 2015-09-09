//34567890123456789012345678901234567890123456789

/*File Proj03.java
************************************************/
import java.awt.*;
import javax.swing.JFrame;

public class Proj03{

  public static void main(String[] args){
    Proj03Runner <Frame> var1 =
        new Proj03Runner <>(new Frame("frame0"));
    var1.runIt();

    Proj03Runner <JFrame> var2 =
        new Proj03Runner <>(new JFrame(
                                     "jFrame0"));
    var2.runIt();
  }//end main
}//end class Proj03
//=============================================//
