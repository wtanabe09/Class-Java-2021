public class ColorPrinter extends Printer {

  //color inks
  protected int c_ink;
  protected int m_ink;
  protected int y_ink;

  //Lession10_4 constructor add here
  public ColorPrinter(int battery, int paper, int c_ink, int m_ink, int y_ink, int k_ink) {
    super(battery, paper, k_ink);
    this.c_ink = c_ink;
    this.m_ink = m_ink;
    this.y_ink = y_ink;
  }
  
  //Lession10_4 exePrint add here
  public boolean exePrint(String mode) {
    if (mode.equals("Mono")){
      return super.exePrint();
    } else {
      if (mode.equals("Color") && (super.power == false || this.c_ink < 10 || this.m_ink < 10 || this.y_ink < 10)) {
        return false;
      } else {
        if (super.exePrint()) {
          this.c_ink -= 10;
          this.m_ink -= 10;
          this.y_ink -= 10;
          return true;
        } else {
          return false;
        }

      }
    }
    
    
    
     
  }

  //output cmy_ink
  public void printInfo() {
    super.printInfo();
    System.out.print("Cインク残量:" + this.c_ink);
    System.out.print("　Mインク残量:" + this.m_ink);
    System.out.println("　Yインク残量:" + this.y_ink);
  }
}

