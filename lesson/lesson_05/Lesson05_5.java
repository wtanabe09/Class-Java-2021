public class Lesson05_5{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int playerID = 1;
        java.util.Scanner scan = new java.util.Scanner(System.in);

        while(true){
            System.out.print("player" + playerID + " ... " + n + " >>> ");
            int input =  scan.nextInt(); //プレイヤーが取る石の個数
			// Add here
            if(input != 1 && input != 2 && input != 3 ) {
                System.out.println("無効な数字です。1,2,3のいずれかを入力してください");
                continue;
            }

            if(n < input) {
                System.out.println("無効な数字です");
                continue;
            }


            for (int i = 0; i < input; i++) {
                System.out.print(n - i + " ");
            }
            System.out.println();
                
            n = n - input;

            if ( n == 0 ) {
                if(playerID == 1) {
                    System.out.println("player1の勝利です");
                } else {
                    System.out.println("player2の勝利です");
                }
                break;
            }

            if (playerID == 1) {
                playerID = 2;
            } else {
                playerID = 1;
            }
            
		}
	}
}
