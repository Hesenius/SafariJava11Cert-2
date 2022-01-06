package liskov;
class ABase {
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}
class ASub extends ABase {
//  @Override
  void doBaseStuff() { System.out.println("doSubStuff"); }
}
public class Accessibility {
}
