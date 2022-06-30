import java.util.Scanner;

public class O13 {
    // Enter two numbers and find the hcf of theirs
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st  number");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int a = in.nextInt();

        System.out.println("Please enter the 2nd number");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int b = in.nextInt();

        Hcf(a,b);


    }
    static void Hcf(int a,int b)
    {
        int Hcf = 0; // Question if not initialized then what would have happened
        for (int i = 1; i <=a && i<=b ; i++)
        {
            if(a%i==0 && b%i==0)
            {
                Hcf = i;
            }
        }
        System.out.println("Hcf  = "+Hcf);
    }
}
