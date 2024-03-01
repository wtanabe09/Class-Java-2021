public class Lesson21_2 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Num: " + tree.getNumOfNodes());
        System.out.println();
        insert(tree, new MyData(25, "tomato"));
        System.out.println();
        System.out.println("Num: " + tree.getNumOfNodes());
        System.out.println();
        insert(tree, new MyData(33, "onion"));
        insert(tree, new MyData(58, "radish"));
        insert(tree, new MyData(13, "potato"));
        insert(tree, new MyData(30, "carrot"));
        System.out.println();
        System.out.println("Num: " + tree.getNumOfNodes());
    }
    private static void insert(BinarySearchTree tree, MyData myData) {
        System.out.println("Insert: " + myData);
        tree.insert(myData);
    } 
}