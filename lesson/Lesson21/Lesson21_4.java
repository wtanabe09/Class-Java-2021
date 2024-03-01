public class Lesson21_4 {
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
    insert(tree, new MyData(33, "tomato"));
    insert(tree, new MyData(17, "onion"));
    insert(tree, new MyData(58, "radish"));
    insert(tree, new MyData(22, "potato"));
    insert(tree, new MyData(40, "carrot"));
    insert(tree, new MyData(65, "garlic"));
    insert(tree, new MyData(72, "cabbage"));
    insert(tree, new MyData(35, "pumpkin"));
    System.out.println();
    System.out.println("========== Binary Search Tree ==========");
    tree.showTree();
  }
  private static void insert(BinarySearchTree tree, MyData myData) {
    System.out.println("Insert: " + myData);
    tree.insert(myData);
} }