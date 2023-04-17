package BASIC;

import java.util.Scanner;

// enter the temperature in centigrade and find the equivalent in fahrenheit .
public class O9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the temp in celcius ");
        float c = in.nextFloat();
        double f = (c * 1.8) +32 ;
        System.out.println("The temp in fahrenheit is "+f);
    }
}
