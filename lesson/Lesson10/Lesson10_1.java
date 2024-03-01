public class Lesson10_1 {
  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.start();
    System.out.println("======start======");
    printer.printInfo();
    System.out.println();
    printer.stop();
    System.out.println("======stop======");
    printer.printInfo();
    System.out.println();
  }
}
