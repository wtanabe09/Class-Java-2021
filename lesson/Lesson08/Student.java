//Use Lesson08_1, Lesson08_2, Lesson08_3

public class Student{
    
    int id;
    int grade;
    String name;

    Student() {
      this.id = 125997;
      this.grade = 2;
      this.name = "高知太郎";
    }
    Student(int id) {
      this.id = id;
      this.grade = 2;
      this.name = "山田花子";
    }
    Student(int id, int grade, String name) {
      this.id = id;
      this.grade = grade;
      this.name = name;
    }
    
    Subject subject;

}

