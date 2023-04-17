package BASIC;

import java.util.Scanner;

// convert kilometers to miles
public class O11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the kilometers ");
        float a = in.nextFloat();
        double m = a * 0.621371;
        System.out.println("The kilometers in miles is "+m);
    }
}
