package BASIC;

import java.util.Scanner;

// calculate the volume of a sphere
public class O10 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("enter the radius : ");
        float a = in.nextFloat();
        double vol = 1.3 * 3.14 * Math.pow(a,3);
        System.out.println("Volume of the sphere = "+vol);
    }
}
