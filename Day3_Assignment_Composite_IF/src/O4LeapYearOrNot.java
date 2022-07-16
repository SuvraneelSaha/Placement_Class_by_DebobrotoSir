import java.util.Scanner;

public class O4LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the year :");
        try
        {
            while(in.hasNext("[a-z A-Z]+"))
            {
                System.out.println("NA");
                in.next();
            }
            int year = in.nextInt();
            if(year%400==0)
            {
                System.out.println("Leap year "+year);

            }
            else if(year%100==0)
            {
                System.out.println("Not a leap year "+year);
            }
            else if(year%4==0)
            {
                System.out.println("Leap year "+year);
            }
            else
            {
                System.out.println("Not a leap Year hehe "+year);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error : Enter a number");
        }

    }
}
