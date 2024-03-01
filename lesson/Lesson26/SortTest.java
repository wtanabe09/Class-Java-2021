public class SortTest {
  public static void main(String[] args) {
    int[] array1 = new int[10];
    setIntArray(array1, 100);
    int[] array2 = cloneIntArray(array1);
    int[] array3 = cloneIntArray(array1);
    int[] array4 = cloneIntArray(array1);
 
    // // Bubble Sort
    // System.out.println("Bubble Sort");
    // BubbleSort bs = new BubbleSort(array1);
    // display(array1);
    // bs.bubbleSort();
    // display(array1);

    // // Selection Sort
    // System.out.println("Selection Sort");
    // SelectionSort ss = new SelectionSort(array2);
    // display(array2);
    // ss.selectionSort();
    // display(array2);

    // // InsertionSort
    // InsertionSortX ss = new InsertionSortX(array3);
    // display(array3);
    // ss.InsertionSortX();
    // display(array3);

    // ShellSort
    System.out.println("Shell Sort");
    ShellSort sh = new ShellSort(array4);
    display(array4);
    sh.shellSort();
    display(array4);
  }

  public static int[] cloneIntArray(int[] array) {
    int[] clone = new int[array.length];
    int i = 0;
    for(int element: array) {
      clone[i++] = element;
    }
    return clone;
  }

  public static void display(int[] array) {
    for(int element: array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }
  
  public static void setIntArray(int[] array, int n) {
    for(int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random() * n);
    }
  }
}