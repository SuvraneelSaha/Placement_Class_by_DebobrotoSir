package BASIC;

import java.util.Scanner;
// find the 3rd angle of a triangle if the 2 angles are given by the user
public class O8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the angles ");
        int a = in.nextInt();
        in.next();
        int b = in.nextInt();
        System.out.println("The 3rd angle is "+(180-(a+b)));

    }
}
