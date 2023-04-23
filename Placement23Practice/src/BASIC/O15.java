package BASIC;

import java.util.Scanner;
// convert the number of days into years , months and days
public class O15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of days");
        int n = in.nextInt();
        int[] time = {365,30,1};
        int years=0;
        int days = 0;
        int months = 0 ;

         int days_left=0;
        for (int i = 0; i < time.length; i++)
        {
             if(i == 0)
             {
                 years = n/time[i];
                 n=n%time[i];
             }
             if(i==1)
             {
                 months = n/time[i];
                 n=n%time[i];
             }
             if(i==2)
             {
                 days=n/time[i];
                 n=n%time[i];
             }
        }
        System.out.println("years :"+years);
        System.out.println("months :"+months);
        System.out.println("Days:"+days);
    }
}
