import java.util.Scanner;

public class O5_AllEvenNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter N ");
        int n = in.nextInt();
        evennum(n);

    }
    static void evennum(int n)
    {
        if(n<=0)
        {
            System.out.println("Invalid O/P");
            System.exit(123);
        }
        else
        {
            for (int i = n; i >0 ; i--)
            {
                if(i%2==0)
                {

                    System.out.print(i+" ");
                }
            }
        }
    }
}
