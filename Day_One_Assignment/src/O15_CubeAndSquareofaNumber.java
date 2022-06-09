import java.util.Scanner;

public class O15_CubeAndSquareofaNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();
        int cube = (int)Math.pow(a,3);
        int square = (int)Math.pow(a,2);
        System.out.printf("cube of %d is %d",a,cube);
        System.out.println();
        System.out.printf("square of %d is %d",a,square);


    }
}
