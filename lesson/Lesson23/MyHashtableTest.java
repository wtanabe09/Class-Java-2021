public class MyHashtableTest {
  public static void main(String[] args) {
    MyHashtable ht = new MyHashtable(11);

    ht.put(new AddressData("Hara", "Giants", "Tokyo", "Tokai"));
    ht.put(new AddressData("Yano", "Tigers", "Koushine", "Tohoku"));
    ht.put(new AddressData("Yoda", "Dragons", "Nagoya", "Asia"));
    ht.put(new AddressData("Miura", "Baysters", "Yokohama", "Nara"));
    ht.put(new AddressData("Sasaoka", "Carp", "Hiroshima", "Shimane"));
    ht.put(new AddressData("Takatsu", "Swallows", "Jinguu", "Asia"));
    ht.put(new AddressData("Kudou", "Hawks", "Fukuda", "Aichi"));
    ht.put(new AddressData("Iguchi", "Marines", "Chiba", "Aoyama"));
    ht.put(new AddressData("Tusji", "Lions", "Tokorozawa", "Saga"));
    ht.put(new AddressData("Ishii", "Eagles", "Sendai", "Chiba"));
    ht.put(new AddressData("Kuriyama", "Fighters", "Hokkaido", "Gakugei"));
    ht.put(new AddressData("Nakajima", "Buffaloes", "Osaka", "Akita"));
    ht.printAll();
    System.out.println(ht.get("Hara"));
    ht.remove("Sasaoka");
    ht.remove("Nomura");
    ht.printAll();
  }
}