package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1 {
  void doStuff() throws IOException {};
  void doStuff2() throws FileNotFoundException {};
  void tryStuff() {
    try {
      doStuff();
      doStuff2();
    } catch (IOException /*| FileNotFoundException */ioe) { // handle both exceptions
    }
  }
}
