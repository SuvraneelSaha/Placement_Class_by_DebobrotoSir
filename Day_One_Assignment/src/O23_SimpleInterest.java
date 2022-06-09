import java.util.Scanner;

public class O23_SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the Principal");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double Principal = in.nextDouble();
        System.out.println("please enter the Time");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double Time = in.nextDouble();
        System.out.println("please enter the Rate of Interest ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double Rate = in.nextDouble();

        double si = (Principal*Time*Rate)/100;

        System.out.printf("Total amount = %f",si+Principal);
        // format specifier - %d for int
        // format specifier - %f for float

    }
}
