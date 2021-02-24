public class sortArrayDemo {

  public static void main(String[] args) {
    int a[] = {2,6,1,4,9};
    int temp;

    //1 2 4 6 9

    //sort in increase value

    for(int i=0;i<a.length;i++) { //if i = 0, compare with f var s var th var forth var

      for(int j=i+1;j<a.length;j++) {

        if(a[i]>a[j]) { //number that you get for comparison

          //swap
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;

        }



      }


    }

    for (int i=0;i<5;i++) {

      System.out.println(a[i]);

    }

    int b = 5;
    int c = 4;

    //Basket A apple
    //Basket B orange

    //Basket C apple

    //Basket A
    //Basket B orange

    //Basket A orange
    //Basket B

    //Basket A orange
    //Basket B apple

    /*int temp2;
    temp2 = b; //первую освобождаем
    b=c; //в первую записываем вторую
    c = temp2;//перезапишем во вторую то, что мы забрали из первой
    System.out.println(b);
    System.out.println(c); */

    //Swap without variable
    b = b + c; //b = 9;
    c = b - c; //c = 5;
    b = b - c; //b = 4;
    //b = 4; c = 5;
    System.out.println(b);
    System.out.println(c);
    }

}
