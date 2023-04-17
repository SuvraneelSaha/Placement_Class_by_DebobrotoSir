package BASIC;

import java.util.Scanner;

/*
enter the length in meter and find the equivalent in cm and in kilometer
 */
public class O7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length in meter ");
        float a = in.nextFloat();
        System.out.println("the meter in kilometer is : "+a/1000);
        System.out.println("the meter in cm is "+a*100);
    }
}
