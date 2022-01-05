package staticaccess;

public class SeeMyField {
  int x = 100;
  public static void showX(SeeMyField target) {
//    System.out.println(x);
//    System.out.println(this.x);
//    System.out.println(SeeMyField.x);
    System.out.println(target.x);
  }

  public /*static*/ void showXAgain(/*@NotNull*/ SeeMyField this) {
//    this = null; // this is final, doesn't even behave like a variable!
    System.out.println(this.x);
  }

  public static void main(String[] args) {
    SeeMyField smf = new SeeMyField();
    smf.showXAgain();
  }
}
