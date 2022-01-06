package annotations;

import java.lang.reflect.Method;

public class TestHarness {
  public static void main(String[] args) throws Throwable {
    String classToTest = "annotations.TestThis";
    Class<?> cl = Class.forName(classToTest);
    Object target = cl.getConstructor().newInstance();
    System.out.println(target);
    Method [] ma = cl.getMethods();
    for (Method m : ma) {
      System.out.println(m);
      RunMe annot = m.getAnnotation(RunMe.class);
      if (annot != null) {
        System.out.println("***** Annotated with @RunMe name is "
            + annot.value() + " address is " + annot.address());
        m.invoke(target);
      }
    }
  }
}
