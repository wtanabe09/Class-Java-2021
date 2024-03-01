public class StringArrayTest {
  public static void main(String[] args) {
    StringArray sa = new StringArray(5);
    sa.printAll();

    for (int i = 0; i < sa.length; i++) {
      System.out.println(sa.set("Element" + i, i));
    }
    sa.printAll();
    System.out.println(sa);
  }
}