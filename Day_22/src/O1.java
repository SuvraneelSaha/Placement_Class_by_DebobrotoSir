import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        // Find factorial of 3 numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number");
        int a1 = in.nextInt();
        int fact1 = 1 ;
        for (int i = 1; i <=a1 ; i++)
        {
                fact1 = fact1 * i;
        }
        System.out.printf("Factorial of the 1st number is %d ",fact1);
        System.out.println("Please enter the 2nd number");
        int a2 = in.nextInt();
        int fact2 = 1 ;
        for (int i = 1; i <=a2 ; i++)
        {
            fact2 = fact2 * i;
        }
        System.out.printf("Factorial of the 2nd number is %d ",fact2);
        System.out.println("Please enter the 3rd number");
        int a3 = in.nextInt();
        int fact3 = 1 ;
        for (int i = 1; i <=a3 ; i++)
        {
            fact3 = fact3 * i;
        }
        System.out.printf("Factorial of the 1st number is %d ",fact3);

    }
}
