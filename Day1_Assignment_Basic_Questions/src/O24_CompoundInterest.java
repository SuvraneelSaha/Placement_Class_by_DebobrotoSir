import java.util.Scanner;

public class O24_CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the Principal");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double principal = in.nextDouble();
        System.out.println("please enter the Time");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double time = in.nextDouble();
        System.out.println("please enter the Rate of Interest ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double rate = in.nextDouble();
        System.out.println("please enter No. of times of Compounding ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double n = in.nextDouble();

        double exponent = n * time;
        double half = 1 + (rate/100);
        double power = Math.pow(half,exponent);


        double Total = principal * power;


        System.out.printf("the amount = %f",Total);

    }
}
// the formula used here is
// Principle*(1+(rate / 100))^time – Principle
// when using the formula of A = P(1 + r/n)nt
// it was giving absurd value
