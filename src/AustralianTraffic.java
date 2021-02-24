public class AustralianTraffic implements CentralTraffic,ContinentalTraffic {

  public static void main(String[] args) {
    //for implementing interface
    //you should use all methods
    //if you want execute this method you need class object for it
    CentralTraffic a = new AustralianTraffic();
    ContinentalTraffic ct = new AustralianTraffic();

    a.redStop();
    a.flashYellow();
    a.greenGo();

    ct.trainSymbol();

    AustralianTraffic at = new AustralianTraffic(); //for walkingSymbol() using
    at.walkingSymbol();







  }
    //they out of psvm
  @Override
  public void greenGo() {
    //code
    System.out.println("greenGo implementation");
    //if you want execute this method you need class object for it
  }

  @Override
  public void redStop() {
    //code
    System.out.println("redStop implementation");
  }
//you cannot use this method through a object because it's not from Interface
  public void walkingSymbol() {
    System.out.println("walking");
  }

  @Override
  public void flashYellow() {
    //code
    System.out.println("flashYellow implementation");
  }

  @Override
  public void trainSymbol() {

  }
}
