public abstract class Dish {
    private String name;
    private String plate;
    Dish(String name){
        this.name = name;
        this.plate = "";
    }
    public void showState() {
        if (! plate.equals("")) {
            System.out.println(name + "は" + plate +"上にある");
        } else {
            System.out.println(name + "は調理前");
        }
    }
    public void eat() {System.out.println(plate +"上の" + name + "を食べた");}
    protected void setOnPlate(String plate){this.plate = plate;}
}
