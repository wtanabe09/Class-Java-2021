public class Lesson16_3 {
    public static void main(String args[]){
        StringArray ta = new StringArray(8);
        ta.initForLessons();
        ta.printAll();

        System.out.println("======== Result =======");
        ta.replace("Mendori", "Takeuchi");
        ta.replace("Tochikawa", "Kubo");
        ta.printAll();
        System.out.println("========================");
    } 
}