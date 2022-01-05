package resolution;

public class Overloads {
//  void doStuff(int x, int y) {}         // Method A
//  void doStuff(int x, long y) {}        // Method B
//  void doStuff(long x, int y) {}        // Method C
  void doStuff(int ... x) {}            // Method D
//  void doStuff(int y, int ... x) {}            // Method D
  void doStuff(Object x, Object y) {} // Method E
//  void doStuff(Integer x, Integer y) {} // Method E
//  void doStuff(Long x, Long y) {} // Method E
//  void doStuff(Number x, Integer y) {} // Method E
//  void doStuff(Integer x, Number y) {} // Method E

  public void doStuff() {
    doStuff(1, 2);
//    doStuff((Number)(new Integer(1)), 2);
  }

  // NOPE!!!
//  Long l = new Integer(2);

  public static void main(String[] args) {
    Integer one = 1;
    Integer oneAgain = Integer.valueOf(1);
    System.out.println(one == oneAgain);
    Integer oneThousand = 1000;
    Integer oneThousandAgain = Integer.valueOf(1000);
    System.out.println(oneThousand == oneThousandAgain);
  }
}

/*
are you comfortable with primitive vs object reference types
A) Yes
B) No
 */
