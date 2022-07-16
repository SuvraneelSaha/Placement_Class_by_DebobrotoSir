import java.util.Scanner;

public class O22 {
    // Wap to find one number raised to the power of another
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int m = in.nextInt();

        System.out.println("Please enter the number");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();

        int ans = 1;
        //  m^n
        for (int i = 1; i <=n ; i++)
        {
                ans = ans * m ;
        }
        System.out.println("ans = "+ans);

    }
}
