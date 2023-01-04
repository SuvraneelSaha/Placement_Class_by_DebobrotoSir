public class Ankit_BigD_Code {
    public static void main(String[] args) {
        int N=45;
        int count=0;
        int X=0;
        int distance=24;
        for(int x=N;count<2;x++)
        {
            int rev=0;
            for(int i=x;i>0;i=i/10)
            {
                rev=(rev*10)+(i%10);
            }
            if(rev==x)
                count++;
            X=rev;
        }
        for(int x=N;count<5;x--)
        {
            int rev=0;
            for(int i=x;i>0;i=i/10)
            {
                rev=(rev*10)+(i%10);
            }
            if(rev==x)
                count++;
            X=rev;
        }
        System.out.print(X);
    }
}
