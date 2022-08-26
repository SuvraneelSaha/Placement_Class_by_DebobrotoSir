import java.util.Scanner;

public class O10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the character");


        char n = '0';
        if(in.hasNext("[a-z]"))
        {
            n = in.next().charAt(0);

            if(n=='m')
            {
                System.out.println("Monday "+n);
            }
            else if(n=='t')
            {
                System.out.println("Tuesday "+n);
            }
            else if(n=='w')
            {
                System.out.println("Wednesday "+n);
            }
            else if(n=='f')
            {
                System.out.println("Friday "+n);
            }
            else if(n=='s')
            {
                System.out.println("Saturday "+n);
            }
        }
        else if(in.hasNext("[A-Z]"))
        {
            n=in.next().charAt(0);
            if(n=='T')
            {
                System.out.println("Thursday "+n);
            }
            else if(n=='S')
            {
                System.out.println("Sunday "+n );
            }
        }
        else
        {
            System.out.println(n);
        }


    }
}
