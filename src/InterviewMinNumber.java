public class InterviewMinNumber {

  // 3x3 matrix
  //2 4 5
  //3 4 7
  //1 2 9


  public static void main(String[] args) {

    int abc[][] ={{2,4,5},{3,4,7},{1,2,9}};
    int min = abc[0][0];

    for(int i=0;i<3;i++) { //row in every of two rows

      for(int j=0;j<3;j++) {  //column every 3 values of column - 3 times for every of two rows

        if(abc[i][j] < min) { //min then 2

            min = abc[i][j]; //then min = that number

        }
      }
    }
    System.out.println(min);


    int abcd[][] ={{2,4,5},{3,4,7},{1,2,9}};
    int max = abc[0][0];

    for(int i=0;i<3;i++) { //row in every of two rows

      for(int j=0;j<3;j++) {  //column every 3 values of column - 3 times for every of two rows

        if(abc[i][j] > max) { //max then 2

          max = abc[i][j]; //then max = that number

        }
      }
    }
    System.out.println(max);

    //in which row min number?
    //same column (in that column) max number here

    //2 4 5
    //3 2 10
    //1 2 0
    //output = 4
    //Step 1: find the min number
    //Step 2: identify column of min number
    //Step 3: find the maximum number in identified column
    int c[][] ={{2,4,5},{3,2,10},{1,2,0}};
    int minimum = c[0][0];
    int mincolumn = 0;


    for(int i=0;i<3;i++) { //row in every of two rows

      for(int j=0;j<3;j++) {  //column every 3 values of column - 3 times for every of two rows

        if(c[i][j] < minimum) { //min then

          minimum = c[i][j]; //then min = that number
          mincolumn = j;
        }

      }

    }
    //1 column
    int maximum = c[0][mincolumn]; //путешествуем внутри колонны //get 5 as the first
    int k = 0; //порядок числа в колонне
    while (k < 3) {

      if(c[k][mincolumn]>maximum){ //only changes row // [k=0][0] > maximum 5]

        maximum = c[k][mincolumn];

      }
      k++;

    }
    System.out.println(maximum);
  }


}
