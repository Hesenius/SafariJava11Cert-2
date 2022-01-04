package equality;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equality {
  public static void main(String[] args) {
//    String s = "Hello";
//    String t = "He";
//    t += "llo";
//    System.out.println(s == t); // tests "objects at same memory location"
    // also, ANY use of "new" MUST create a different object.

//    String s = "Hello";
//    String t = "He";
//    t += "llo";
//    // equals *generally* is intended for "object equivalence comparison"
//    System.out.println(s.equals(t));

//    StringBuilder s = new StringBuilder("Hello");
//    StringBuilder t = new StringBuilder("He");
//    t.append("llo");
//    System.out.println("s is " + s);
//    System.out.println("t is " + t);
//    System.out.println(s.equals(t)); // equals is for "finding in collections"
//    // imagine you have a TreeSet ... mutability could break it!!!

//    List<String> ls = List.of("Fred", "Jim");
//    List<String> ls2 = new ArrayList<>(ls);
//    System.out.println(ls.equals(ls2));

    LocalDate ld = LocalDate.of(2021, 3, 29);
    LocalDate ld2 = LocalDate.of(2021, 3, 29);
    System.out.println(ld.equals(ld2));
  }
}
