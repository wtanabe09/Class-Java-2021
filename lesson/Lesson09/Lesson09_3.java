public class Lesson09_3 {
	public static void main (String[] args) {
    Teacher t = new Teacher();
	
	// Add here
		t.setName("妻鳥先生");
		t.setLab("教育情報工学研究室");
		String name = t.getName();
		String lab = t.getLab();
		System.out.println("Name:" + name);
		System.out.println("Lab:" + lab);
	}
}
