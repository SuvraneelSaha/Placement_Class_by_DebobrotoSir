import java.util.Scanner;
// perfect Square number
public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number :");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a Valid Input");
            System.out.println("Please enter a Number");
            in.next();
        }
        int n = in.nextInt();

        System.out.println(isPerfectSquare(n));

    }
    static boolean isPerfectSquare(int n)
    {
        if(n<4)
        {
            return false;
        }
        int c =2;
        while (c*c<=n)
        {
            if(c*c==n)
            {
                return true;
            }
            c++;
        }


        return false;
    }
}
