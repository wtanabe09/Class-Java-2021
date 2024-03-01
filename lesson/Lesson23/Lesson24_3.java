public class Lesson24_3 {
    public static void main(String[] args) {
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

        System.out.println("------------ MyHashtable ------------");
        ht.printAll();

        ht.exists("Kubo");
        System.out.println();
        ht.exists("Isobe");
        System.out.println();
        ht.exists("KUTinfo");
        System.out.println();
        ht.exists(null);
    }
}
