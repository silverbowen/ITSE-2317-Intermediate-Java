//34567890123456789012345678901234567890123456789

/*File Proj04.java
************************************************/
import java.util.ArrayList;
import java.awt.Window;
import java.awt.Frame;
import javax.swing.JFrame;

public class Proj04{
  public static void main(String[] args){

    Frame frame0 = new Frame("Frame0");

    ArrayList <Frame> listA = new ArrayList<>();
    listA.add(frame0);
    listA.add(new Frame("Frame1"));
    new Proj04Runner().display(listA);

    ArrayList<Window> listB = new ArrayList<>();
    listB.add(new Window(frame0));
    listB.add(new Window(frame0));
    new Proj04Runner().display(listB);

    ArrayList<JFrame> listC = new ArrayList<>();
    listC.add(new JFrame("JFrame0"));
    listC.add(new JFrame("JFrame1"));
    new Proj04Runner().display(listC);

  }//end main
}//end class Proj04
//=============================================//

