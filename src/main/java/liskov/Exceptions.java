package liskov;

class Base {
  void doBaseStuff() /*throws Exception*/ { System.out.println("doBaseStuff"); }
}
class Sub extends Base {
  void doBaseStuff() /*throws Exception*/ { System.out.println("doSubStuff"); }
}

public class Exceptions {
  public static void main(String[] args) {
    Base b = new Sub();
    b.doBaseStuff();
  }
}
