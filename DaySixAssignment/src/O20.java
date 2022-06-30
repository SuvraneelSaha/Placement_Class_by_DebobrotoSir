import java.util.Scanner;

public class O20 {
    // Wap a program to enter numbers till the user wants and at the end
    // it should display the count of positive negative and zeroes
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count_Zero =0 ;
        int count_Positive =0 ;
        int count_Negative =0 ;
        while (true)
        {
            System.out.println("Please enter the number");
            int a = in.nextInt();
            if(a==0)
            {
                count_Zero ++;
            }
            else if(a>0)
            {
                count_Positive ++ ;
            }
            else if (a<0)
            {
                count_Negative ++ ;
            }
            System.out.println("Do you want to Continue ?");
            System.out.println("Press Y to confirm and N to Stop");
            char ans = in.next().charAt(0);
            if(ans == 'Y')
            {
                continue;
            }
            else if(ans == 'N')
            {
                break;
            }
            else
            {
                continue;
            }



        }
        System.out.println("Count of 0 " + count_Zero);
        System.out.println("Count of positive " + count_Positive);
        System.out.println("Count of Negative " + count_Negative);

    }
}
