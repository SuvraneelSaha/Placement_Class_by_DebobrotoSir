import java.util.Scanner;

public class O25_AreaofaRightAngledTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the Base");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double Base = in.nextDouble();
        System.out.println("please enter the Height");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double Height = in.nextDouble();

        double area = 0.5 * Base * Height;
        System.out.println("Area of the right angled triangle is "+area);

    }
}
