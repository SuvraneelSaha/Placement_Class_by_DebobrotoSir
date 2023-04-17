package BASIC;

import java.util.Scanner;

// Area and perimeter of a rectange
public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the length of the rectangle:");
        int a = in.nextInt();
        System.out.println("Breadth please :");
        int b = in.nextInt();
        System.out.printf("The Perimeter of the rectangle is = %f",(float)(2*(a+b)));
        System.out.println();
        System.out.printf("The area of the rectangle is =%f",(float)a*b);

    }
}
