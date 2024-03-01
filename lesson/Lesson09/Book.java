class Book {
	private String title;
	private String author;
	private int price;
	private static int count;
	
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.count ++;
	}

	public void showBook() {
		System.out.println("--------");
		System.out.println("タイトル:" + this.title);
		System.out.println("著作:" + this.author);
		System.out.println("値段:" + this.price);
		System.out.println("--------");
	}

	public static int getCount() {
		return count;
	}
}
