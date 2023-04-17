package BASIC;

import java.util.Scanner;

// write a program that takes hours and mins as input and calculates the total
// number of minutes
public class O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the num of hours ");
        int h = in.nextInt();
        System.out.println("enter mins also ");
        int m = in.nextInt();
        int total = h*60 + m ;
        System.out.println("Total mins : "+total);

    }
}
