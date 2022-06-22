public class Fibonacci {
    public static void main(String[] args) {
        int x = 0 ,y=1;
        //System.out.print(x+" "+y+" ");
        int sum=0;
        for (int i = 1; i <=10 ; i++)
        {
            sum =sum + x;
            int temp = x+y;
            x=y;
            y=temp;

        }
        System.out.println(sum);
    }
}
// a will be treated as number of terms
// check if correct or not
// seems like it is wrong
