import java.util.Scanner;

public class o12_CalculateProfitandLoss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the buying amount  ");
        while(in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int cp = in.nextInt();

        System.out.println("please enter the selling amount  ");
        while(in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int sp = in.nextInt();

        if(cp>sp)
        {
            System.out.printf("loss %d",cp-sp);

        }
        else if (cp<sp)
        {
            System.out.printf("profit %d",sp-cp);
        }
        else
        {
            System.out.printf("Same %d",cp);

        }
    }
}
