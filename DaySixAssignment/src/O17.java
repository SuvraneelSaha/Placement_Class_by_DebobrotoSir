import java.util.Scanner;

public class O17 {
    //multiplication table
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st  number");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int x = in.nextInt();

        System.out.println("Please enter the 2nd number");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int y = in.nextInt();

        for (int a = 1; a <=y ; a++)
        {
            System.out.printf("%d x %d = %d",x,a,x*a);
            System.out.println();
        }
    }
}
