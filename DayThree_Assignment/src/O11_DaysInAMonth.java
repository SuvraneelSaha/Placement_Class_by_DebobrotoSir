import java.util.Scanner;

public class O11_DaysInAMonth {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the Year");
        while (in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("NA Wrong Input");
            in.next(); // if this in.next is not present then it will continue in that loop and wont take any input
            // thus it will be an infinite loop
        }
        int year = in.nextInt();


        System.out.println("Please enter the Month no from 1 - 12");
        while (in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("NA Wrong Input");
            in.next();
        }
        int month = in.nextInt();



        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {
            System.out.println("This month Contains 31 Days "+month);
        }
        else if (month==4||month==6||month==9||month==11)
        {
            System.out.println("This month Has #0 Days "+month);
        }
        else if(month==2)
        {
            if(Leapyear(year) == true)
            {
                System.out.println("This month has 29 Days "+month);
            }
            else
            {
                System.out.println("This month has 28 Days "+month);
            }
        }
        else
        {
            System.out.println("Invalid input "+month);
        }



    }

     static boolean Leapyear(int year)
     {
         if(year %400==0)
         {
             return true;
         }
         else if(year %100==0)
         {
             return false;
         }
         else if(year %4==0)
         {
             return true;
         }
         else
         {
             return false;
         }
    }
}
// step 1 we need to check if the year is leap year or not
// if yes then in that case the no. of days in the month of feb will be 29 instead of 28
//
