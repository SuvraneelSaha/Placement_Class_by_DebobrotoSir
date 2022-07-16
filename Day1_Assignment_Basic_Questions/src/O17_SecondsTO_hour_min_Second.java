import java.util.Scanner;

public class O17_SecondsTO_hour_min_Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the time in seconds ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int time = in.nextInt();

        int mins = time/60; // left for hour cal

        int secs = time%60; // seconds done

        int hours = mins/60; // hours done

        int minleft = mins%60; // minutes done

        System.out.println("time ="+time);
        System.out.printf(" %d hours  %d minutes  %d seconds ",hours,minleft,secs);








    }
}
