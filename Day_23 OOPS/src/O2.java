import java.util.Scanner;

public class O2
{
    /*
    What is the Difference between procedural and object oriented
    programming language

    --
    both say for prime number
    we can use the procedure way
    then what is the diff
    we can do it using 2 different classes and not having to deal with the
    main function


     */

    public static void main(String[] args) {
        Bank1 acc1 = new Bank1();
        Bank1 acc2 = new Bank1();


        acc1.submit();
        acc1.withdraw();
        acc1.balance_enquiry();





    }

    // class is a blueprint of an object
    //




}

class Bank1
{
    // the variables inside the class and outside of a method is known as
    // instance variables

    int b;

    void balance_enquiry() // this is the most integral part of a Bank
    {
        System.out.println("The Balance is "+b);
    }

    void submit()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount you want to submit :");
        int x = in.nextInt();

        b=b+x;

    }

    void withdraw()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw :");
        int x = in.nextInt();
        if(x<=b)
        {
            b=b-x;

        }
        else
        {
            System.out.println("Insufficient Value");
        }

    }
}
