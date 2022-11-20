import java.util.InputMismatchException;
import java.util.Scanner;

public class O6 {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,0};
        int x=0,y=0,z=0;
        Scanner sc=new Scanner(System.in);

        try {
            try {
                System.out.println("Enter first position");
                x = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("enter valid input");
                x = 0;
            }
            try {
                System.out.println("Enter second postition");
                y = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("enter valid input");
                y = 0;
            }
            z = a[x] / a[y];
            System.out.println("the result is " + z);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            try
            {
                System.out.println("please try again with some good positions ");
            }
            catch(Exception e1)
            {
                System.out.println("Again Error");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("unfortunately you have zero at that position");
            System.out.println("considering second value as 1 , the result is "+a[x]);
        }

        catch(Exception e)
        {
            System.out.println("Error 404");
        }
        finally {
            System.out.println("LOGOUT");
        }

    }
}
// one try can have multiple catch and a single finally
// multiple catch can be present
//
