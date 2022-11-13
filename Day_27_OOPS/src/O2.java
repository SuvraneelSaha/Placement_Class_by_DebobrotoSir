import java.util.Scanner;
import java.util.*;
public class O2 {
    public static void main(String[] args) {
        // we will understand the implentation of Arraylist
        Scanner in = new Scanner(System.in);


        // Hashmap - can have two parameters
        // Strings and Strings , or int with Strings

       // ArrayList<Integer> al = new ArrayList<Integer>();
       myArrayList al = new myArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);
        al.add(2,100);
        // this al.add is the method overloading
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.get(2));

        for (int i = 0; i < al.size(); i++)
        {
            System.out.println(al.get(i));

        }

        // whenever we try to print an object
        // by default it will search for toString method internally



        // Important -
        // At the end of the day Arraylist is a Class

    }
}
// by this example we can achieve abstraction
class myArrayList
{
   private int[] arr = new int[0];
    // arraylist er bhetore ekta lokanao array thake
    int size()
    {
        return arr.length;
    }
    int get(int pos)
    {
        return arr[pos];
    }
    boolean isEmpty()
    {
        if(arr.length ==0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    void remove(int pos)
    {
        int temp[] = new int[arr.length-1];
        for (int i = 0,j=0; i < arr.length ; i++)
        {
            // all the index position values will be added except
            // the pos index value

            if(i!=pos)
            {
                temp[j] = arr[i];
                j++;
            }
        }
        arr=temp;
    }



    void add(int x)
    {
        int temp[] = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++)
        {
            temp[i] = arr[i];
        }
        temp[temp.length-1] =x;
        arr = temp;

        // Above
        // Dynamic Array
        // ekta besi jaiga niye

    }
    // abstraction means giving the simplicity
    // It focusses on What it is doing rather than how it is doing

  public String toString()
          // for printing the object
          // we need to assign the toString method

    {
        String s ="[";
        for (int i = 0; i <= arr.length-2; i++)
        {
            s=s+arr[i] +", ";

        }
        s=s+arr[arr.length-1]+"]";
        return s;
    }
    void add(int pos,int x)
    {


        // arraylist er bhetore ekta lokanao array thake

            int temp[] = new int[arr.length+1];
            int i ;


            for (i = 0; i < pos; i++)
            {
                temp[i] = arr[i];
            }
            temp[pos] =x;
            for (int j = pos+1; j < temp.length ; j++)
            {
                temp[j] = arr[i];
                i++;
            }
            arr = temp;



        }

}