public class O21_5Difference {
    public static void main(String[] args) {
        for (int i = 11,a=1; a <=15 ; i+=5)
        {
            if(a%3==0)
            {
                System.out.print(i + " ");
            }
            else
            {
                System.out.print(-i + " ");

            }
            a++;
        }
    }
}
