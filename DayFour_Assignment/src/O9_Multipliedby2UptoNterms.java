import java.util.Scanner;

public class O9_Multipliedby2UptoNterms {
    public static void main(String[] args) {
        // 1 2 4 8 16 32 64 128  upto n terms
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1,a=1; a <=n ; i=i*2)
        {
            System.out.print( i + " ");
            a++;
            // if this condition is not present then it will iterate forever and will turn it into an infinite loop
            // the increment part is necessary
            // the number of initializers must be == to the number of increments

        }
    }
}
