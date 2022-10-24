import java.util.Scanner;
// Electric bill question
public class O6 {
    public static void main(String[] args) {
        ElectricBill obj = new ElectricBill();
        obj.accept();
        obj.calculate();
        obj.print();

    }
}
class ElectricBill
{
    String name;
    int units;
    double bill; // by default the value of name is null , for int is 0 and
    // for double is 0.0


    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = in.nextLine();
        System.out.println("Please enter the number of units consumed :");
        units = in.nextInt();

    }

    void calculate()
    {
        if(units>0 && units<=100)
        {
            bill = units * 2;

        }
        else if(units > 100 && units <=300)
        {
            bill = units * 3;
        }
        else if(units > 300)
        {
            bill = units * 5;

            bill = bill + (2.5/100)*bill;

        }
    }

    void print()
    {
        System.out.println("Name of the Customer : "+name);
        System.out.println("The Number of units consumed :"+units);
        System.out.println("Bill amount : "+bill);

    }
}
