import java.util.Scanner;

public class O9_AreaofRectangleaAndCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the length of the rectangle");
        while(in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int l = in.nextInt();
        System.out.println("please enter the breadth of the rectangle");
        while(in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int b = in.nextInt();
        System.out.println("please enter the radius of the circle ");
        while(in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int r = in.nextInt();

        int areaofRec = l * b ;

        double areaofCir = 3.14 * r * r ;

        System.out.println("Area of the rectangle is "+areaofRec);
        System.out.println("Area of the circle is "+areaofCir);

        if(areaofCir>areaofRec)
        {
            System.out.println("area of the circle is bigger "+areaofCir);
        }
        else
        {

            System.out.println("Area of the rectangle is bigger" + areaofRec);

        }

    }
}
