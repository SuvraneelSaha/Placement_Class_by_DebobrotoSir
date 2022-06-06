import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st num ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = a+b;
        System.out.println("the sum of " +a +" and "+b +" is "+c);

    }
}
