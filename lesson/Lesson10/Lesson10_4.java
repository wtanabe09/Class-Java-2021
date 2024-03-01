public class Lesson10_4 {
  public static void main(String[] args) {
    ColorPrinter CPrinter = new ColorPrinter(100, 100, 10, 10, 10, 30);
    //ColorPrinter CPrinter = new ColorPrinter(100, 100, 10, 10, 10, 10);
    CPrinter.start();
    System.out.println("======start======");
    CPrinter.printInfo();
    System.out.println();

    System.out.println("================");
    if( CPrinter.exePrint("Mono") == true) {
      System.out.println("プリントに成功しました．");
    } else {
      System.out.println("プリントに失敗しました．");
    }
    CPrinter.printInfo();
    System.out.println();

    System.out.println("================");
    if( CPrinter.exePrint("Color") == true) {
      System.out.println("カラープリントに成功しました．");
    } else {
      System.out.println("カラープリントに失敗しました．");
    }
    CPrinter.printInfo();
    System.out.println();

    System.out.println("================");
    if( CPrinter.exePrint("Color") == true) {
      System.out.println("カラープリントに成功しました．");
    } else {
      System.out.println("カラープリントに失敗しました．");
    }
    CPrinter.printInfo();
    System.out.println();

  }
}
