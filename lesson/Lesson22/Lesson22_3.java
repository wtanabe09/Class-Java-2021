public class Lesson22_3 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        
        insert(tree, new MyData(35, "lemon"));
        insert(tree, new MyData(17, "apple"));
        insert(tree, new MyData(69, "orange"));
        insert(tree, new MyData(21, "banana"));
        insert(tree, new MyData(38, "cherry"));
        insert(tree, new MyData(75, "peach"));
	    insert(tree, new MyData(79, "grape"));

    	System.out.println();
    	tree.printTreeInOrder();
    	
        BinarySearchTree tree2 = tree.cutTree(new MyData(69, "orange"));

    	System.out.println("/* Tree1 */");
    	tree.printTreeInOrder();

    	System.out.println("/* Tree2 */");
    	tree2.printTreeInOrder();	
    }

    private static void insert(BinarySearchTree tree, MyData myData) {
        System.out.println("Insert: " + myData);
        tree.insert(myData);
    }
}