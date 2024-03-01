public class Lesson20_3{
  static int size;
  public static void main(String[] args){
    size = Integer.parseInt(args[0]);
    pascal(size);
  }
  static int[] pascal(int num) {
    //-----add here-----
    int pas[] = new int [num];
    pas[0] = 1;
    if (num == 1){
      print(pas);
      return pas;
    }
    int p_pas[] = pascal(num - 1);
    
    for(int k = 1; k < pas.length - 1; k++) {
      pas[k] = p_pas[k] + p_pas[k - 1];
    }
    pas[pas.length - 1] = 1;
    print(pas);
    return pas;
  }
  
  static void print(int[] array){
    for (int j = 0; j < size-array.length; j++) {
      System.out.print("  ");
    }
      //-----add here-----
    for (int i = 0; i < array.length; i ++) {
      System.out.print(" " + array[i]);
    }
    System.out.println();
  }
}