public class WhileDemo {
  public static void main(String[] args) {

    int i = 0;

    while (i<=10) {

      System.out.println(i);
      i++; //чтобы хоть что-то менялось, а то будет одно значение i
      //till the 10

    }

    int l = 10;

    while (l>=0) {

      System.out.println(l);
      l--;
      //till the 0

    }

    int j = 20;

    do {

      System.out.println(j);
       j++;
    } while (j > 30);


  }
}
