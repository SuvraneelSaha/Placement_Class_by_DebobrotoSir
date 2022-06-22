public class O15_3DifferencePlusMinus {
    public static void main(String[] args) {
        for (int i = 3,a=1; i <50 ; i+=3)
        {
            if(a%3==0)
            {
                System.out.print( -i + " ");
            }
            else
            {
                System.out.print(i + " ");
            }
            a++;
        }
    }
}
