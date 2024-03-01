public class BinarySearchTreeTest {
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(new MyData(29, "apple"));
    tree.insert(new MyData(20, "orange"));
    tree.insert(new MyData(32, "cherry"));
    tree.insert(new MyData(14, "banana"));
    tree.insert(new MyData(30, "strawberry"));
    tree.insert(new MyData(22, "lemon"));
    tree.insert(new MyData(36, "pear"));
    tree.printRoot();

    // tree.remove(new MyData(14, "banana"));
    // tree.printRoot();
    // tree.remove(new MyData(20, "orange"));
    // tree.printRoot();
    // tree.remove(new MyData(29, "apple"));
    // tree.printRoot();

    // System.out.println(tree.search(new MyData(22, "lomon")));
    // System.out.println(tree.search(new MyData(5, "five")));

    System.out.println();
    System.out.println("PrintTreeInOrder");
    tree.printTreeInOrder();
  }
}