package BASIC;

import java.util.Scanner;

// Perimeter and area of a circle
public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");
        if(in.hasNextFloat())
        {
            System.out.println("Yes");
        }
        float r = in.nextFloat();
        double peri = 2 * 3.14 * r;
        System.out.printf("Perimeter of the circle is %f ",peri);
        System.out.println();
        double area = 3.14 * 3.14 * r;
        System.out.printf("Area = %f ",area);
    }
}
