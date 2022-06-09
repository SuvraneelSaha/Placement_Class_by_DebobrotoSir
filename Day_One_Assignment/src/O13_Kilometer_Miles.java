import java.util.Scanner;

public class O13_Kilometer_Miles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the distance in kilometer ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double kilo = in.nextDouble();

        System.out.printf("%f kilometers in miles = %f",kilo,0.621371*kilo);

    }
}
