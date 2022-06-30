import java.util.Scanner;

public class O12 {
    // Find the Factors of a Number :
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();
        System.out.printf("The Factors of the Number %d are :",n);
        Factors(n);

    }
    static void Factors(int n)
    {
        for (int i = 1; i <=n ; i++)
        {
            if(n%i==0)
            {
                System.out.print(i + " ");
            }

        }
    }
}
