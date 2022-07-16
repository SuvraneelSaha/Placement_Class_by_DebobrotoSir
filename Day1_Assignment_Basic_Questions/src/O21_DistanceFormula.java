import java.util.Scanner;

public class O21_DistanceFormula {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the U");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double u = in.nextDouble();
        System.out.println("please enter the t");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double t = in.nextDouble();

        System.out.println("please enter the t");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double f = in.nextDouble();

        double s = u*t + (0.5) * f * t * t;

        System.out.println("Distance ="+s);

    }

}
