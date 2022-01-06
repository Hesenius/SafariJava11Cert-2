package lambdas;

import java.lang.reflect.Method;
import java.util.List;

// This MUST be an INTERFACE
// IT MUST HAVE ONE abstract method
interface StudentCriterion {
  boolean test(Student s);
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

  }

}
