import java.util.Scanner;

public class O6_LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the year");
        int a = in.nextInt();
        if(a%400==0)
        {
            System.out.println(a+" is a leap year");
        }
        else if(a%100==0)
        {
            System.out.println(a+"it is not a leap year");
        }
        else if(a%4==0)
        {
            System.out.println(a+"it is a leap year");
        }
        else
        {
            System.out.println(a+" it is not a leap year");
        }
    }
}
// we are doing this because for clarifying the mistake of cinsidering the years like 1900 , 1800 as leap years which they are not
// so we are checking when the year gets totally divided by 400 it is a leap year
// when by 100 - it is not a leap year
// and by 4 it is a leap year
