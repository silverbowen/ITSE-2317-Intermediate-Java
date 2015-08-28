//34567890123456789012345678901234567890123456789012345678
/*File Proj01 Copyright 2013 R.G.Baldwin
--------------------------------------------------------*/
import java.util.Collection;
import java.util.Iterator;

public class Proj01{
  public static void main(String args[]){
    Proj01Runner runner = new Proj01Runner();

    Collection <String> collection =
                                   runner.getCollection();

    collection.add("Able");
    collection.add("aBle");
    collection.add("Baker");
    collection.add("Charley");
    collection.add("Baker");

    Iterator <String> iter = collection.iterator();
    while(iter.hasNext()){
      System.out.print(iter.next() + " ");
    }//end while loop
    System.out.println();
  }//end main()
}//end class Proj01

