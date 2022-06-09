import java.math.BigInteger;
import java.util.Scanner;

public class O2_Age_Mobileno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the age ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();
        System.out.println("Please enter the mobile number");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        BigInteger b = in.nextBigInteger();

        System.out.println("age - "+a);
        System.out.println("Mobile number - "+b);
    }
}
// here we can use either the BigInteger which is defined in the java.math package
// or we can use long
//  long num1 = 10L;

