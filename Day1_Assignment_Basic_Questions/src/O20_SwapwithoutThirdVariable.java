import java.util.Scanner;

public class O20_SwapwithoutThirdVariable {
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

        System.out.println("1st number was "+a);
        System.out.println("2nd number was "+b);

        a = a+b; // a = 10 ; b = 20
        // a = 10 + 20 = 30 ;
        b = a - b ;
        // b = 30 - 20 = 10 ;
        a = a-b;
        // a = 30 - 10 = 20 ;
        System.out.println("Present value of 1st num "+a);
        System.out.println("Present value of 2nd num "+b);


    }
}
