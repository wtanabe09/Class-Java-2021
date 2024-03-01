public class Lesson18_3 {
    public static void main(String[] args) {
      DoublyLinkedList list = new DoublyLinkedList();
      list.insert(1, "B");
      list.insert(2, "C");
      list.insert(3, "D");
      list.insert(4, "E");
      System.out.println("/*   list   */");
      list.printAll();

      System.out.println("---------insert A at first---------");
      list.insertFirst("A");
      list.printAll();

      System.out.println("---------insert F at last---------");
      list.insertLast("F");
      list.printAll();
    }
}
