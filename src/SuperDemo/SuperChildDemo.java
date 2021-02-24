package SuperDemo;

public class SuperChildDemo extends SuperParentDemo {

  String name ="QAClickAcademy";

  public SuperChildDemo(){

    super();//invoke constructor of parent class, it should be the first line in child constructor
    System.out.println("child class constructor");
  }


  public void getStringData(){

    System.out.println(name);
    System.out.println(super.name); //it gets preference to the variable
    //from parent class
    //you need super. when in child class there is same name variable

    //what do you do with methods - common in the parent and child
  }

  public void getData(){

    super.getData();
    System.out.println("I am the child class");

  }



  public static void main(String[] args) {

    SuperChildDemo scd = new SuperChildDemo(); //constrictor is called here
    scd.getStringData(); //it gets preference to a local variable, child class
    scd.getData();

  }
}
