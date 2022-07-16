import java.util.Scanner;
// perfect Square number
// A number which is a perfect square of a number
// for example - 16 which is a perfect square of the number 4
public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number :");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a Valid Input");
            System.out.println("Please enter a Number");
            in.next();
            // if this is not present then it will continue in an infinite loop

        }
        int n = in.nextInt();

        System.out.println(isPerfectSquare(n));

    }
    // this is actual function where the operation takes place
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
