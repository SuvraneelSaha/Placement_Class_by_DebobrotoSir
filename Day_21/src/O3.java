import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer value ");
        int a = in.nextInt();

        System.out.println("Enter a Numeric value:");
        double b = in.nextDouble();

        System.out.println("Enter a String");
        String c = in.nextLine();
        c=in.nextLine();
        // nextline is always looking for an enter
        // The string takes in an enter to start the nextline

        System.out.println(a);
        System.out.println(b);
        System.out.println("Hello " +c+ "..");

        System.out.println(c);


        System.out.printf("the number is %d,the second number is %f and the String is %s",a,b,c);
    }
}
