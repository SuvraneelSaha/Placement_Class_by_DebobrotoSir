package ShabNam_Milestone2_Mindtree;

import java.util.Scanner;
    public class DivideByZeroException
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            try {
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int result = num1 / num2;
                System.out.println(result);
            } catch (ArithmeticException e)
            {
                System.out.println(e.toString());
            }
        }
    }



