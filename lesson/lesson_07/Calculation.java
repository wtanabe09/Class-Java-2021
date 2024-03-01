public class Calculation{

    int number;
    

    // Add here ====================================================
    public void printSqu() {
      int squ = number * number;
      System.out.println("square:" + number);
    }
    // ==============================================================
    public void printFac() {
      int fac_num = 1;
      for (int i = 1; i <= number; i++) {
        fac_num *= i;
      }
      System.out.println("factorial:" + fac_num);
      
      
    }
}
