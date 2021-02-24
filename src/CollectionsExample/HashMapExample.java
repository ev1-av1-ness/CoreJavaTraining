package CollectionsExample;

import java.util.*;

public class HashMapExample {

  public static void main(String[] args) {
    HashMap <Integer, String> hm = new HashMap <Integer, String>();
    hm.put(0, "hello"); //will be one index
    hm.put(1, "goodbye");
    hm.put(42, "morning");
    hm.put(3, "evening");
    hm.get(2); //null
    hm.remove(42);
    Set sn = hm.entrySet();//each key and value will be store as in Set index
    //sn is the Set object
    Iterator it = sn.iterator(); //no type of value as String Integer what else



    //create hashtable -pass table set collections:key and values separate use iterator
    while (it.hasNext()) {
      //System.out.println(it.next()); //key + value in one string
      Map.Entry mp = (Map.Entry)it.next(); //divide key and value
      System.out.println(mp.getKey());
      System.out.println(mp.getValue());
    }

    //hashMap hashTable there is no difference in declare

    Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
    //hashMap hashTable what is the difference
    //hashMap is non synchronized and not thread safe
    //hashTable is synchronized and thread safe - completed task by one program, then by one
    //hashTable is needed to use in multi threading apps
    //hashTable is needed allows one null key and any number of null values
    //hashTable do not allow
    //hashMap values iterated by using iterator
    //hashMap values iterated by using enumerator



  }

}
