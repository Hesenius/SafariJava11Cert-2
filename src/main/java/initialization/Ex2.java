package initialization;

class Parent {
  Parent(int x) {
    // super();
    // INSTANCE INITIALIZERS!!!
    y += x;
    System.out.println("Child.y is " + Child.y);
  }
  static { System.out.println("x is " + Parent.x); }
  static int x = 99;
  int y = 100;
  { y++; System.out.println("y is " + y); }
}
class Child extends Parent {
  int x = 200;
  static int y = 300;
  static {
    System.out.println("Child y is " + y);
  }
  Child() { super(50
      /*this.x CANNOT USE this in super() or this()*/); }
  Child(int x) { this(/*this.x*/); }
  { System.out.println("x is " + x); }
  static { System.out.println("y is " + y); }
}

public class Ex2 {
  public static void main(String[] args) {
    System.out.println("Hello!");
    new Child(-1);
  }
}
