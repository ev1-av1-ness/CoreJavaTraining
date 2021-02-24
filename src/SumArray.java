public class SumArray {


  public static void main(String[] args) {


    int[] checkBalance = {1,4,3,5,7};


    int sum1 = 0;
    int sum2 = 0;
    for( int i : checkBalance) {
      sum1 += i;

      for( int k : checkBalance) {
        sum2 += k;

    }

      System.out.println(sum1);
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println(sum2);

      //System.out.println(sum1);
    //System.out.println(sum2);

      /*if (sum1 == sum2)
      {
        System.out.println(true);
      }
      else
      {
        System.out.println(false);

      }*/


    }


  }
}
