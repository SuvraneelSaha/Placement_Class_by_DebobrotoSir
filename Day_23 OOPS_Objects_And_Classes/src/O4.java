import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Bank3 acc1 = new Bank3("Nigga",40000);
        Bank3 acc2 = new Bank3("Wigga",20000); // new constructor Bank





    }

}
/*
Constructor and Functions difference
 no return type
 same name as that of the Class
 can be called only once at the time of creation of the object

 But as work wise both are same as the other

 */




class Bank3
{
    // the variables inside the class and outside of a method is known as
    // instance variables

    int b; // common variable but diff objects
    // for necessary measures
    String name; // we need to give the name which is a mandatory thing

    Bank3(String name,int balance)
    {
        b= balance;
        this.name = name;
        System.out.println("Hi "+name+ " your account has been opened successfully");

    }


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

