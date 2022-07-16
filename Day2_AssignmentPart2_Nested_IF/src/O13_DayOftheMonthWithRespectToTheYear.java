import java.util.Scanner;

public class O13_DayOftheMonthWithRespectToTheYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Year");
        int year = in.nextInt();
        //year(year);

        System.out.println("Please enter the Month Number");
        int month = in.nextInt();

        if(month>12)
        {
            System.out.println("Invalid Month");
        }
        if(month < 0)
        {
            System.out.println("Invalid Month");
        }

        if(month==1)
        {
            System.out.println(" January 31 days "+month);
        }
        if(month==2)
        {
            if(year(year))
            {
                System.out.println(" February leap year 29 days "+month);

            }
            else
            {
                System.out.println(" February normal year 28 days "+month);
            }
        }
        if(month==3)
        {
            System.out.println("March 31 days "+month);
        }
        if(month==4)
        {
            System.out.println(" April 30 days "+month);
        }
        if(month==5)
        {
            System.out.println("May 31 days "+month);
        }
        if(month==6)
        {
            System.out.println("JUNE 30 days "+month);
        }
        if(month==7)
        {
            System.out.println("July 31 days "+month);
        }
        if(month==8)
        {
            System.out.println(" August 31 days "+month);
        }
        if(month==9)
        {
            System.out.println(" September 30 days "+month);
        }
        if(month==10)
        {
            System.out.println("October 31 days "+month);
        }
        if(month==11)
        {
            System.out.println("November 30 days "+month);
        }
        if(month==12)
        {
            System.out.println(" December 30 days "+month);
        }




    }
    static boolean year(int n)
    {
        if(n%400==0)
        {
            return true;
        }
        else if(n%100==0)
        {
            return false;
        }
        else if(n%4==0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
