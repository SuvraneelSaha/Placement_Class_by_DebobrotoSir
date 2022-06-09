import java.util.Scanner;

public class O22_ModulusWithoutUsingOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the Numerator");
        while (in.hasNext("[a-z A-z]+")) {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();
        System.out.println("please enter the Denominator");
        while (in.hasNext("[a-z A-z]+")) {
            System.out.println("NA");
            in.next();
        }
        int b = in.nextInt(); // initialization

        int quotient = a / b;
        //int rem; // declaration

        int rem = 0;
        if (a > quotient * b) {
            rem = a - (quotient * b);
        }
        System.out.printf("Remainder of %d and %d is %d", a, b, rem);


    }
}
// a - 10
// b - 3
// a/b = 3
// again if
// a - 3
// b = 10
