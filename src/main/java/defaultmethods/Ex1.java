package defaultmethods;

interface Int1 {
  /*public */default void doStuff() {
    System.out.println("Int1.doStuff()");
  }
}
class Cl1 implements Int1 {
  public void doStuff() {
    System.out.println("Cl1.doStuff");
  }
}
public class Ex1 {
  public static void main(String[] args) {
    new Cl1().doStuff();
  }
}
