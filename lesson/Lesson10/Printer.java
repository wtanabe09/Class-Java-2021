public class Printer extends Machine {
  protected int paper; 
  protected int ink;  //black 

  public Printer() {
    paper = 100;
    ink = 100;
  }
  //Lesson10_2 constructor add here
  public Printer(int paper, int ink) {
    this.paper = paper;
    this.ink = ink;
  }

  public Printer(int battery, int paper, int ink) {
    super(battery);
    this.paper = paper;
    this.ink = ink;
  }

  //Lesson10_3 exePrint add here
  public boolean exePrint() {
    if (super.power == false || this.battery < 10 || this.paper < 10 || this.ink < 10) {
      return false;
    } else {
      this.battery -= 10;
      this.paper -= 10;
      this.ink -= 10;
      return true;
    }
  }

  //Lesson10_1 printInfo add here
  public void printInfo() {
    super.printInfo();
    System.out.println("用紙残量：" + this.paper);
    System.out.println("黒インク残量：" + this.ink);
  }


}
