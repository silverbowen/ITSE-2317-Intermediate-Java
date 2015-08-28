/* asg 01 for ITSE 2317
 * Author: William Bowen
 * per Prof instructions, 
 * comments are minimal
 */

import java.util.TreeSet;
import java.util.Collection;

class Proj01Runner
{
  Proj01Runner() // constructor prints name
  {
    System.out.println("William Bowen");
  } // end Proj01Runner constructor
  
  Collection<String> getCollection()
  { // instantiates and returns TreeSet<String> myTreeSet
    TreeSet<String> myTreeSet= new TreeSet<String>();
    return myTreeSet;
  } // end getCollection method
  
} // end Poj01Runner class