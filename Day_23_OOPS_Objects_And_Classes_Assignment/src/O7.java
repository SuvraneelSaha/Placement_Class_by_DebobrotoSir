
import java.util.Scanner;

public class O7 {
    public static void main(String[] args) {
        BookFair obj = new BookFair();
        obj.input();
        obj.calculate();
        obj.display();

    }
}
class BookFair
{
    String BName;
    double price;

    BookFair()
    {
        // Default constructor to initialize the data members
        System.out.println("A new Object is Created !!");
    }

    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the  name of the book:");
        BName = in.nextLine();
        System.out.println("Please enter the price of the book:");
        price = in.nextFloat();

    }

    void calculate()
    {

        if(price > 0 && price<=1000)
        {
            price = price - ((2.0/100)*price);
        }
        else if(price > 1000 && price <=3000)
        {

            price = price - ((10.0/100)*price);

        }
        else if(price > 3000)
        {
            price = price - ((15.0/100)*price);
        }
        else
        {
            price = 0 ;
        }

    }

    void display()
    {
        System.out.println("The name of the Book is "+BName);
        System.out.printf("Price of the book %s after discount is %f",BName,price);

    }
}
