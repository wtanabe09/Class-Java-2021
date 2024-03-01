public class Machine {
  protected boolean power;
  protected int battery;

  //constructor
  public Machine() {
    power = false;
    battery = 100;
  }

  public Machine(int battery) {
    power = false;
    this.battery = battery;
  }

  //mothod
  public void start() {
    power = true;
    return;
  }

  public void stop() {
    power = false;
    return;
  }

  //output power・battery 
  public void printInfo() {
    String powerState;
    if (power == true) {
      powerState = "ON";
    } else {
      powerState = "OFF";
    }
    System.out.println("電源:" + powerState);
    System.out.println("バッテリー残量:" + battery);
  }

}
