import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Mobike acc1 = new Mobike();
        acc1.input();
        acc1.compute();
        acc1.display();

    }
}
class Mobike
{
    int b_No;
    long ph_No; // initially according to the question it was given as int
    // for convenience i have changed it to long
    String name;
    int days;
    int charge;

    Mobike()
    {
        System.out.println("New Account has been Created!!");
    }

    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your Name:");
        name = in.nextLine();
        System.out.println("Please enter your phone number:");
        ph_No = in.nextLong();
        System.out.println("Please enter the Bike Number:");
        b_No = in.nextInt();
        System.out.println("Please enter the number of Days For Rental:");
        days = in.nextInt();
    }
    void compute()
    {
        if(days>0 && days<=5)
        {
            charge = 500 * days;
        }
        else if(days>5 && days<=10)
        {
            charge = 400*days;
        }
        else if(days>10)
        {
            charge = 200*days;
        }
        else
        {
            System.out.println("Invalid Input");

        }
    }
    void display()
    {
        System.out.printf("Bike number : %d \t Phone Number: %d%n \t Name: %s \t No. of Days : %d \t charges: %d ",b_No,ph_No,name,days,charge);

       // System.out.println("Bike number :\t Phone Number:\t Name:\t No. of Days :\t charges:");
        //System.out.printf("%d\t %d%n\t %s\t %d\t %d\t",b_No,ph_No,name,days,charge);

        // pretty printing
        // how to print according to the given type as in the assignment

    }
}
