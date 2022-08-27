import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        // 2 , 3, 5 -- only prime numbers that can be used

        // i/p - 1,2,3,4,5,6,8,9,10,12,15,16,18,20
        // what will be the 11th term
        // for application 3.3
        Scanner in = new Scanner(System.in);
        System.out.println("enter nth term to find ");
        int n = in.nextInt();
        int a,i;
        for ( a = 1,i=1; a <=n ; i=i+1)
        {
            if(check(i) ==0 )
            {
               if(a==n)
               {
                   System.out.println(i);
               }
               a=a+1;
            }

        }


    }
    public static int check(int n)
    {


        int p = 2 ;

        int f=0;

        for (int i = n; i >1 ; )
        {
            if(p>5)
            {
                f=1;
                break;
            }
            if(i%p==0)
            {
                //System.out.println(p);
                i=i/p;

            }
            else
            {
                p++;
            }
        }

       return f;
    }
}
