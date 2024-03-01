public class Lesson05_3 {
    public static void main(String[] args) { 
	// Add here
	  int input1 = Integer.parseInt(args[0]);
      int input2 = Integer.parseInt(args[1]);
      if (input2 == 0) {
        System.out.println("ゼロ除算です");
      } else {
        int del = input1 / input2;
        int amr = input1 % input2;
        System.out.println(input1 + "を" + input2 + "で割った商は" + del + "です");
        System.out.println(input1 + "を" + input2 + "で割った剰余は" + amr + "です");
      }
      
    }
}
