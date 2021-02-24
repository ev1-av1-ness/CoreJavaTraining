public class ChildEmirates extends ParentAirCraft{

  public static void main(String[] args) {

    ChildEmirates c = new ChildEmirates(); //all parent's methods
    // + overriden method from abstract class parent
    c.engine();
    c.safetyGuidelines();
    c.bodyColor();
    //We cannot instantiate object for Abstract class. Child classes are forced to implement
    //Abstract methods of Parent class

    /* Interface
    * 1) Interface contains only abstract methods
    * 2) Access Specifiers for methods in interface must be public
    * 3) Variables defined must be public static final
    * 4) To implement an interface we use implements keyword
    *
    * Abstract Class
    * 1) Abstract class can contain abstract methods , concrete methods or both
    * 2) Except private we can have any access specifier for methods in abstract class
    * 3) Except private variables can have any access specifiers
    * 4) To implement an abstract class we use extends keyword
    *
    *
    * */


  }

  @Override
  void bodyColor() {
    System.out.println("Red color on the body");
  }
}
