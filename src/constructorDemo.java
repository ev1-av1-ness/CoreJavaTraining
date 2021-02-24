public class constructorDemo {

  //create constructor
  //Default constructor without accepting any values
  public constructorDemo() {

      //will be auto executed when create object of class constructorDemo
    System.out.println("I am in the constructor");

  }

  //Parameterized constructor

  public constructorDemo(int a, int b) {

    System.out.println("I am a parameterized constructor");
    int c = a + b;
    System.out.println(c);
  }

  public constructorDemo(String str) {

    //will be auto executed when create object of class constructorDemo
    System.out.println(str);

  }


  public void getData(){

    System.out.println("I am the method");

  }




  public static void main(String[] args) {
    //constructor - block of code whenever an object is created
    //whenever you created an object of a class
    //automatically the block of code is executed

    //created as a method but constructor doesn't return any values
    //name of constructor should be same as class name

    constructorDemo cd = new constructorDemo(); //execute -> check is there constructor -> execute
    //constructor
    //whenever you create an object constructor is called
    //compiler will call implicit constructor default if you have not defined constructor block
    //have not define constructor

    //for Parameterized constructor you need pass parameters when call
    constructorDemo cd1 = new constructorDemo(4, 5);
    constructorDemo cd2 = new constructorDemo("hello");
  }
}
