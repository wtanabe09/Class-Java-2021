public class Lesson12_3 {

  public static void main(String args[]) {

		Hero hero = new Hero("hiro", 120, 10);

		Monster ms[] = new Monster[2];
		ms[0] = new Slime("slime 1", 12, 10);
		ms[1] = new Dragon("dragon 1", 100, 20);


		System.out.println("==========  Battle Start ==========");
		hero.attack(ms[0]); // 今回は問題の都合により先頭のモンスターms[0]へ攻撃 !
		ms[0].attack(hero); // slime 1 が Hero へ攻撃 !
		ms[1].attack(hero); // Dragon 1 が Hero へ攻撃 !
		System.out.println("===================================");
  }
}
