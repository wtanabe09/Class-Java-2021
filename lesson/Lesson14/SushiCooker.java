public class SushiCooker extends Cooker {
    protected void prepare() {
	    System.out.println("酢飯と魚の用意");
    }
    protected Sushi cook(String name) {
        System.out.println("寿司を握る");
        return new Sushi(name);
    }
    protected void arrange(Dish dish) {
        System.out.println("寿司を盛り付ける");
        dish.setOnPlate("寿司下駄");
    }
}
