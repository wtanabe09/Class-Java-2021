import java.util.Random;

public class Lesson24_2 {
    public static void main(String[] args) {
        /*
        *  練習コード
        */
        MyHashtable ht = new MyHashtable(10);

		ht.put(new AddressData("Isobe","President", "Main Build.", "VIP room"));
		ht.put(new AddressData("Mendori","Teacher", "Mendori Lab", "A307"));
		ht.put(new AddressData("Takeuchi","Teacher", "Takeuchi Lab","A501"));

        ht.put(new AddressData("Takahashi","M2", "Yoshida Lab", "A309"));
        ht.put(new AddressData("Tochikawa","M2", "Takeuchi Lab", "A501"));
        ht.put(new AddressData("Yokota","M2", "Kadota Lab", "A210"));

        ht.put(new AddressData("Kubo","M1", "Ren Lab", "A315"));
	    ht.put(new AddressData("Takada","M1", "Shikita Lab", "A358"));
	    ht.put(new AddressData("Tani","M1", "Yokoyama Lab", "A359"));
	    ht.put(new AddressData("Watanabe","M1", "Yokoyama Lab", "A359"));

        System.out.println("------------- MyHashtable1 -------------");
        ht.printAll();

        System.out.println("Number of added elements: 10");
        System.out.println("Collision times: " + ht.getCollision());
        System.out.println();

        /*
         *  チェック用，正確性の判定コード．
         *  check メソッドを理解する必要はない
         *  正しい出力が得られた場合は正答
         *  間違えている場合は，もう一度MyHashtable.javaを見直してみてください．
         */
        System.out.println("---------- (check)MyHashtable2 ----------");
        check();
    }

    public static void check() {
        final int NUM = 10007; // ハッシュテーブルのサイズ
        final int N = 7000; // ハッシュテーブルに入れる要素の個数
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random(1);
        MyHashtable table = new MyHashtable(NUM);

        for (int i = 0; i < N; i++) {
            // 名前(キー)をランダム生成(A-Za-z0-9からなる1～20文字)
            StringBuffer tmp = new StringBuffer();
            int n = r.nextInt(20) + 1;
            for (int j = 0; j < n; j++) {
                int c = r.nextInt(chars.length());
                tmp.append(chars.charAt(c));
            }
            table.put(new AddressData(tmp.toString(), "Kochi", "Kami", "782-0003"));
        }

        System.out.println("Size of the hashtable: " + NUM);
        System.out.println("Number of added elements: " + N);
        System.out.println("Number of elements in the hashtable: "+ table.elementNum()); // Lesson24_1
        System.out.println("Collision times: " + table.getCollision()); // Lesson24_2
    }
}
