package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

enum Days { MONDAY; }

@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Target(ElementType.METHOD)
public @interface RunMe {
//public @ interface RunMe {
  String value();
  String address() default "Over the rainbow";
  int count() default 99;
//  Days day();
  // valid types for elements in annotations are:
  // primitives (but not wrappers!)
  // String
  // java.lang.Class -- e.g. String.class, SQLException.class
  // Enums
  // Annotation
  // Arrays OF THE ABOVE (so, no multi-dimensional arrays!)
}
