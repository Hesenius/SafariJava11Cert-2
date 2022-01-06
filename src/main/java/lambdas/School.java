package lambdas;

import java.lang.reflect.Method;
import java.util.List;

// This MUST be an INTERFACE
// IT MUST HAVE ONE abstract method
@FunctionalInterface
interface StudentCriterion {
  boolean test(Student s);
//  void doStuff();
}

class SmartCriterion implements StudentCriterion {
  @Override
  public boolean test(Student s) {
    return s.getGpa() > 3;
  }
}
class Student {
  public int getGpa() {
    return 0;
  }
  public List<String> getCourses() {
    return null;
  }
}

public class School {
  static void doStuff(StudentCriterion sc) {}
  static StudentCriterion doStuff() {
    return s -> s.getGpa() < 2;
  }
  public static void main(String[] args) {

//    StudentCriterion mySelection = new SmartCriterion();
//    StudentCriterion mySelection =
    // if you use an explicit type, you MUST USE TYPES for all formal params
//        (Student s) -> { return s.getGpa() > 3; } ;

//    StudentCriterion mySelection =
//        (s) -> { return s.getGpa() > 3; } ;

    // ONLY for EXACTLY ONE formal param!!!
//    StudentCriterion mySelection =
//        s -> { return s.getGpa() > 3; } ;

    // var must be used for ALL formal parameters if used at all
//    StudentCriterion mySelection =
//        (@Deprecated var s) -> { return s.getGpa() > 3; } ;

    StudentCriterion mySelection =
        s -> s.getGpa() > 3 ;

    System.out.println(mySelection.getClass());
    Method[] ma = mySelection.getClass().getMethods();
    for (Method m : ma) {
      System.out.println(m);
    }
//    mySelection.test(null);

    doStuff(s -> s.getCourses().size() > 3);
    Object obj = (StudentCriterion)s -> s.getCourses().size() > 3;

  }

}
