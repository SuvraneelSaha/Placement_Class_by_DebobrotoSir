import java.util.Scanner;

public class O26_DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the X1");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double x1 = in.nextDouble();
        System.out.println("please enter the Y1");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double y1 = in.nextDouble();
        System.out.println("please enter the X2 ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double x2 = in.nextDouble();
        System.out.println("please enter Y2 ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double y2 = in.nextDouble();

        System.out.println("the two points are : ("+x1+","+y1+") and ("+x2+","+y2+") ");
        double xdis = Math.pow((x1-x2),2);
        double  ydis = Math.pow((y1-y2),2);

        double distance = Math.pow((xdis+ydis),0.5);

        System.out.printf("the distance between the two points is %.2f",distance);
        // rounding upto 2 digit




    }
}
// distance formula = (x1-x2)^2 + (y1-y2)^2
// square root of that
