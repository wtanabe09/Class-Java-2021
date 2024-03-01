public class Lesson13_2 {
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

    //Lesson13_2
    public static void main(String[] args) {
        try {
            calc(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("数値型に変換する文字列の形式が正しくないため，例外が発生しました"); 
        } catch (java.util.InputMismatchException e) {
            System.out.println("標準入力がint型でないため，例外が発生しました");
        } catch (ArithmeticException e) {
            System.out.println("ゼロ除算をしようとしたため，例外が発生しました");
        }
        
    }
}