package initialization;

class Q25Base {
  /*
  Q25Base() { // default constructor created IFF no constructor
              // in the text
      super(); // object
  }
   */
//  private Q25Base() {}
//  Q25Base(int x) {}
  int x = 99;
  {
    System.out.println("x is " + x);
  }
}
class Q25Sub extends Q25Base {
  Q25Sub(int x) {
    // if we use super explicitly, it must be first
    // super(); -- created IFF neither super, nor this in text
    System.out.println("in constructor, x is " + x);
  }
  Q25Sub(String s) {
    this(99); // no call to super!!! -- also must be first!
  }
  public static void go() { new Q25Sub(1); }
}

public class Ex1 {
  public static void main(String[] args) {
    Q25Sub.go();
  }
}
