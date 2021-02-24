public class FirstClass {

  //Methods
  //blocks in java class
  int a = 5;
  public void getData() {

    System.out.println("fgffg");
    //return 2;

  }
  //no methods in main block

  //void - return type of this method

  public static void main(String[] args) {
    //you can declare variables here, but use and execute code with it in methods
    System.out.println("ff");
    //create object of class
    //use methods with object of class in main block
    //variables also use with object of class
    FirstClass fn = new FirstClass(); //create object
    fn.getData();
    System.out.println(fn.a); //also call variable from class


    SecondClass sn = new SecondClass();
    sn.sendData();


  //String - it is one of the prebuilt classes
  //String literal defining
  String b = "hel/lo"; //it apply again
  //By creating object of the String
  String ab = new String("hello"); //object ab present all manipulations with this string hello
  //two different objects created
  //b
    System.out.println(b.charAt(2));
    System.out.println(b.indexOf("e"));
    System.out.println(b.substring(1,3));
    System.out.println(b.substring(3));
    System.out.println(b.concat("rahul"));
    b.length();
    b.trim(); //without spaces
    String[] arr = b.split("/");
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(b.replace("e", "n"));
  }


}
