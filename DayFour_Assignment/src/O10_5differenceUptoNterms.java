import java.util.Scanner;

public class O10_5differenceUptoNterms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 5,a=1; a <10 ; i=i+5)
        {
            System.out.print(i+" ");
            a++;

        }
    }
}
