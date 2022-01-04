package exceptions;

class AC implements AutoCloseable {
  private String name; // constructor initializes name

  public AC(String name) {
    System.out.println("constructing AC with " + name);
    this.name = name;
  }

  public void close()/* throws Exception */{
    System.out.println("Closing " + name);
  }
}

public class MyAutoCloseableEx {
//  int [] ia = { 1, 2, 3, };
  public static void main(String[] args) {
    var ac0 = new AC("zero");
    try (var ac1 = new AC("one");
         var ac2 = new AC("two");
         ac0;) { // must be final, or effectively final
        // UNHANDLED IMPORTANT EXCPETION
      //  should be thrown to caller

      // try with resources ensures the caller sees
      // the intended exception...
    } // auto-generated finally block

//    ac0 = null; this would break the use of ac0 in
// in the try-with-resources construct

    // not legal! neither catch nor finally, it's useless
//    try {}
  }
}
