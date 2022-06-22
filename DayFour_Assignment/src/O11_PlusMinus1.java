public class O11_PlusMinus1 {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++)
        {
            if(i%2==0)
            {
                System.out.print(-i + " ");

            }
            else
            {
                System.out.print(i + " ");
            }

        }
    }
}
// 1st step - Print the series first without thinking about + and - signs
//  2nd step - inside the for loop check whether the ith position is even or odd
// at even places --> minus
// and at odd placed --> plus
//