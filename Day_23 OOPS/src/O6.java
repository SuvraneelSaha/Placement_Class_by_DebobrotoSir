public class O6 {
    public static void main(String[] args) {
        Bank5 acc1 = new Bank5("Anais",10000);
        Bank5 acc2 = new Bank5("Iceman",50000);
        acc1.balance_enquiry();
        acc2.balance_enquiry();
        acc1.submit(5000);
        acc1.balance_enquiry();


    }

}
class Bank5
{
    // the variables inside the class and outside of a method is known as
    // instance variables

    int b;
    String name;
    Bank5(String name,int balance)
    {
        b= balance;
        this.name = name;
        System.out.println("Hi "+name+ " your account has been opened successfully");

    }

    void balance_enquiry() // this is the most integral part of a Bank
    {
        System.out.println("The Balance of "+name+ " is "+b);
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

