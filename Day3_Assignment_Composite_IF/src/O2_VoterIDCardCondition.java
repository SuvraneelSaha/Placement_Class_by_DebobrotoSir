import java.util.Scanner;

public class O2_VoterIDCardCondition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter if Indian - 1 if not Indian - 0");
        int ind = in.nextInt();


            if (ind == 0) {
                System.out.println("Not valid");

            } else if(ind==1)
            {
                System.out.println("enter the age of the person");
                int age = in.nextInt();
                if (age < 18) {
                    System.out.println("Not valid");

                } else {
                    System.out.println("enter the no. of years stayed in india:");
                    int years = in.nextInt();
                    if (years < 5)
                    {
                        System.out.println("voter id card will be given later.");
                    }
                    else
                    {
                        System.out.println("here is your Voter id card");
                    }
                }
            }
            else
            {
                System.out.println("Not valid number entered");
            }
// Voter card


    }
}
