package CollectionsExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

  public static void main(String[] args) {
    //Set Interface
    //Three classes
    //does not accept duplicate values
    //add the same item into card - use ArrayList
    //there is no guarantee elements stored in sequential order, they may store
    //in the random order

    HashSet <String> hs = new HashSet <String>();
    //no get/add/remove by index
    hs.add("USA");
    hs.add("UK");
    hs.add("INDIA");
    hs.add("he");
    hs.add("she");
    System.out.println(hs); //no duplicates

    //Iterator Interface for HashSet

    Iterator <String> i = hs.iterator();
    //i.next(); //it goes to the first index
    //i.next();
    while(i.hasNext()){
      System.out.println(i.next());
    }


  }


}
