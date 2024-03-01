public class Lesson21_1 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        showMinMax(tree);
        System.out.println();
        insert(tree, new MyData(25, "tomato"));
        System.out.println();
        showMinMax(tree);
        System.out.println();
        insert(tree, new MyData(34, "onion"));
        insert(tree, new MyData(58, "radish"));
        insert(tree, new MyData(13, "potato"));
        insert(tree, new MyData(30, "carrot"));
        System.out.println();
        showMinMax(tree);
    }

    private static void showMinMax(BinarySearchTree tree) {
        System.out.println("Maximum Data: " + tree.getMaximumData());
        System.out.println("Minimum Data: " + tree.getMinimumData());
    }

    private static void insert(BinarySearchTree tree, MyData myData) {
        System.out.println("Insert: " + myData);
        tree.insert(myData);
    } 
}