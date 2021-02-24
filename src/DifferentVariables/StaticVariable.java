package DifferentVariables;

public class StaticVariable {

  String name;
  String address;
  static String city; //common for all objects and doesn't change
  //belongs to class
  //all static variables = class variables
  //instance variables
  //it updated after creating new object
  //changes from object to object
  static int i;
  static {
    city = "SPb";
    i = 0;
  }



  int j = 0; //have no access to change, just use again if create and call object

  StaticVariable(String name, String address){
  //assign these local variables to instance variables
    this.name = name; //then Liza become instance name (up)
    this.address = address; //send it from object through constructor on instance (up)
    i++;
    System.out.println(i);
    j++;
    System.out.println(j);
  }

  public void getAddress() {
    System.out.println(address + " " + city); //instance variables because constructor
  }

  public static void getCity(){ //you should use only static variable inside
    System.out.println(city);


  }


  public static void main(String[] args) {
    StaticVariable obj = new StaticVariable("Liza", "Nevsky");//1
    StaticVariable obj1 = new StaticVariable("Dasha", "Dostoevsky");//2 because sharing
    obj.getAddress(); //in method saving some memory because city static and use inside method from
    //class lvl
    obj1.getAddress();

    //static variables and methods allow to call just by class name
    StaticVariable.getCity();
    StaticVariable.i = 4;
    obj.address = "Moscow";
  }


}
