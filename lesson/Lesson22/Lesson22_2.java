public class Lesson22_2 {
	   public static void main(String[] args) {
	        BinarySearchTree tree = new BinarySearchTree();

	        insert(tree, new MyData(29, "lemon"));
	        insert(tree, new MyData(20, "apple"));
	        insert(tree, new MyData(14, "orange"));
	        insert(tree, new MyData(24, "banana"));
	        insert(tree, new MyData(7, "cherry"));
	        insert(tree, new MyData(19, "peach"));
		    insert(tree, new MyData(21, "grape"));
		    insert(tree, new MyData(32, "cassis"));
		    insert(tree, new MyData(30, "pineapple"));
		    insert(tree, new MyData(31, "melon"));
		    insert(tree, new MyData(48, "kiwi"));

			System.out.println();
			tree.printTreeInOrder();

			System.out.println("==== Removed Level 2 ====");
			tree.removeLevel(2);
			tree.printTreeInOrder();
	    }
	    
	    private static void insert(BinarySearchTree tree, MyData myData) {
        	System.out.println("Insert: " + myData);
        	tree.insert(myData);
	    }
}
