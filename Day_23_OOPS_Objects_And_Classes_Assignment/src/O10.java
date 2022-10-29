import java.util.Scanner;

public class O10 {
// Railway
public static void main(String[] args) {
    RailwayTicket obj = new RailwayTicket();

    obj.accept();
    obj.calculate();
    obj.Display();
}

}

class RailwayTicket
{
    String name;
    String coach;
    long mob_num;
    int amount;
    int total_amount;

    RailwayTicket()
    {
        System.out.println("A new Object Has Been Created !!");
    }

    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the name :");
        name = in.nextLine();
        System.out.println("Please enter the type of the Coach :");
        coach = in.nextLine();
        System.out.println("Please enter the mobile number :");
        mob_num = in.nextLong();
        System.out.println("Please enter the amount : ");
        amount = in.nextInt();

    }

    void calculate() {

        String s1 = "First_Ac";
        String s2 = "Second_Ac";
        String s3 = "Third_Ac";
        String s4 = "Sleeper";
        if (coach.equalsIgnoreCase(s1)) {
            total_amount = amount + 700;
        } else if (coach.equalsIgnoreCase(s2)) {
            total_amount = amount + 500;
        } else if (coach.equalsIgnoreCase(s3)) {
            total_amount = amount + 250;

        } else if (coach.equalsIgnoreCase(s4)) {
            total_amount = amount;
        } else {
            System.out.println("Invalid Coach !!");
        }
    }

    void Display()
    {
        System.out.println("Name of the Customer: " + name);
        System.out.println("Coach selected: " + coach);
        System.out.println("Mobile Number: " + mob_num);
        System.out.println("Total Amount: Rs" + total_amount);
    }
}
