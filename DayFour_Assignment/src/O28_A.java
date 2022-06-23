import java.util.Scanner;

public class O28_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N");
        int n = in.nextInt();
        int i=1,a=0;

        while (i <=n)
        {
            a=a*10+1;
            System.out.print(a + " ");
            i++; // if this is not present then an infinite loop will form

        }

    }
}
// series :
// 1 11 111 1111 11111