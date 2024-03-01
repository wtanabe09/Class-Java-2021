public class Lesson10_3 {
  public static void main(String[] args) {
    Printer printer1 = new Printer(100, 100, 10);
    Printer printer2 = new Printer(100, 100, 10);
    printer1.start();
    System.out.println("======start1======");
    printer1.printInfo();
    System.out.println();

    System.out.println("================");
    if( printer1.exePrint() == true) {
      System.out.println("プリントに成功しました．");
    } else {
      System.out.println("プリントに失敗しました．");
    }
    printer1.printInfo();
    System.out.println();


    System.out.println("================");
    if( printer1.exePrint() == true) {
      System.out.println("プリントに成功しました．");
    } else {
      System.out.println("プリントに失敗しました．");
    }
    printer1.printInfo();
    System.out.println();

    printer2.stop();
    System.out.println("======stop2======");
    printer2.printInfo();
    System.out.println();

    System.out.println("================");
    if( printer2.exePrint() == true) {
      System.out.println("プリントに成功しました．");
    } else {
      System.out.println("プリントに失敗しました．");
    }
    printer2.printInfo();
    System.out.println();

  }
}
