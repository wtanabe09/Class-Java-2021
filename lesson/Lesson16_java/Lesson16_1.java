public class Lesson16_1{
    public static void main(String[] args){
        StringArray ta = new StringArray(8);
        ta.initForLessons();
        ta.printAll();

        StringArray check = new StringArray(4);
        check.set("Tochikawa", 0);
        check.set("Mendori", 1);
        check.set("Yokota", 2);
        String temp = "Taka";
        temp += "da";
        check.set(temp,3);
        System.out.println("========= Result =========");
        System.out.println("! Searched the Number !");
        for(int i = 0; i < check.length; i++){
            if(ta.search(check.get(i)) != -1){
                System.out.println(String.format(check.get(i) + " found!!"));
                System.out.println(String.format(check.get(i) + " : Index Number is " + ta.search(check.get(i))));
            } else {
                System.out.println(String.format(check.get(i) + " not found..."));
                System.out.println(String.format(check.get(i) + " : Index Number can not be found."));
            } 
        }
        System.out.println("==========================");
    }
}