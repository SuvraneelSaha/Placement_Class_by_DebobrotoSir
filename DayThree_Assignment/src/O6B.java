import java.util.Scanner;

public class O6B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) // boolean expression needed
        {
            System.out.println("Enter the sides of Triangle");
            try //this statement allows us to define a block of code which is prone to errors or to be tested for errors  while it is being executed
            {
                int a=in.nextInt();
                int b=in.nextInt();
                int c=in.nextInt();
                if(a<=0 || b<=0 || c<=0)
                {
                    System.out.println("InvalidInput");

                }
                else if(a >= (b+c) || c >= (b+a) || b >= (a+c))
                {
                    System.out.println("Not a Triangle");

                }
                else if(a==b && b==c)
                {

                    System.out.println("Equilateral Triangle");
                }

                else if(a!=b && b!=c && c!=a)
                {
                    System.out.println("Scalene Triangle");

                }
                else if(a==b || c==a || c==b)
                {
                    System.out.println("Isosceles Triangle");

                }
            }
            catch(Exception e) // this catch statement allows defines a block of code to be executed when an error occurs in the try block
                    // these try and catch statements goes in pair
            {
                System.out.println("Error: enter a number!");

            }
            System.out.println("for stopping 5 ");
            int fun = in.nextInt();
            if(fun==5)
            {
                System.out.println("Stopped");
                break;
            }
            else
            {
                continue;
            }
        }

    }
}
