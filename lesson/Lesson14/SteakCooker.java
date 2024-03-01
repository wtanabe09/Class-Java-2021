public class SteakCooker extends Cooker {
    protected void prepare() {
	    System.out.println("肉を常温に戻す、焼く直前に塩コショウ");
    }
    protected Sushi cook(String name) {
        System.out.println("焼く・休ませる・焼く、ソースの作成");
        return new Sushi(name);
    }
    protected void arrange(Dish dish) {
        System.out.println("ステーキを盛り付ける");
        dish.setOnPlate("松坂牛は鉄のステーキ皿上にある");
    }
}