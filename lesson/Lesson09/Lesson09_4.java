public class Lesson09_4 {
	public static void main(String[] args) {
		Book book1 = new Book("スッキリわかるJava 入門", "中山清喬", 3500);
		Book book2 = new Book("入門bash", "キャメロン・ニューハム", 3000);
		Book book3 = new Book("詳解シェルスクリプト", "ネルソン・H.f.ベーブ", 3200);
		
		// Add here
		book1.showBook();
		book2.showBook();
		book3.showBook();
		System.out.println("このプログラムはBookクラスから" + Book.getCount() + "つのインスタンスを生成しました。");
	}
}
