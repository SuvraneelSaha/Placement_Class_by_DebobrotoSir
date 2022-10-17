import java.util.Scanner;

public class O1 {
    // show room
    public static void main(String[] args) {
        ShowRoom acc1 = new ShowRoom();
        acc1.Input();
        acc1.Calculate();
        acc1.Display();
    }
}
class ShowRoom
{
    String name;
    long mob_number;
    double cost;
    double dis;
    double amount;

    ShowRoom()
    {
        System.out.println("New Showroom has been created!!");
    }

    void Input()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the Customer Name:");
        name = in.nextLine();


        System.out.println("Please enter the Mobile Number:");
        mob_number = in.nextLong();


        System.out.println("Please enter the Cost:");
        
        cost = in.nextDouble();


    }

    void Calculate()
    {
        if(cost <=10000)
        {
            dis = 5;
        }
        else if(cost>10000 && cost<=20000)
        {
            dis = 10;
        }
        else if(cost > 20000 && cost <= 35000)
        {
            dis = 15;
        }
        else if(cost > 35000)
        {
            dis = 20;
        }

    }

    void Display()
    {
        amount = cost - ((cost*dis)/100);
        System.out.println("Customer Name : "+name);

        System.out.println("Mobile Number : "+mob_number);

        System.out.printf(" %f Amount to be paid after %f discount ",amount,dis);
    }
}
