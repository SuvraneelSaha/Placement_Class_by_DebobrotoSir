import java.util.Scanner;

public class O14_BankNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the Money ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int money = in.nextInt();
        int moneyleft;
        int moneyleft1;
        int two_t;
        int five_h;

       if(money/2000 >=1) // for 2000 note
       {
           moneyleft = money%2000;
           two_t = money/2000;

       }

       if(money/500>=1)
       {
           moneyleft1 = money%500;
           five_h = money/500;
       }
       else
       {

       }



        // Wrong approach
        // clear your mind buoi




    }
}
// 2885

