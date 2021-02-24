package InheritancePolymorphism;
//function overloading - same class have multiple methods
//with the same name
//different arguments number
//or argument data type should be different
public class childLevel extends childClassDemo{

  public void getData(int a) {
    System.out.println(a);
  }

  public void getData(String a) {
    System.out.println(a);
  }

  public void getData(int a, int b) {
    System.out.println(b);
  }

  public static void main(String[] args) {
    childLevel cl = new childLevel();
    cl.audioSystem();
    cl.getData(2);
    cl.getData("hello");
    cl.getData(2, 5);
  }

}
