

public class O6 {
    public static void main(String[] args) {
        Sales obj = new Sales("Biscuit",101,10000,35,0,10000);
        obj.Compute();
        obj.Show();
    }
}
// Product and Sales
class Product
{
    String name;
    int Product_code;
    double amount;


    Product(String n,int c,double p)
    {
        this.name = n ;
        this.Product_code = c ;
        this.amount = p ;

    }

    void Show()
    {
        System.out.println("Product Name "+name);
        System.out.println("Product Code "+Product_code);
        System.out.println("Product Amount "+amount);

    }
}
class Sales extends Product // always to the inheritance first otherwise it will give error and
    // you wont find where the bug is present

{
    int day ;
    double tax ;
    double total_amount;
    double fine=0 ;

    Sales(String name,int code,double amount,int day,double tax,double total_amount)
    {
        super(name, code, amount);

        this.day = day;
        this.tax = tax ;
        this.total_amount = total_amount;


    }

    void Compute()
    {
        tax = 0.124*amount;



        if(day>30)
        {
            fine = 0.025*amount;

        }

        total_amount = (amount + tax + fine) ;


    }

    void Show() // method overriding -- Inheritance is necessary , happens at runtime
    {
       super.Show();
        System.out.println("Days "+day);
        System.out.println("Fine = "+fine); // fine is an example of instance variable or class var
        System.out.println("Tax ="+tax);
        System.out.println("Total Amount ="+total_amount);


    }
}