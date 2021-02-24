public class StringDemo {

  public static void main(String[] args) {
    String a = "hello"; //reference for the same object as literals
    String b = "hello";
    a.concat("sdjgsj");
    System.out.println(a);
    //new meaning
    String s = a.concat("sdjgsj");
    //same content in the string - only one memory objects
    String s1 = new String("hello"); //String class create new object every time
    //in memory
    String s2 = new String("hello");
    //compare content

    System.out.println(a.equals(b)); //true
    System.out.println(a==b); //true //reference the object. a and b refering at the same object
    System.out.println(a.equals(s1)); //equals operator checks for content  true
    System.out.println(a==s1); //fail matching the references ==
    System.out.println(s1==s2);

    //StringBuffer and StringBuilder classes - mutable
    StringBuffer sb = new StringBuffer("hello");
    sb.append("world");
    System.out.println(sb); //helloworld - modify existing value only
    sb.insert(2, "She"); //heShelloworld
    System.out.println(sb);
    sb.replace(5,7,"aa"); //heSheaaoworld
    System.out.println(sb);
    sb.deleteCharAt(12); //heSheaaoworl
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);

    //StringBuilder is not thread safe, it is non synchronized, it is faster
    //много программ может изменять значение строки в тестах
    //for parallel testing should use StringBuffer

  }

}
