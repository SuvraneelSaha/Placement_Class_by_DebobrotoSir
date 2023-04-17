package BASIC;

import java.math.BigInteger;
import java.util.Scanner;

// Write a program to input your age and mobile number and print the same
// Big Integer
public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your age ");
        int a = in.nextInt();
        System.out.println("Please enter your Phone number ");
        BigInteger b = in.nextBigInteger();
        System.out.println("Age : "+a);
        System.out.println("Phone number "+b);

    }
}
