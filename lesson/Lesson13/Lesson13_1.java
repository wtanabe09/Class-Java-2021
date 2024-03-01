public class Lesson13_1 {
    //Lesson13_1  calc
    public static void calc(String c_arg) {
        int arg = Integer.parseInt(c_arg);
        System.out.print("> : ");
        int input = new java.util.Scanner(System.in).nextInt();
        System.out.println(arg + "+" + input + "=" + (arg + input) );
        System.out.println(arg + "-" + input + "=" + (arg - input) );
        System.out.println(arg + "*" + input + "=" + (arg * input) );
        System.out.println(arg + "/" + input + "=" + (arg / input) );
    }

    //Lesson13_1 main
    public static void main(String[] args) {
        calc(args[0]);
    }

}
