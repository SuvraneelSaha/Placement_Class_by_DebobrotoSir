import java.util.Scanner;

public class TimeProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the seconds ");
        int t = in.nextInt();
        int min = t/60;
        int sec = t%60;
        int hour = min/60;
        int min_left = min%60;
        System.out.println(hour+"hours");
        System.out.println(min_left+"minutes");
        System.out.println(sec+"seconds");



    }
}
// 10000 -- input in seconds

// rajanya's logic

// 10000 / 3600 --> 2 hours
// 2800 / 60 --> 46 mins
// 2800 - 2760 = 40 seconds