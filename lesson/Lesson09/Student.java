class Student {
	private String name;
	private int age;
	private int year;
	private int month;
	private int day;

	Student() {
		this.name = "高知工科";
		this.age = 20;
		this.year = 2001;
		this.month = 5;
		this.day = 14;
	}
	
	// Add here
	void showProf() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Birthday: " + this.year + "/" + this.month + "/" + this.day);
	}
}
