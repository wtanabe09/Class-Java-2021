public class Lesson07_5{
  public static void main(String args[]){
    int[] even = {0, 2, 4, 6, 8, 10};
    int[] odd = {1, 3, 5, 7, 9, 11};

    // Add here ===================================
    CalArray cae = new CalArray();
    cae.name = "Even";
    cae.add(even);
    cae.mul(even);
    cae.output();
    
    CalArray cao = new CalArray();
    cao.name = "Odd";
    cao.add(odd);
    cao.mul(odd);
    cao.output();

    CalArray caeo = new CalArray();
    caeo.name = "Even & Odd";
    caeo.add(even);
    caeo.add(odd);
    caeo.mul(even);
    caeo.mul(odd);
    caeo.output();
    // ============================================
  }
}
