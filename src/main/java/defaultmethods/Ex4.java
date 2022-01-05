package defaultmethods;

interface IntA {
  default void doStuff() {}
}

//abstract class IntB implements IntA {
//  public abstract void doStuff();
//}

interface IntB extends IntA {
  void doStuff();
}

class C implements IntB {
  @Override
  public void doStuff() {
// NOPE, the intervening abstract COMPLETELY HIDES
// the default method, cannot use it anyway, anyhow
//    IntA.super.doStuff();
  }
}

public class Ex4 {
}
