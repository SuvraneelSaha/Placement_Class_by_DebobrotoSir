import java.util.Scanner;

public class O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of terms :");
        int n = in.nextInt();
        for (int a = 1; a <=n ; a++)
        {
            System.out.print(((a+1)/2)%2 + " ");
        }

    }
}
// 1 1 0 0 1 1 0 0 ... n terms
/*
    a      x=(a+1)/2        res = x%2;
    1          1             1
    2           1            1
    3            2           0
    4             2          0
    5              3         1
    6               3        1



 */