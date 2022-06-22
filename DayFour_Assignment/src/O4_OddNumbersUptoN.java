import java.util.Scanner;

public class O4_OddNumbersUptoN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter N ");
        int n = in.nextInt();
        oddnum(n);


    }
    static void oddnum(int n)
    {
        if(n<=0)
        {
            System.out.println("Invalid output");
        }
        else
        {
            for (int i = 1; i <=n ; i++)
            {
                if(i%3==0)
                {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
