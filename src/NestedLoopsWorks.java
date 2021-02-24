public class NestedLoopsWorks {

  public static void main(String[] args) {
    //nested loops works -
    /*for (int i = 1;i <= 4; i++) { // (outer for loop) this block will loop for 4 times

      System.out.println("outer loop started");

      for (int j=1; j <=4; j++) { //inner loop
        System.out.println("inner loop");
      }

      System.out.println("outer loop finished");

    }
      1 2 3 4
      5 6 7
      8 9
      10
     */
    //outer loop should run 4 times
    //each time decrement one number


    int k = 1; //here 4 after first outer loop and it take 4 ++ in next time
    //separately create one variable outside
    for (int i = 0;i < 4; i++) { // (outer for loop) this block will loop for 4 times

      //System.out.print("outer loop started");

      for (int j=1; j <=4-i; j++) { //inner loop
        System.out.print(k);
        System.out.print("\t");
        k++;
      }

      System.out.println("");

    }


    /* 1
    *  2 3
    *  4 5 6
    *  7 8 9 10 */

  }
}
