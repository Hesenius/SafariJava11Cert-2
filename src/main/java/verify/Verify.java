package verify;

import java.util.function.Consumer;

public class Verify {
  public static void main(String[] args) {
    ((Consumer<String>)(var s) -> System.out.println(s))
        .accept("Hello World!");
  }
}
