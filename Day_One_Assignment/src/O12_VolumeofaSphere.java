import java.util.Scanner;

public class O12_VolumeofaSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the radius of the sphere");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        double r = in.nextDouble();
        double vol = (4.0/3.0) * 3.14 * r * r * r ;
        System.out.println("Volume of the sphere is ="+vol);


    }
}
