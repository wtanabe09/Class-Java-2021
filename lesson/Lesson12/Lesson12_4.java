public class Lesson12_4 {
	public static void main(String args[]) {
		Hero hero = new Hero("hiro", 150, 10);

		System.out.println("========= encount =========");
		Human vill = new Villager("Villager 1", 10, 1);

		hero.encount(vill); // 人間(Human)とエンカウント
		System.out.println();

		System.out.println("========= encount =========");
		Monster mo = new Slime("slime 1", 10, 2);
		hero.encount(mo); // モンスター(Monster)とエンカウント
	}
}
