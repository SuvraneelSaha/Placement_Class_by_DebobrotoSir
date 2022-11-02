import java.util.Arrays;
import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Highest obj = new Highest(5,10); // parameterized Constructor by default
        // Jeta Bhetore aache Constructor sob kaaj kore debe
        

       obj.Find();
       obj.Display();
    }
}
// Highest Marks Question
class Record
{
    String[] names ;
    int[] marks;
    int size;

    Record(int cap)
    {
        this.size = cap;

        marks = new int[size];

        names = new String[size];


    }

    void ReadArray()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Names in the Array ");
        for (int i = 0; i < names.length; i++)
        {
            names[i] = in.nextLine();

        }

        System.out.println("Please enter the respective marks in the Array");
        for (int i = 0; i < marks.length; i++)
        {
            marks[i] = in.nextInt();
        }


    }

    void Display()
    {
        System.out.println("The size : "+size);
        System.out.println("The names present in the Array are :");
        for(String a:names) // enhanced for loop
        {
            System.out.println(a);
        }
        System.out.println("The marks present in the Array are ");
        for (int a : marks)
        {
            System.out.println(a);
        }


    }

}
class Highest extends Record
{
    int ind;

    Highest(int cap , int ind)
    {
        super(cap);

        this.ind = ind;

        super.ReadArray();


    }

    void Find()
    {
        int max = 0;

        for (int i = 0; i < marks.length; i++)
        {
                if(marks[i] > marks[max])
                {
                    max = i ;
                }
        }

        ind = max;

    }

    void Display()
    {
        System.out.println("The size : "+size);
        System.out.println("The names present in the Array are :");
        for(String a:names) // enhanced for loop
        {
            System.out.println(a);
        }
        System.out.println("The marks present in the Array are ");
        for (int a : marks)
        {
            System.out.println(a);
        }

        System.out.println("The Highest Marks : "+marks[ind]);
        System.out.println("The Name of the Student who got the Highest Marks : "+names[ind]);

    }


}
