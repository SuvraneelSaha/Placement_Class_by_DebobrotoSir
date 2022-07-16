public class O16_4DifferenceUpto20Terms {
    public static void main(String[] args) {
        for (int i = 4,a=1; a <=20 ; i+=4)
        {
            if(a%3==0)
            {
                System.out.print(i +" ");

            }
            else
            {
                System.out.print( -i + " ");

            }
            a++;

        }
    }
}
