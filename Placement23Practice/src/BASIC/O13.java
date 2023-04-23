package BASIC;

import java.util.Scanner;

// enter a number and find the cube and square of that number
public class O13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int n = in.nextInt();
        System.out.println("Cube = "+(int)Math.pow(n,3));
        System.out.println("Square ="+(int)Math.pow(n,2));
    }
}
