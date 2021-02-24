public class FinalDemo {//if class final - he cannot be a parent, override it
  //final class FinalDemo
  final void getData() {

    //parent and subchild class we can not do it - override
    //final
    //public
    //private
    //protected
    //default
  }

  public static void main(String[] args) {

    final int i = 4; //you can not change this value again
    //constant variables

  }
  //package - set of classes and interfaces
  //java.lang - arrays, integer here, it's default without mention
  //java.util - we need write this  --> collections
  //java.io - file reading
  //Class A can use Class B directly by creating object
  // if both Class A and Class B belongs to
  //same package
  //if it is different package --> import class through import packagename.class


  /* real time scenario
  * payment page you have to click on buyclass after enter in
  * - payment package
  *
  * import payment.buy
  *
  * there is buy class to handle for coupons
  * - coupon package
  *
  * import coupon.buy
  *
  *
  * And there is no conflict between same classes in different packages
  * */

}
