import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        // first is the logic
        // then everything else like functions and pointers
        // class and objects
        // first first - logic
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the Stack ");
        int n = in.nextInt();
        int[] arr = new int[n];

        int t=-1 ; // top of the stack

        int loop = 0 ;
        while (loop<1)
        {
            // we are using abstraction
            System.out.println("enter 1 for Push ");
            System.out.println("enter 2 for pop ");
            System.out.println("enter 3 for display ");
            System.out.println("enter 4 for exit ");
            int choice = in.nextInt();

            if(choice==1) // pop
            {
                if(t==n-1)
                {
                    System.out.println("Stack is Full");

                }
                else
                {


                    System.out.println("enter the value to be inserted ");
                    int val = in.nextInt();
                    t = t + 1; // now in the 1st iteration it is  0

                    arr[t] = val;
                }
            }
            else if(choice==2) // for delete
            {
                // moja is important
                // bhoy bhoy bacha jaay na
                if(t==-1)
                {
                    System.out.println("Stack is empty :");
                }
                else
                {
                    System.out.println(arr[t] + " is deleted");
                    t= t-1;
                }
            }
            else if(choice==3) // for display 
            {
                if(t==-1)
                {
                    System.out.println("Stack is empty :");
                }
                else
                {
                    // feel is important
                    // the t is starting from -1
                    for (int i = t; i >=0 ; i--)
                    {
                        System.out.println(arr[i]);
                    }
                }
            }// actually there is no delete in a system
            else if(choice==4)
            {
                loop = 1 ;
            }
            else
            {
                System.out.println("Please enter a valid input ");
            }
            
            

        }

        // homework - Queue
        // aage aasle aage serve


    }
}
