//Use Lesson08_4
public class Shop{
    //Add here***************************************************
     void equip(Character c, Equipment e) {
        c.hp += e.point;
        System.out.println(c.name + "は" + e.name + "を装備した -> " + c.name + "のHPは" + c.hp + "になった");
    }
}