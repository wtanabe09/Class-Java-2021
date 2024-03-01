public class Lesson07_3{
  public static void main(String args[]){
    Calculation c = new Calculation();
    int number = Integer.parseInt(args[0]);
    c.number = number;
    c.printSqu();
    c.printFac();
  }
}
