public class Lesson21_3 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Height: " + tree.getHeight());
        System.out.println();
        insert(tree, new MyData(33, "tomato"));
        System.out.println();
        System.out.println("Height: " + tree.getHeight());
        System.out.println();
        insert(tree, new MyData(17, "onion"));
        insert(tree, new MyData(58, "radish"));
        insert(tree, new MyData(22, "potato"));
        insert(tree, new MyData(40, "carrot"));
        System.out.println();
        System.out.println("Height: " + tree.getHeight());
        System.out.println();
        insert(tree, new MyData(65, "garlic"));
        insert(tree, new MyData(72, "cabbage"));
        System.out.println();
        System.out.println("Height: " + tree.getHeight());
    }
    private static void insert(BinarySearchTree tree, MyData myData) {
        System.out.println("Insert: " + myData);
        tree.insert(myData);
    } 
}