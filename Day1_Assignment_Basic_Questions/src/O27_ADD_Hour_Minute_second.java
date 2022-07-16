import java.util.Scanner;

public class O27_ADD_Hour_Minute_second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the hour of the 1st timing");
        int h1 = in.nextInt();
        System.out.println("please enter the minute of the 1st timing");
        int m1 = in.nextInt();
        System.out.println("please enter the seconds of the 1st timing");
        int s1 = in.nextInt();
        System.out.println("please enter the hour of the 2nd timing");
        int h2 = in.nextInt();
        System.out.println("please enter the minute of the 2nd timing");
        int m2 = in.nextInt();
        System.out.println("please enter the second of the 2nd timing");
        int s2 = in.nextInt();

        int hourtotal = h1+h2;

        int mintotal = m1+m2;

        int secondtotal = s1+s2;

        int secondfinal = 0;
        int minfinal = 0;
        int hourfinal = 0 ;

        if(secondtotal>=60)
        {
            mintotal = mintotal + secondtotal/60;
            secondfinal = secondtotal%60;
            System.out.printf("Seconds = %d",secondfinal);

        }
        else {
            System.out.println("Seconds = "+secondtotal);
        }

        if(mintotal>=60)
        {
            hourfinal = hourtotal + mintotal/60;
            minfinal = mintotal%60;
            System.out.printf("Minutes = %d",minfinal);
        }
        else if(mintotal<60)
        {
            System.out.println("Minutes = "+mintotal);
            System.out.println("Hours = "+hourtotal);
        }

        System.out.println("Hours = "+hourfinal);



    }
}
