import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("number input");
        int n = in.nextInt();
        int f=0;
        for (int i = 1;(int)Math.pow(5,i)<=n ; i++)
        {
            for (int j = 1;(int)Math.pow(5,j)<=n; j++)
            {
                if(n==(int)Math.pow(5,i) || n == (int)Math.pow(5,i)+(int)Math.pow(5,j))
                {
                    f=1;
                    break;
                }
            }
        }
        if(f==1)
        {
            System.out.println("Magic number");

        }
        else
        {
            System.out.println("its not a magic number");
        }
    }
}
