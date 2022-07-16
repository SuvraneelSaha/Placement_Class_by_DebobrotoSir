import java.util.Scanner;

public class O1_MaxofTwonums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st number");
        while (in.hasNext("[a-z A-Z.]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();
        System.out.println("please enter the 2nd number");
        while (in.hasNext("[a-z A-Z.]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int b = in.nextInt();

        System.out.printf("the maximum between %d and %d is %d",a,b,Math.max(a,b));


    }
}
