public class FibonacciSum {
    public static void main(String[] args) {

        int sum=0;
        for (int i = 1; i <=10 ; i++)
        {
            int x = 0;
            int y=1;

            int temp = x+y;
            x=y;
            y=temp;
            sum = sum+temp;
            x++;
            y++;
        }

        System.out.println(sum);

    }
}
// Eroor approach
// wrong
