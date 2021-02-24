public abstract class ParentAirCraft { //abstract class if have abstract method
  /*There is a parent class which defines Aircraft Body Construction rules
  All Child classes(Different Aircraft companies) have to inherit parent class and use those methods
  to build their own Aircraft
  But there is a method called Aircraft color which can be unique to every child class depending
  on their company logo

  So color method in parent class is not implemented with anybody. Instead only method is
  defined without any body which we call as Abstract method

  If there is any method in class which is Abstract, then the class will be treated as Abstract class

  Unlike Interfaces, this Abstract Class can have methods (Concrete) which have implementation as well.
  So, with Abstract class only partial Abstraction is achieved.

  Interface - all methods have no body

  Class which is declared with the abstract keyword is known as an abstract class in Java
  It can have abstract (method with out the body) and non-abstract methods (method with the body)

  Abstraction Classes achieves Partial Abstraction
  Interfaces on the other hand are used for 100% abstraction
  */
   void engine(){

     System.out.println("Follow Engine Guidelines");

   }

   void safetyGuidelines () { //if private -> no way to use it in inherited

     System.out.println("Follow Safety Guidelines");
   }

   abstract void bodyColor(); //abstract method

}
