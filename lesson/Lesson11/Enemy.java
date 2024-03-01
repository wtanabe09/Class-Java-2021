public class Enemy extends Character implements CharInfo {
    //-------フィールド-------
    //add here
    private int atk;
    
    //-------コンストラクタ-------
    //add here
    public Enemy(String name, int hp, int atk) {
        super(name, hp);
        this.atk = atk;
    }

    //-------メソッド-------
    //add here
    public int getATK() {
        return this.atk;
    }

    public void attack(Hero hero) {
        System.out.println(super.getName() + "の攻撃");
        System.out.println(super.getName() + "は" + hero.getName() + "に" + this.atk + "のダメージを与えた");
        hero.takeDamage(this.atk);
        System.out.println(hero.getName() + "の残りHPは" + hero.getHp());
    }

    public void printName() {
        System.out.println("敵のキャラクターは" + super.getName() + "だ");
    }

    public void showStatus() {
        System.out.println(super.getName() + "のステータス");
        System.out.println("HP:" + super.getHp());
        System.out.println("ATK:" + this.atk);
    }
}
