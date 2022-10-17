public class O7 {
    // Without function try the prime number problem from
    // functions assignment
    public static void main(String[] args) {
        int n = 666;
        if(sod(n)==sopf(n))
        {
            System.out.println("Smith Number");
        }
        else
        {
            System.out.println("Not");
        }

    }

    // flag value reset korte bhule jaay lokera
    // oota mone rakh

    public static int sod(int n)
    {
        int sum =0;
        for (int i = n; i >0 ; i=i/10)
        {
            sum = sum + (i%10);

        }
        return sum;

    }
    public static int sopf(int n) // sum of prime factors
    {
        int sum = 0 ;
        int p = 2 ;
        for (int i = n; i >1 ; )
        {
            if(i%p==0)
            {
                sum = sum + sod(p);
                i=i/p;

            }
            else
            {
                p=p+1;
            }
        }
        return sum;

    }
}
// for loop application exercise needed
