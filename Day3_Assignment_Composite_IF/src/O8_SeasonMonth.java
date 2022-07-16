import java.util.Scanner;

public class O8_SeasonMonth {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter the month Ranging from 1 - 12 ");
       int n = in.nextInt();

       if(n==12||n==1||n==2)
       {
           System.out.println("Winter");
       }
       else if(n==3||n==4||n==5)
       {
           System.out.println("Summer");
       }
       else if(n==6||n==7||n==8)
       {
           System.out.println("Monsoon");
       }
       else if(n==9||n==10||n==11)
       {
           System.out.println("Autumn");
       }
       else
       {
           System.out.println("Invalid input");
       }
    }
}
