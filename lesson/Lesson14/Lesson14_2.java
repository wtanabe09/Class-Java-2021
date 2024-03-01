class Lesson14_2 {
    static public void main(String[] args){
			Cooker SC = new SushiCooker();
			Dish s1 = SC.provide("マグロ");
			s1.showState();
			s1.eat();

			Cooker SC2 = new SteakCooker();
			Dish s2 = SC2.provide("松阪牛");
			s2.showState();
			s2.eat();
		}
}
