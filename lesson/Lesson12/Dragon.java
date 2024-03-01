public class Dragon extends Monster {

    public Dragon(String name, int hp, int atk){
	    super(name, hp, atk);
    }

    // Add here (Lesson13_3)
    public void attack(Human hu) {
        System.out.println(this.name + "は炎のブレスを吐いた！");
        hu.damage(this.atk * 2);
    }


}
