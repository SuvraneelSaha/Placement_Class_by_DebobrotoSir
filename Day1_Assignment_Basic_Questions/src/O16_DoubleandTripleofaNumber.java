import java.util.Scanner;

public class O16_DoubleandTripleofaNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();
        System.out.printf("the double of the number %d is %d",a,a*2);
        System.out.println();
        System.out.printf("the triple of the number %d is %d",a,a*3);

    }
}
