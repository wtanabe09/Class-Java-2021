class Super {
  void print() {System.out.println("Super");}
}

class Sub extends Super {
  // void print() {System.out.println("Sub");}
  void d() {
    super.print();
    this.print();
    print();
  }
}


public class Main {
  public static void main(String args[]) {
    Sub s = new Sub();
    s.d();
  }
}