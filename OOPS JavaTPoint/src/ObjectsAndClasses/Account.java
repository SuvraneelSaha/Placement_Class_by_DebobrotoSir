package ObjectsAndClasses;
class  AccountBluePrint
{
    int acc_no;
    String name;
    float Totalamount;
    //Method to initialize object
    void insert(int a,String n,float amt)
    {
        acc_no=a;
        name=n;
        Totalamount =amt;
    }
    //deposit method
    void deposit(float amt)
    {
        Totalamount = Totalamount +amt;
        System.out.println(amt+" deposited");
    }
    //withdraw method
    void withdraw(float amt)
    {
        if(Totalamount <amt)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            Totalamount = Totalamount -amt;
            System.out.println(amt+" withdrawn");
        }
    }
    //method to check the balance of the account
    void checkBalance()
    {
        System.out.println("Balance is: "+ Totalamount);
    }
    //method to display the values of an object
    void display()
    {
        System.out.println(acc_no+" "+name+" "+ Totalamount);
    }
}

public class Account {
    public static void main(String[] args) {
        AccountBluePrint a1=new AccountBluePrint();
        a1.insert(101,"Ankit",1000); // initialization of objects through methods
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }

}
