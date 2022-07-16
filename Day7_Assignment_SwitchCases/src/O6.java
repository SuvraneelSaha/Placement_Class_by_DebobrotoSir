import java.util.Scanner;

public class O6 {
    public static void main(String[] args) {
        // Season and Month
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Month Number ");
        while (!in.hasNext("[1-9]+"))
        {
            System.out.println("please enter a valid Month Number  ");
            in.next();

        }
        int n = in.nextInt();
        switch (n)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter Season Month "+n);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Summer Season Month "+n);
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Monsoon Season Month ="+n);
                break;
            case 9 :
            case 10:
            case 11:
                System.out.println("Autumn Season Month ="+n);
                break;

            default:
                System.out.println("Invalid Month Number "+n);



        }
    }
}
