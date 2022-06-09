import java.util.Scanner;

public class O19_SwapSimple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st number");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();
        System.out.println("please enter the 2nd number");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int b = in.nextInt();

        System.out.println("1st number was"+a);
        System.out.println("2nd number was"+b);

        int c=0;

        c = b ;
        b=a;
        a=c;

        System.out.println("1st number is "+a);
        System.out.println("2nd number is "+b);


    }
}
// 5  &  7
// c = 5 ;

