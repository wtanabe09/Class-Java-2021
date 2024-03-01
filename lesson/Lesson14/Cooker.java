public abstract class Cooker {
    public final Dish provide(String name) {
			System.out.print("前処理: ");
			prepare();
			System.out.print("調理: ");
			Dish mydish = cook(name);
			System.out.print("配膳: ");
			arrange(mydish);
			return mydish;
    }
    protected abstract void prepare();
    protected abstract Dish cook(String name);
    protected abstract void arrange(Dish dish);
}
