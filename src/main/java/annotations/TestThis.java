package annotations;

//@RunMe
public class TestThis {
//  @RunMe
  String name;

  @RunMe(value = "Fred", address = "Down the street")
  public void itShouldWork() {
    System.out.println("itShouldWork");
  }

  @RunMe("Alfie")
  public void itShouldLookGood() {
    System.out.println("itShouldLookGood");
  }

  @Override
  public String toString() {
    return "I'm a TestThis!!!";
  }
}
