import java.util.Scanner;

public class O12_RootsOfAnEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the a ");
        while (in.hasNext("[a-z A-Z]+")) {
            System.out.println("NA");
            in.next();
        }
        double a = in.nextDouble();

        System.out.println("Please enter the b ");
        while (in.hasNext("[a-z A-Z]+")) {
            System.out.println("NA");
            in.next();
        }
        double b= in.nextDouble();

        System.out.println("Please enter the c ");
        while (in.hasNext("[a-z A-Z]+")) {
            System.out.println("NA");
            in.next();
        }
        double c = in.nextDouble();

        double dis = (b*b) - (4*a*c) ;

        if(dis==0)
        {
            System.out.println("One real root "+dis);
        }
        if(dis>0)
        {
            System.out.println("Two distinct roots "+dis);
        }
        if(dis<0)
        {
            System.out.println("Two imaginary roots "+dis);
        }
    }
}
// finding the type of roots of an quadratic equation