public class Lesson08_3{
    public static void main(String[] args){

        Student student = new Student();
        Subject s = new Subject("情報学群実験第1前半", 1);
        //Add here**************************************
        student.subject = s;
        System.out.println(student.name + "は" + student.subject.quarter + "クォーターに" + student.subject.subjectName + "の授業を受講している");
    }
}