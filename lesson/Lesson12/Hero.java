public class Hero extends Human {

    Hero(String name, int hp, int atk) {
	    super(name, hp, atk);
    }

    // Add here (Lesson13_2)
    public void check(Checkable ch) {
        ch.beChecked();
    }

    // Add here (Lesson13_4)
    public void encount(Character ch) {
        if(ch instanceof Human) {
            Human h = (Human)ch;
            h.talk();
        } else {
            Monster m = (Monster)ch;
            m.battleStart();
        }
    }

}
