import java.util.Scanner;

public class O5 {
    // if the entered number is 15 or 16
    // then print the next 5 perfect square numbers
    // ie 25 36 49 64 81
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number :");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a Valid input");
            System.out.println("please enter a number");
            in.next();
        }
        int n = in.nextInt();
        NextPerfect(n);

    }
    static void NextPerfect(int n)
    {
        int c = 2 ;
        while (c*c<=n)
        {
//            if(c*c==n)
//            {
//                System.out.println(c*c);
//                // it is a perfect number
//            }
            // above not needed as we are just incrementing until and unless
            // we find a perfect number
            c++;
        }

        for (int i = c; i <c+5 ; i++)
        {
            System.out.println(i*i);
        }

    }
}
