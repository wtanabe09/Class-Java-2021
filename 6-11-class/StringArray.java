public class StringArray {
  private String[] array;
  public final int length;
  public StringArray(int size) {
    this.length = size;
    this.array = new String[this.length];
  }
  private StringArray() {
    this.length = 0;
  }
  public boolean set(String obj, int index) {
    if(index < 0 || index > this.length - 1) {
      return false;
    }
    this.array[index] = obj;
    return true;
  }
  public void printAll() {
    for(int i = 0; i < this.length; i++) {
      System.out.println("this.array[" + i + "] = " + this.array[i]);
    }
  }
  public void initForLessons() {
    for(int i = 0; i < this.length; i++){
      this.set("ARRAY-" + i, i);
    }
    this.set("Takahashi", 0);
    this.set("Tochikawa", 1);
    this.set("Yokota", 2);
    this.set("Kubo", 3);
    this.set("Takada", 4);
    this.set("Tani", 5);
    this.set("Watanabe", 6);
  }
  public int search(String str) {
    
  }
}