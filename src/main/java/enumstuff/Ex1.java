package enumstuff;

import java.io.Serializable;
import java.util.Arrays;

// final and cannot choose its own parent type (it extends Enum)
enum Day /*extends Object*/ implements Serializable {
  MONDAY(1), TUESDAY; // implicitly public static final fields
  private int number;
  Day(int d) {
    number = d;
  }
  Day() { /*number = -1;*/ }
  public void showMe(/*Day this*/) {
    System.out.println("I'm a day: " + this + " number is " + number);
  }

  @Override
  public String toString() {
    return "I'm a Day " + super.toString();
  }
  // final method: name()
}

public class Ex1 {
  public static void main(String[] args) {
    System.out.println(Day.MONDAY);
    Day.TUESDAY.showMe();
    System.out.println(Day.MONDAY.name());
    Day.MONDAY.showMe();
    System.out.println(Day.MONDAY.ordinal());
    System.out.println(Day.valueOf("MONDAY"));
//    System.out.println(Day.valueOf("MONEYDAY"));
    System.out.println(Arrays.toString(Day.values()));
  }
}
