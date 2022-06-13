import java.util.Scanner;

public class O1_MaxandMinimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st number :");
        while(in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();
        System.out.println("please enter the 2nd number :");
        while(in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int b = in.nextInt();
        System.out.println("please enter the 3rd number :");
        while(in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int c = in.nextInt();

        System.out.printf("the max of the %d , %d and %d is %d",a,b,c,Math.max((Math.max(a,b)),c));
        System.out.println();
        System.out.printf("the min of the %d , %d and %d is %d",a,b,c,Math.min((Math.min(a,b)),c));
    }
}
