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
  public String get(int index) {
    if (index < 0 || index > this.length - 1) {
      return null;
    }
    return this.array[index];
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
    for(int i = 0; i < this.length; i++) {
      if(array[i].equals(str)) {
        return i;
      }
    }
    return -1;
  }
  public boolean exchange(int index1, int index2) {
    if((index1 < 0 || index1 > this.length - 1) || (index2 < 0 || index2 > this.length - 1)) {
      System.out.println("ArrayIndexOutOfBoundsException!");
      return false;
    } else {
      String tmp = this.array[index1];
      this.array[index1] = this.array[index2];
      this.array[index2] = tmp;
      return true;
    }
  }
  public int replace(String obj1, String obj2) {
    int count = 0;
    System.out.println(obj1 + " -> " + obj2);
    for(int i = 0; i < array.length; i++) {
      if(array[i].equals(obj1)) {
        System.out.println(obj1 + "is found at index" + i);
        this.array[i] = obj2;
        count++;
        System.out.println("Replace " + count + " Elements");    
      }
    }
    if(count == 0) {
      System.out.println(obj1 + "can not be found.");
      return -1;
    } else {
      return count;
    }
    
  }
  public StringArray trimming(int from, int to) {
    if((from < 0 || from > this.length - 1) || (to < 0 || to > this.length - 1)) {
      System.out.println("ArrayIndexOutOfBoundsException!");
      return null;
    } else if (from > to) {
      System.out.println("NegativeArraySizeException!");
      return null;
    } else {
      int num = (to - from) + 1;
      StringArray sArray = new StringArray(num);
      for(int i = 0; i < num; i++) {
        sArray.set(this.array[from + i], i);
      }
      return sArray;
    }
  }
  public void sort() {
    for(int i = 0; i < array.length; i++) {
      for(int j = 0; j < array.length -1 -i; j++) {
        if(array[j].compareTo(array[j + 1]) > 0) {
          String tmp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = tmp;
        }  
      }
    }
  }
  
}