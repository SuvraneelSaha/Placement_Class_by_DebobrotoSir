public class O20_5_8_11 {
    public static void main(String[] args) {
        for (int i = 5,a=1; a <=15 ; i+=3)
        {
            if(a%3==0)
            {
                System.out.print(-i + " ");
            }
            else
            {

                System.out.print(i + " ");
            }
            a++;
        }
    }
}
