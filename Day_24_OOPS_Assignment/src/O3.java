public class O3 {
    public static void main(String[] args) {
    Account obj = new Account("Nigga Chan",765432981,1000,0);
    obj.Deposit(100);
    obj.Withdraw(700);
    obj.Display();
    }
}
// Bank and account question
class Bank
{
    String name;
    long account_num;
    double p;

    Bank(String name,long account_num,double p)
    {
        this.name=name;
        this.account_num=account_num;
        this.p=p;
    }

    void Display()
    {
        System.out.println("Name of the Customer is "+name);
        System.out.println("the Account Number is "+account_num);
        System.out.println("Principal Amount  "+p);

    }

}
class Account extends Bank
{
    double amount;

    Account(String name,long account_num,double p,double amount)
    {
        super(name,account_num,p);

        this.amount = amount;
        // super keyword is used to pass the parameters of the constructor of the super class class
        // and the rest parameter will be assigned in this subclass only ie the child class

    }

    void Deposit(double amount)
    {
        p = p+amount;
        System.out.printf("%f has been deposited",amount);
        System.out.println();
        System.out.printf("New Principal amount is %f",p);
        System.out.println();


    }

    void Withdraw(double amount)
    {
        if(amount > p)
        {
            System.out.println("Insufficient Balance!!");
        }
        else
        {
            p = p - amount;
            System.out.printf("%f has been withdrawn",amount);
            System.out.println();
            System.out.printf("the principal Amount is Now : %f",p);
            System.out.println();


        }

        if(p<500)
        {
            System.out.printf("fine = %f",((p-(500-p))/10));
            System.out.println();


        }

    }

    void Display()
    {
        System.out.println("Name of the Customer is "+name);
        System.out.println("the Account Number is "+account_num);
        System.out.println("Principal Amount  "+p);
    }



 }
