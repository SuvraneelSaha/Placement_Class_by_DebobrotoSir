public class O14_3DifferencePlusMinusUptoN {
    public static void main(String[] args) {
        for (int i = 4,a=1; a <=20 ; i+=3)
        {
            if(a%2==0)
            {
                System.out.print( i + " ");
            }
            else
            {
                System.out.print( -i + " ");
            }
            a++;
        }
    }
}
