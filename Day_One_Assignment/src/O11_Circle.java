import java.util.Scanner;

public class O11_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the radius");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double r = in.nextDouble();
        double area = 3.14 * r * r;
        double peri = 2 * 3.14 * r;
        double dia = 2 * r ;
        System.out.println("area ="+area);
        System.out.println("Perimeter ="+peri);
        System.out.println("diameter ="+dia);

    }
}
