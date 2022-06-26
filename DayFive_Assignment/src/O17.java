public class O17 {
    public static void main(String[] args) {
    Pattern17(4);
    }
    static void Pattern17(int n)
    {
        int k = 1;
        for (int row = 1; row <=n ; row++)
        {
            for (int col = 1; col <=row ; col++)
            {
                  if(k%2==0)
                  {
                      System.out.print(1 + " ");
                  }
                  else
                  {
                      System.out.print(0 +" ");
                  }
                  k++;
            }
            System.out.println();
        }
    }
}
