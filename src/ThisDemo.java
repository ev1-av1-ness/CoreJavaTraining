public class ThisDemo {

  int a = 2;

  public void getData(){

    int a = 3; //for spec method you use a as 3, local variable
    int b = a + this.a;
    System.out.println(a);
    //this refers to current object
    //class scope on the class lvl not the object lvl
    System.out.println(this.a);
    System.out.println(b);
  }




  public static void main(String[] args) {

    ThisDemo td = new ThisDemo();
    td.getData();


  }


}
