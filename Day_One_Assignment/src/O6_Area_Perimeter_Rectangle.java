import java.util.Scanner;

public class O6_Area_Perimeter_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 2 nums ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();
        int b = in.nextInt();
        int area = a*b;
        int peri = 2 * (a+b);
        System.out.println("AREA = "+area);
        System.out.println("Perimeter = "+peri);

    }
}
