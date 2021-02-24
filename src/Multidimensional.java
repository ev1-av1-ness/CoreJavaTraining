public class Multidimensional {

  public static void main(String[] args) {
    //matrix 3x3
    //row then column
    int a[][] = new int[2][3];
    a[0][0] = 2;
    a[0][1] = 4;
    a[0][2] = 5;
    a[1][0] = 3;
    a[1][1] = 4;
    a[1][2] = 7;
    System.out.println(a[1][0]);

    int b[][] ={{2,4,5},{3,4,7}};
    //2 4 5
    //3 4 7

    for(int i=0;i<2;i++) { //row in every of two rows

      for(int j=0;j<3;j++) {  //column every 3 values of column - 3 times for every of two rows

        System.out.println(a[i][j]);

      }
    }

    // 3x3 matrix
    //2 4 5
    //3 4 7
    //1 2 9

  }

}

