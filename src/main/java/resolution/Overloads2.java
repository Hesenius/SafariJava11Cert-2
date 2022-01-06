package resolution;

import java.time.LocalDate;
import java.util.List;

public class Overloads2 {
// these are effectively the SAME argument list
  //  void doStuff(int [] ia) {}
//  void doStuff(int ... many){}

  // these are also effectively indistinguisable
  // for the *caller*
  void doStuff(List<String> ls){}
//  void doStuff(List<LocalDate> ls){}
}

class Sub extends Overloads2 {
//  @Override
//  void doStuff(List<LocalDate> ld) {}
}