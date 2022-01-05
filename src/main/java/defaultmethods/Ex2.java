package defaultmethods;

class Cl2 implements Int1 {
  public void doStuff() { System.out.println("Cl2.doStuff"); }
}

public class Ex2 {
  public static void main(String[] args) {
    new Cl2().doStuff();
  }
}
