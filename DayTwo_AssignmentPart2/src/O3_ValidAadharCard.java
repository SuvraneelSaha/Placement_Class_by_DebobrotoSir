import java.util.Scanner;

public class O3_ValidAadharCard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the age of the person");
        int age = in.nextInt();

        if(age>=18)
        {
            System.out.println("enter if indian - 1 & for non - indian 0");
            int id = in.nextInt();
            if(id==1)
            {
                System.out.println("No. of years stayed in India ");
                int yearStayed = in.nextInt();
                if(yearStayed>=5)
                {
                    System.out.println("the candidate can have Aadhar card");
                }
                else
                {
                    System.out.println("the candidate can have Aadhar card LATERS ");
                }
            }
            else
            {
                System.out.println("not indian");
            }
        }
        else
        {
            System.out.println("NA");
        }
    }
}
