import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of terms :");
        int n = in.nextInt();
        for (int i = 3,a=1; a <=n ; a++)
        {
            if(a%2==0)
            {
                System.out.print(-i +" ");
            }
            else
            {
                System.out.print(i + " ");
            }
            i=i+4;
        }
    }
}
// 3 -7 11 -15 ...

