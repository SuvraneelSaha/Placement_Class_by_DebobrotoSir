import java.util.Scanner;

public class O16_ElectricBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Units of Electricity ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int units = in.nextInt();

        if(units<=50)
        {
            System.out.printf("charge of %d units of electricity is %.2f",units,0.50*units);
        }
        if(units>50)
        {
            if(units<=100)
            {
                System.out.printf("charge of %d units of electricity is %.2f",units,0.75*units);

            }
        }
        if(units>100)
        {
            if(units<=250)
            {

                System.out.printf("charge of %d units of electricity is %.2f",units,1.20*units);
            }
        }
        if(units>250)
        {
            System.out.printf("charge of %d units of electricity is %.2f",units,1.50*units);
        }

    }
}
