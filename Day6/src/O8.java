import java.util.Scanner;

public class O8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of terms :");
        int n = in.nextInt();
        for (int a = 1; a <=n ; a++)
        {
            System.out.print((a+6)/7%2 + " ");
        }
    }
}
// 1 1 1 1 0 0 0 0 1 1 1 1 ... n terms
// so the formula is
/*
Add the a with (m-1)
and divide it by m
Lastly do % by 2
ex -
1 1 1 1 1 1 0 0 0 0 0 0 1 1 1 1 1 1
a- 1 2 3 .....  n terms
(a + 5)/6
and then (a+5)/6 %2



 */