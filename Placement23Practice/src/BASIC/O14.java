package BASIC;

import java.util.Scanner;
// enter the seconds and show the hour minute and in seconds format
public class O14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the time in seconds ");
        int n = in.nextInt();
        int hours = 0 ;
        int mins=0;
        int seconds = 0 ;
        if(n/3600>=1)
        {
            hours = n/3600;
            n=n%3600;
        }
        if(n/60>=1)
        {
            mins = n/60;
            n=n%60;
        }
        seconds = n ;
        System.out.println("Hour: "+hours);
        System.out.println("Mins: "+mins);
        System.out.println("secs: "+seconds);

    }
}
