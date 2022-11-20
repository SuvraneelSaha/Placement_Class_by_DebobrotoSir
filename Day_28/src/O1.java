import java.util.InputMismatchException;
import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {

      //  int[] arr = new int[0];
       // int x = 0;
        int[] arr = {10, 20, 30, 40, 50, 0};
        int x=0;
        int y;
        int z;
        Scanner in = new Scanner(System.in);
        try {



            System.out.println("Enter first Numbers:");
            x = in.nextInt();
            System.out.println("Enter second number:");
            y = in.nextInt();

            z = arr[x] / arr[y];
            // in some cases the code will run and some
            // other times we will get errors
            // so this is an Exception
            // In case of Exception , the code will not run
            // Everytime


            System.out.println("the Result is " + z);

        }
        // The try block acts as a bomb diffuser
        // we wont show at all cost the error message

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please try again with some good input" + e);
            // System.out.println("Please try again with some good input"+e);
        } catch (ArithmeticException e) {
            System.out.println("Unfortunately you have at that position ");
            System.out.println("Considering second value as 1 , the result is "+arr[x]);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Enter valid input");
        }
        // Exception -- this statement is the mother of all exceptions
        // So this statement in the catch statement
        // should be used in the end
        // Catch(Exception e)
        // it should be present in the last or in the end


        // with one try how many catch statement can be present
        // with one try only one catch statement will be run
        //

        // 10 ex 1st num

        // we just cant show the user the errors
        // we can detour and not show the original error message
        // then we use try catch

        // and e is the message
        //


        // Important
        // one can question that why we are using try catch whereas we can
        // use if else
        // the ans is that we cant just anticipate
        // every kind of exception errors

        // kichu kichu jinis hocche khub important
        // life e sob somoy kaaj e lagbe
        // SQL and OOPS
        // ei duto sara jibon ei lagbe
        // sekhane ei chole jaa naa keno
        //


    }
}
