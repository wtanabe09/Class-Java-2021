import java.util.Random;

public class Lesson24_4 {
    //問題分ではNとNUMがおそらく逆（コード変更してない）
    public static final int NUM = 1000; // 配列・ハッシュテーブルのサイズ
    public static final int N = 100; // ハッシュテーブルに追加するデータの個数
    public static final int REP = 50000; // 検索を行う回数

    //size:100 element:100 37, 5.1655 47.89
    //size:500 element:100 14, 6.234997 45.109534
    //size:1000 element:1000 380, 5.7144 128.0195
    //size:1000 element:300 42, 5.524844 83.2072
    //size:1000 element:100 7, 6.578329 62.8359
    
    //1.
    //サイズが大きくなると衝突回数が減る。しかし検索時間が長くなる。
    //要素数が多くなると衝突回数が増える。
    //検索時間は変わらない。ハッシュ関数の性質

    //2.
    //配列はサイズ、要素数が大きくなればなるほど、検索時間が伸びるが、ハッシュは検索時間はほとんど変わらない。
    //配列はサイズが大きくなるごとに見ないといけない部分が増えるが、ハッシュは場所を計算によって求めるから、一定の時間で計算できる。
    
    
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            hashtableTest();
        }

        for (int i = 0; i < 1; i++) {
           arrayTest();
        }
    }

    // for HashTable
    public static void hashtableTest() {
        Random r = new Random();
        MyHashtable table = new MyHashtable(NUM);

        for (int i = 0; i < N - 1; i++) {
            table.put(new AddressData(generateName(), "Kochi", "Kami", "782-0003"));
        }
        table.put(new AddressData("oka", "Kyoto", "foo", "000"));

        AddressData result = null;
        long begin = System.nanoTime();
        for (int i = 0; i < REP; i++) {
            result = table.get("oka");
        }
        long end = System.nanoTime();

        System.out.println("=== Hash ===");
        if (result == null || !result.getName().equals("oka")) {
            System.out.println("Key(oka): not found");
        } else {
            System.out.println("Key(oka): found");
        }
        System.out.println("Size of the hashtable: " + NUM);
        System.out.println("Number of added elements: " + N);
        System.out.println("Number of elements in the hashtable: "+ table.elementNum()); // Lesson24_1
        System.out.println("Collision times: " + table.getCollision()); // Lesson24_2
        System.out.println("Start time : " + begin);
        System.out.println("End time   : " + end);
        System.out.println("Search time: " + ((end - begin) / 1000000.0) + "ms");
        System.out.println();
    }

    // for array
    public static void arrayTest() {
        Random r = new Random();
        AddressData[] address = new AddressData[NUM];

        for (int i = 0; i < N; i++) {
            address[i] = new AddressData(generateName(), "Kochi", "Kami", "782-0003");
        }
        //address[r.nextInt(address.length)] = new AddressData("oka", "Kyoto", "bar", "000"); // ランダムな位置に検索対象を入れる
        address[address.length/2] = new AddressData("oka", "Kyoto", "bar", "000"); // 配列の中央に検索対象を入れる

        AddressData result;
        int pos = -1;
        long begin = System.nanoTime();
        for (int i = 0; i < REP; i++) {
            for (int j = 0; j < address.length; j++) {
                result = address[j];
                if (result != null && result.getName().equals("oka")) {
                    pos = j;
                    break;
                }
            }
        }
        long end = System.nanoTime();

        System.out.println("=== Array ===");
        if (pos == -1) {
            System.out.println("Key(oka): not found");
        } else {
            System.out.println("Key(oka): found (pos: " + pos + ")");
        }
        System.out.println("Size of the array: " + NUM);
        System.out.println("Start time : " + begin);
        System.out.println("End time   : " + end);
        System.out.println("Search time: " + ((end - begin) / 1000000.0) + "ms");
        System.out.println();
    }

    private static String generateName() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random();

        int n = r.nextInt(20) + 1;
        StringBuffer tmp = new StringBuffer();
        for (int i = 0; i < n; i++) {
            int c = r.nextInt(chars.length());
            tmp.append(chars.charAt(c));
        }
        return tmp.toString();
    }
}


