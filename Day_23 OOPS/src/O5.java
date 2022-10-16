import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Bank4 acc1 = new Bank4("Nigga",40000);
        acc1.balance_enquiry();
        acc1.submit(10000);
        acc1.withdraw(5000);
        acc1.balance_enquiry();


        Bank4 acc2 = new Bank4("Wigga",1000); // this is calling the constructor
        acc2.balance_enquiry();
        acc2.submit(5000);
        acc2.withdraw(2500);
        acc2.balance_enquiry();


    }

}
class Bank4
{
    // the variables inside the class and outside of a method is known as
    // instance variables

    int b;
    String name;
    Bank4(String name,int balance)
    {
        b= balance;
        this.name = name;
        System.out.println("Hi "+name+ " your account has been opened successfully");

    }

    void balance_enquiry() // this is the most integral part of a Bank
    {
        System.out.println("The Balance is "+b);
    }

    void submit(int x)
    {

        b=b+x;
        System.out.println("HI "+name+ " Rs " +x+ " has been credited into your account");

    }

    void withdraw(int x)
    {

        if(x<=b)
        {
            b=b-x;
            System.out.println("HI "+name+ " Rs " +x+ " has been debited into your account");
        }
        else
        {
            System.out.println("Insufficient Value");
        }

    }
}
