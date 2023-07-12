import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st num ");
        int a = in.nextInt();
        System.out.println("Please enter the 2nd num:");
        int b = in.nextInt();
        double c ;
        c= a/b ;
        System.out.println(c);
    }
}
// type casting
// from higher to lower and lower to higher are the two types of type casting
// higher to lower automatically --> automatic type casting
// but lower to higher -- type casting
