public class PyramidWhIncrease {
  public static void main(String[] args) {


    int k = 1;
    for (int i = 1;i < 5;i++){ //мы хотим, чтобы все началось с 1

      for (int j = 1;j<=i;j++) {
        System.out.print(k);
        System.out.print("\t");
        k++;
      }

      System.out.println("");


    }


    for (int i = 1;i < 5;i++){ //мы хотим, чтобы все началось с 1
      //только когда пройдет шаг, тогда увеличивает

      for (int j = 1;j<=i;j++) {

        System.out.print(j);
        System.out.print("\t");

      }

      System.out.println("");


    }




  }
}
