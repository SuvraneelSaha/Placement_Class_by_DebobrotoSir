import java.util.Scanner;

public class O11 {
    // Parking Lot :
    public static void main(String[] args) {

        ParkingLot obj = new ParkingLot();
        obj.Input();
        obj.calculate();
        obj.Display();
    }
}

class ParkingLot
{
    String vehicle_num;
    int hours ;
    double bill;

    ParkingLot()
    {
        System.out.println("An Object Has Been Created !!");
    }

    void Input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the vehicle Number : ");
        vehicle_num = in.next();

        System.out.println("Please enter the Number of Hours the Car was Parked !!");
        hours = in.nextInt();
    }

    void calculate()
    {
        if(hours > 0 && hours<=1)
        {
            bill = hours * 3 ;
        }
        else if ( hours > 1)
        {
            bill = hours * 1.5;
        }

    }
    void Display()
    {
        System.out.println("Vehicle Number : "+vehicle_num);
        System.out.println("Hours : "+hours);
        System.out.println("Bill :"+bill);

    }
}