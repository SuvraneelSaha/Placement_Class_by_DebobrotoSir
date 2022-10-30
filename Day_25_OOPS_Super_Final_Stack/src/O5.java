import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        myStack s1 = new myStack(5);
        myStack s2 = new myStack(10);

        s1.push(10);
        s1.push(20);
        s1.push(30);

        s1.pop();
        s1.display();


    }
}

// Make queue class - from learning it from the YT video
// and make the stack class -- same process

class myStack
{
int r=-1;
int[] a;
    myStack(int sz)
    {
        a=new int[sz];
    }
    void push(int x)
    {
        if(r==a.length-1)
        {
            System.out.println("Stack is Full");
        }
        else
        {
            r=r+1;
            a[r]=x;
        }
    }
    void pop()
    {
        if(r==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println(a[r]+" got deleted");
            r=r-1;
        }

    }
    void display()
    {
        if(r==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("The elements of the Stack are:");
            for(int i=r;i>=0;i--)
            {
                System.out.print(a[i]+ " ");
            }
            System.out.println();
        }
    }


}