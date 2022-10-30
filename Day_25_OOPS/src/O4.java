import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = 0, size, r = -1;
        System.out.println("Enter size of array");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter choice");
        while (loop < 1) {
            System.out.println("Enter 1 for push");
            System.out.println("Enter 2 for pop");
            System.out.println("Enter 3 for dislay");
            System.out.println("Enter 4 for exit");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1: {
                    if (r == a.length - 1)
                    {
                        System.out.println("Stack is Full");
                    }

                    else
                    {
                        r = r + 1;
                        System.out.println("Enter value to be inserted");
                        a[r] = sc.nextInt();
                   }
            }

                break;
                case 2:
                {
                    if (r == -1)
                    {
                        System.out.println("Stack is Empty");
                    } else
                    {
                        System.out.println(a[r] + " got deleted");
                        r = r - 1;
                    }

                }
                break;
                case 3:
                {
                    if (r == -1)
                    {
                        System.out.println("Stack is Empty");

                    } else
                    {
                        System.out.println("The elements of the Stack are:");
                        for (int i = r; i >= 0; i--)
                        {
                            System.out.print(a[i] + " ");
                        }
                        System.out.println();
                    }

                    break;
                }
                case 4:
                {
                    loop = 1;
                }
                break;
                default:
                    System.out.println("Enter a valid input");
            }
        }
    }
}


