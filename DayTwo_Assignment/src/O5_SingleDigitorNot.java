import java.util.Scanner;

public class O5_SingleDigitorNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st number");
        while (in.hasNext("[a-z A-Z.]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();

        if(a>9)
        {
            System.out.println("double digit");
        }

        if(a<-9)
        {
            System.out.println("double digit");
        }
        else if(a>=-9)
        {
            System.out.println("single digit");
        }


    }
}
// 111
// 111 / 10 = 11
// 11 / 10 = 1

// pyrrhic victory know when to leave and when to hold on
// dont win on paper win on reality