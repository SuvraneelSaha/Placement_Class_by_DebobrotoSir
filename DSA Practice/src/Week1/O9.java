package Week1;
// 1295. Find Numbers with Even Number of Digits
public class O9 {
    public static void main(String[] args) {

    }
    public int findNumbers(int[] arr) {
        int count=0;
        for(int i = 0 ; i< arr.length;i++)
        {
            if(isEven(arr[i]))
            {
                count++;
            }
        }
        return count;


    }
    public static boolean isEven(int n)
    {
        if(no_digits(n)%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int no_digits(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int count=0 ;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
}
