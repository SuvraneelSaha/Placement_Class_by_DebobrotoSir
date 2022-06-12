import java.util.Scanner;

public class O18_SalaryTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Salary ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int sal = in.nextInt();
        if(sal<0)
        {
            System.out.println("Invalid marks "+sal);
        }


        if(sal<10000)
        {
            System.out.println("No tax "+sal);
        }
         if(sal>=10000)
        {
            if(sal<20000)
            {
                System.out.println("10% tax  "+sal );
            }
        }
         if(sal>=20000)
        {
            if(sal<=30000)
            {
                System.out.println("20% tax " +sal);
            }
        }
        if(sal>30000)
        {
            System.out.println("30% tax "+sal);
        }
    }
}
// tried with else if but no results but with else if
// we are getting the desired results
// why is it happening