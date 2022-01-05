package defaultmethods.sub1;
interface IntX {
//  default void doStuff() { System.out.println("IntX.doStuff()"); }
  void doStuff();
}
interface IntY {
  default void doStuff() { System.out.println("IntY.doStuff()"); }
}
class ClQ implements IntX, IntY {
  public void doStuff() {
//    IntX.super.doStuff();
    IntY.super.doStuff();
//    super.doStuff();
  }
}

public class Ex3 {
  public static void main(String[] args) {
    new ClQ().doStuff();
  }
}
