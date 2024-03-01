public class Lesson12_1 {
    public static void main(String[] args) {
        Human [] hs = new Human[3];
        hs[0] = new Hero("Yuu", 150, 40);
        hs[1] = new Tank("Bou", 300, 20);
        hs[2] = new Attacker("Kou", 100, 80);

        System.out.println("----- Status -----");
        for (int i = 0; i < hs.length; i++) {
            hs[i].showStatus();
        }
        System.out.println("------------------");
        
    }
}
