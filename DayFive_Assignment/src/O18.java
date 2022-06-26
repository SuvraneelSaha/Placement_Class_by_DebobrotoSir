public class O18 {
    public static void main(String[] args) {
    Pattern18(4);
    }
    public  static void Pattern18(int n)
    {
        int k = 1;
        for (int row = 0; row <n ; row++)
        {
            for (int col = 0; col <=row ; col++)
            {
                if(k%2==0)
                {
                    System.out.print(0 + " ");
                }
                else
                {
                    System.out.print(1 + " ");
                }
                k++;
            }
            System.out.println();
        }
    }
}
// wrong answer or o/p not matching with the given assignment
//