public class Lesson13_3 {
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


    //Lesson13_3
    public static void main(String[] args) {
        int count = 0;
        int s_count = 0;
        int f_count = 0;
        while(count < 3) {
            count++;
            System.out.println("計算を開始します" + count + "/3");
            try {
                calc(args[0]);
                s_count++;
            } catch (NumberFormatException e) {
                System.out.println("数値型に変換する文字列の形式が正しくないため，例外が発生しました"); 
                f_count++;
            } catch (java.util.InputMismatchException e) {
                System.out.println("標準入力がint型でないため，例外が発生しました");
                f_count++;
            } catch (ArithmeticException e) {
                System.out.println("ゼロ除算をしようとしたため，例外が発生しました");
                f_count++;
            }
        }
        System.out.println("正常に終了した回数：" + s_count);
        System.out.println("例外が発生した回数：" + f_count);
        
        
    }
}