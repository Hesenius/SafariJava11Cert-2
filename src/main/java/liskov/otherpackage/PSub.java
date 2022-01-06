package liskov.otherpackage;

import liskov.Protected;

public class PSub extends Protected {
  public static void main(String[] args) {
    PSub self = new PSub();
    System.out.println(self.x);
    Protected self2 = self;
    // this fails! reference MUST BE of the sub-type
    // to benefit from the privileges granted by
    // protected access.
//    System.out.println(self2.x);
  }
  void showX() {
    System.out.println(this.x);
  }

}
