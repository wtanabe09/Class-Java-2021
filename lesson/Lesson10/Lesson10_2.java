public class Lesson10_2 {
  public static void main(String[] args) {
    Printer printer1 = new Printer(50, 25);
    printer1.start();
    System.out.println("======start1======");
    printer1.printInfo();
    System.out.println();

    Printer printer2 = new Printer(75, 50, 25);
    printer2.start();
    System.out.println("======start2======");
    printer2.printInfo();
    System.out.println();
  }
}
