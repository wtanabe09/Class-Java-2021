import java.util.Scanner;
import java.util.Date;

public class Study01_4 {
  public static void main(String[] args) {
    String set = args[0]; //1月1日の曜日
    int[] col = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //月の日数
    int[] day = new int[2]; //何月何日
    // 曜日を代入
    

    while(true){
      System.out.print("調べたい日付を入力してください（4月3日 => 4 3）: ");
      Scanner scan = new Scanner(System.in);
      //値を2つ受け取り
      for (int i = 0; i < 2; i++) {
        day[i] = scan.nextInt();
      }
      int i_month = day[0]; 
      int i_day = day[1];

      //00だったら終了
      //合計日数の変数を定義
      //合計日数：前の月までの日数＋入力された日
      //合計値が出る
      if (i_month == 0 && i_day == 0) {
        System.out.println("終了します");
        break;
      } else if (
          (i_month == 0 && i_day != 0) || 
          (i_month == 1 && i_day > 31) ||
          (i_month == 2 && i_day > 28) ||
          (i_month == 3 && i_day > 31) ||
          (i_month == 4 && i_day > 30) ||
          (i_month == 5 && i_day > 31) ||
          (i_month == 6 && i_day > 30) ||
          (i_month == 7 && i_day > 31) ||
          (i_month == 8 && i_day > 31) ||
          (i_month == 9 && i_day > 30) ||
          (i_month == 10 && i_day > 31) ||
          (i_month == 11 && i_day > 30) ||
          (i_month == 12 && i_day > 31)) {
          System.out.println("日付が不正な組です");
          continue;
      } else {
        int t_day = 0;
        for (int j = 0; j < i_month - 1; j++) {
          t_day += col[j];
        }
        t_day += i_day - 1;
        int che = t_day % 7;

        if (set.equals("sun")) {
          String[] dow = {"日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"};
          System.out.println(day[0] + "月" + day[1] + "日は " + dow[che] + "です");
        } else if (set.equals("mon")) {
          String[] dow = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};
          System.out.println(day[0] + "月" + day[1] + "日は " + dow[che] + "です");
        } else if (set.equals("tue")) {
          String[] dow = {"火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日", "月曜日"};
          System.out.println(day[0] + "月" + day[1] + "日は " + dow[che] + "です");
        } else if (set.equals("wed")) {
          String[] dow = {"水曜日", "木曜日", "金曜日", "土曜日", "日曜日", "月曜日", "火曜日"};
          System.out.println(day[0] + "月" + day[1] + "日は " + dow[che] + "です");
        } else if (set.equals("thu")) {
          String[] dow = {"木曜日", "金曜日", "土曜日", "日曜日", "月曜日", "火曜日", "水曜日"};
          System.out.println(day[0] + "月" + day[1] + "日は " + dow[che] + "です");
        } else if (set.equals("fri")) {
          String[] dow = {"金曜日", "土曜日", "日曜日", "月曜日", "火曜日", "水曜日", "木曜日"};
          System.out.println(day[0] + "月" + day[1] + "日は " + dow[che] + "です");
        } else if (set.equals("sat")) {
          String[] dow = {"土曜日", "日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日"};
          System.out.println(day[0] + "月" + day[1] + "日は " + dow[che] + "です");
        }
      }
    }
    
  }
}