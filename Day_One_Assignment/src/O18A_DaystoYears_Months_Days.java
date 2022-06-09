import java.util.Scanner;

public class O18A_DaystoYears_Months_Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the total no. of days  ");
        while (in.hasNext("[a-z A-z]+")) {
            System.out.println("NA");
            in.next();
        }
        int time = in.nextInt();

        int timeleft = 0;
        int timeleft1 = 0;
        int months=0;
        int years=0;

        if (time / 365 >= 1) {
             years = time / 365;
            timeleft = time % 365;
        }

        if (time / 30 >= 1) {
             months = time / 30;
             timeleft1 = time % 30;
        }

        if (timeleft / 30 >=1)
        {
             months = timeleft/30;
            timeleft1 = timeleft % 30;
        }

        System.out.println("the no. of days = "+timeleft1);
        System.out.println("the no. of Months = "+months);
        System.out.println("the no. of Years = "+years);


    }
}

