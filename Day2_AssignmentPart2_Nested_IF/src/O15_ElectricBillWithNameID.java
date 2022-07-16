import java.util.Scanner;

public class O15_ElectricBillWithNameID {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Units of Electricity ");
        while (in.hasNext("[a-z A-Z]+")) {
            System.out.println("NA");
            in.next();
        }
        int units = in.nextInt();

        System.out.println("Please enter the Name");
        while (in.hasNext("[0-9]+")) {
            System.out.println("NA");
            in.next();
        }
        String name = in.next();

        System.out.println("Please enter the ID ");
        String id = null;
        if (in.hasNext("[a-z A-Z]+" + "[0-9]+")) {
            id = in.next();

        }
        System.out.println("Name " + name);
        System.out.println("ID " + id);


        if (units <= 200) {
            System.out.printf("charge of %d units of electricity is %d", units, 1 * units);
        }
        if (units > 200) {
            if (units <= 400) {
                System.out.printf("charge of %d units of electricity is %d", units, 2 * units);

            }
        }
        if (units > 400) {
            if (units <= 600) {

                System.out.printf("charge of %d units of electricity is %d", units, 3 * units);
            }
        }
        if (units > 600) {
            System.out.printf("charge of %d units of electricity is %d", units, 4 * units);
        }
    }
}
