import java.util.Scanner;

public class O8 {
    public static void main(String[] args)
    {

        RailTicket obj=new RailTicket();
        obj.Input();
        obj.Calculate();
        obj.Display();
    }
}
class RailTicket {
    Scanner sc = new Scanner(System.in);
    String name;
    String coach;
    long mobno;
    int amount;
    int totalamt;

    void Input() {
        System.out.println("Enter the name of the Customer: ");
        name = sc.nextLine();
        System.out.println("Enter the type of coach: ");
        coach = sc.nextLine();
        System.out.println("Enter the Mobile number: ");
        mobno = sc.nextLong();
        System.out.println("Enter the amount: ");
        amount = sc.nextInt();
    }

    void Calculate() {
        String s1 = "First_AC";
        String s2 = "Second_AC";
        String s3 = "Third_AC";
        String s4 = "Sleeper";
        if (coach.equalsIgnoreCase(s1)) {
            totalamt = amount + 700;
        } else if (coach.equalsIgnoreCase(s2)) {
            totalamt = amount + 500;
        } else if (coach.equalsIgnoreCase(s3)) {
            totalamt = amount + 250;
        } else if (coach.equalsIgnoreCase(s4)) {
            totalamt = amount;
        } else {
            System.out.println("Invalid coach selected");
        }
    }

    void Display() {
        System.out.println("Name of the Customer: " + name);
        System.out.println("Coach selected: " + coach);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Total Amount: Rs" + totalamt);
    }
}