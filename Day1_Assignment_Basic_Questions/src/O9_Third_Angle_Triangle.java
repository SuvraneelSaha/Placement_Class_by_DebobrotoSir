import java.util.Scanner;

public class O9_Third_Angle_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st angle");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();
        System.out.println("please enter the 2nd angle");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int b = in.nextInt();

        int c = 180 - (a+b);
        System.out.println("the third angle is "+c);

    }
}
