package InheritancePolymorphism;

public class childClassDemo extends parentClassDemo {

  public void audioSystem() {
    System.out.println("new audio child"); //overriding method from parent class
    //and when we call him through object of this class we call childclass notation
  }

  public void engine() {
    System.out.println("engine code is implemented");
  }

  public void colour() {
    System.out.println(colour);
  }

  public static void main(String[] args) {

    childClassDemo cd = new childClassDemo();
    cd.colour();
    cd.brakes();
    cd.audioSystem(); //from parent class
    //function overriding - both have method same name, same signature, same parameters
  }


}
