import java.util.Scanner;

public class O14A_BankNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the Money ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int money = in.nextInt();

        int[] notes = {2000,500,200,100,50,20,10,5,2,1};

        for (int i = 0; i <10 ; i++) // ex - 1089
        {
            System.out.printf("No. of %d notes is %d",notes[i],money/notes[i]); // 2000 not acceptable
            // next iteration
            // 500 acceptable -- 1089 - gets divided
            // rem money becomes 1089%500 - 89
            // 200 not applicable
            // next ite
            // 100 not applicable
            // next
            // 50 applicable
            // 89/50 - 1
            // 89%50 = 39
            // 20 applicable
            // 39/20 = 1
            // 39%20 = 19
            // 10 applicable
            // 19/10 - 1
            // 19%10 = 9
            // 5 applicable -
            // 9/5 - 1
            // 9%5 = 4
            // 2 applicable -
            // 4 / 2 = 2
            // 4 % 2 = 0

            System.out.println();
            money = money%notes[i];

        }

    }
}
//