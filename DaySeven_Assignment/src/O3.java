import java.util.Scanner;
// Evil number :
// if the binary equivalent of a number has even number of 1s then
// it is called an evil number otherwise it is called odious number
// ex - 9 -- binary equivalent = 1001 -- it has 2 1s ie even sooo it is an evil number ;



// In this program we  used the Interger.parseInt which converts a string into a number
// and the string must be represented as a number

// ie Integer.parseInt(String s) -- converts the String into int data type
// Parameters can be two types
// 1] only String
// 2] String , Radix Number
// Radix number = number system base number ex - decimal = 10 , binary - 2
public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number :");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a Valid input");
            System.out.println("please enter a number");
            in.next();
        }
        int n = in.nextInt();
        String num = Integer.toBinaryString(n);
        int binary = Integer.parseInt(Integer.toBinaryString(n));
        System.out.println(num);
        System.out.println(binary);

        System.out.println(isEvilNumber(binary));

    }
    static boolean isEvilNumber(int n)
    {
        int count=0;
        while (n>0)
        {
            int rem = n%10;
            if(rem ==1 )
            {
                count++;
            }
            n=n/10;
        }
        if(count%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
