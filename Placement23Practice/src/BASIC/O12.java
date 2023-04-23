package BASIC;

import java.util.Scanner;
// write a program to read an amount integer value and break the amount  into the smallest 
// possible number of bank notes 
public class O12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Total Amount");
        int n = in.nextInt();
        int c_2000 = 0,c_500 = 0,c_200 = 0,c_100 = 0,c_50 = 0,c_20 = 0,c_10 = 0,c_5 = 0,c_2 = 0,c_1 = 0;
        System.out.println(485/2000);
        while(n!=0)
        {
            if(n/2000>=1)
            {
                c_2000 = n/2000;
                n=n%2000;
            }
            if(n/500>=1)
            {
                c_500=n/500;
                n=n%500;
            }
            if(n/200>=1)
            {
                c_2000 = n/200;
                n=n%200;
            }
            if(n/100>=1)
            {
                c_100=n/100;
                n=n%100;
            }
            if(n/50>=1)
            {
                c_50=n/50;
                n=n%50;
            }
            if(n/20>=1)
            {
                c_20=n/20;
                n=n%20;
            }
            if(n/10>=1)
            {
                c_10=n/10;
                n=n%10;
            }
            if(n/5>=1)
            {
                c_5 = n/5;
                n=n%5;
            }
            if(n/2>=1)
            {
                c_2=n/2;
                n=n%2;
            }
            if(n/1>=1)
            {
                c_1=n/1;
                n=n%1;
            }
            
        }

        System.out.println("2000 note "+c_2000);
        System.out.println("500 note "+c_500);
        System.out.println("200 note "+c_200);
        System.out.println("100 note "+c_100);
        System.out.println("50 note "+c_50);
        System.out.println("20 note "+c_20);
        System.out.println("10 note "+c_10);
        System.out.println("5 note "+c_5);
        System.out.println("2 note "+c_2);
        System.out.println("1 note "+c_1);
    }
}

// Man your brain power got weak , just due to victory .
// Peace has weakened you my friend
// time to prepare for the war
// so that when the war comes i can be ready
