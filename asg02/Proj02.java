//34567890123456789012345678901234567890123456789

/*File Proj02.java
************************************************/
public class Proj02{

  public static void main(String[] args){
    Proj02Runner <String,Integer> varA =
        new Proj02Runner <>(
                      "abcde",new Integer(500));
    System.out.print(varA.get1());
    System.out.println("," + varA.get2());

    Proj02Runner <Integer,String> varB =
       new Proj02Runner <>(
                       new Integer(500),"abcde");
    System.out.print(varB.get1());
    System.out.println("," + varB.get2());
  }//end main
}//end class Proj02
//=============================================//


