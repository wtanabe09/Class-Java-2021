public class Hero extends Character implements CharInfo, Critical {
    //-------フィールド-------
    //add here
    private int atk;
    //-------コンストラクタ-------
    //add here
    public Hero(String name, int hp, int atk) {
        super(name, hp);
        this.atk = atk;
    }
    
    //-------メソッド-------
    //add here
    public int getAtk() {
        return this.atk;
    }

    public void attack(Enemy enemy) {
        System.out.println(super.getName() + "の攻撃");
        System.out.println(super.getName() + "は" + enemy.getName() + "に" + this.atk + "のダメージを与えた");
        enemy.takeDamage(this.atk);
        System.out.println(enemy.getName() + "の残りHPは" + enemy.getHp());
    }

    public void printName() {
        System.out.println("プレイヤーのキャラクターは" + super.getName() + "だ");
    }

    public void showStatus() {
        System.out.println(super.getName() + "のステータス");
        System.out.println("HP:" + super.getHp());
        System.out.println("ATK:" + this.atk);
    }

    public void criticalAttack(Enemy enemy) {
        enemy.takeDamage(calcCritical(this.atk));
        System.out.println(super.getName() + "の攻撃");
        System.out.println("クリティカルヒット！");
        System.out.println(super.getName() + "は" + enemy.getName() + "に" + this.atk + "のダメージを与えた");
        System.out.println(enemy.getName() + "の残りHPは" + enemy.getHp());
        
    }

    public int calcCritical(int atk) {
        this.atk = atk * CRITICAL;
        return this.atk;
    }
}
