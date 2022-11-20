import java.util.InputMismatchException;
import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 0};
        int x=0;
        int y;
        int z;
        Scanner in = new Scanner(System.in);
        try {


            try
            {
                System.out.println("Enter first Numbers:");
                x = in.nextInt();

            }
            catch (InputMismatchException e)
            {
                System.out.println("Enter a valid input ");
                x=0;
            }
            System.out.println("Enter second number:");
            y = in.nextInt();

            z = arr[x] / arr[y];
            System.out.println("the Result is " + z);

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            try
            {
                System.out.println("Please try again with some good positions:");
                throw e;
            }
            catch (Exception e1)
            {
                System.out.println("Again something Happened!!");

            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Unfortunately you have 0 at that position:");
            System.out.println("Considering the 2nd value as 1 , the result is "+arr[x]);

        }


        // now the question comes ,
        // why we are using throw (for the exception)
        //

        /*
        ex - voter card problem

        try
        {
        if(age<=18)
        throw new Exception();

        if(f==1 && years < 5)
            throw new Exception();

            if(f==1 && documents = false)
                throw new Exception();

                SOP("You are elligible");


         }

         catch(Exception e)
         {
         SOP("You are not elligible");
         }

         */

    }
}
