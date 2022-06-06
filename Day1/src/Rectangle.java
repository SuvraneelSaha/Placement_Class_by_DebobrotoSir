import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a*b;
        int d = 2*((a+b));
        System.out.printf("AREA = %d",c);
        System.out.println();
        System.out.printf("Perimeter = %d",d);

    }
}

// utility package

// for importing all the utility packages
// we use import java.util.*;

// promting is imp in case of programming and making useful products
