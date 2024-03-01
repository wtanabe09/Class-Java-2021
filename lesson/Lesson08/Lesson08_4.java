public class Lesson08_4{
    public static void main(String[] args){

        Character c1 = new Character("犬");
        Character c2 = new Character("猫");

        Equipment e1 = new Equipment("かぶと", 80);
        Equipment e2 = new Equipment("よろい", 50);
        Equipment e3 = new Equipment("盾", 60);

        //Add here*******************************
        Shop s = new Shop();
        s.equip(c1, e1);
        s.equip(c1, e2);
        s.equip(c2, e1);
        s.equip(c2, e3);
    }
}