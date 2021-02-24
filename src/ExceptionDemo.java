import java.nio.channels.ScatteringByteChannel;

//one try can be followed by multiple catch blocks
//but after try block


public class ExceptionDemo {

  int a = 4;
  //3 lines -
  //try catch mechanism

  public static void main(String[] args) {

    int b = 7;
    int c = 0;

    try{
      //purchased failed
      /*int k = b/c;
        System.out.println(k);*/

      int arr[] = new int[5];
      System.out.println(arr[7]);
      }

    catch (ArithmeticException et) {

      System.out.println("I catch the arithmetic exception");
      //priority as specific
    }

    catch (IndexOutOfBoundsException ets) {

      System.out.println("I catch the IndexOutOfBounds exception");

    }

    catch(Exception e){ //Exception e for all kind of exceptions
      //execute instead error
      //retry again
      System.out.println("I catch the error/exception");


    }

    //use also for skip pop-ups because script should not fail

    finally {
      //This block is executed irrespectively of exception is thrown or not
      //Program executed successfully and if program doesn't run
      //Don't stop on exception catch
      //Only use when have try block

      //in the middle of application script code failed
      //browser.closed() in finally block
      //pr deleting the cookies even script code failed
      //pass or failed - it is going execute this block
      System.out.println("delete cookie");
      //for finally we also need not catch. will be error + executed finally block
      //stop JVM forcefully - only one case when finally block is not executed
    }

  }

}
