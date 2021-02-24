package CollectionsExample;

import java.util.ArrayList;

public class ArrayListExample {
/*Java collections framework is a collection of interfaces and classes
* - List
* can have duplicates
* you can access and insert any value in any index
*
*
* classes:
* ArrayList
* LinkedList
* Vector
* Implementing List interface
*
* use methods in these classes
*
* - Set
* cannot have duplicates
*
* classes:
* HashSet
* LinkedHashSet
* TreeSet
*
* use methods in these classes
*
* - Map
* cannot have duplicates
* map is an object that maps keys to values
*
*
*classes:
* HashMap
* TreeMap
* LinkedHashMap
*
* use methods in these classes
*
* */

  public static void main(String[] args) {

    //ArrayList methods
    //Array and ArrayList
    //dynamic size - increase/decrease
    //add not only as sequence, anyway!

    ArrayList <String> a = new ArrayList <String>();
    a.add("rahul");
    a.add("java");
    a.add("java");
    System.out.println(a);
    a.add(0,"student");
    System.out.println(a);
    /*a.remove(2);
    a.remove("rahul");
    System.out.println(a);*/
    System.out.println(a.get(1));
    //testing is present or not?
    System.out.println(a.contains("testing"));
    a.indexOf("rahul");
    a.isEmpty();
    a.size();

  }

  //public private protected default
  //Default: access method anywhere in package
  void abc() {
    System.out.println("hello");

  }
  //if there is no public, no import! in other package you cannot even import

  //Public: anywhere




}
