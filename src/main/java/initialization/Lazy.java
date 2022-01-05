package initialization;

class Whenever {
  static {
    System.out.println("Loading Whenever!");
  }
  static int x = 100;
}

public class Lazy {
  public static void main(String[] args) {
    Whenever w;
    System.out.println("Class is " + Whenever.class);
    System.out.println("Hello!");
    System.out.println("Whenever.x is " + Whenever.x);
  }
}
