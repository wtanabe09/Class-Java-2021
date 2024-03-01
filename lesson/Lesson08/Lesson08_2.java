//Don't change!
public class Lesson08_2{
    public static void main(String args[]){

        Student s1 = new Student();
        Student s2 = new Student(1250998); //Argument is id
        Student s3 = new Student(1250999, 2, "坂本龍馬"); // Argument is id, grade and name

        System.out.println("id:" + s1.id + " grade:" + s1.grade + " name:" + s1.name);
        System.out.println("id:" + s2.id + " grade:" + s2.grade + " name:" + s2.name);
        System.out.println("id:" + s3.id + " grade:" + s3.grade + " name:" + s3.name);
       
    }
}