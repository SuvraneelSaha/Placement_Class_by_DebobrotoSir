public class O12 {
    public static void main(String[] args) {
        int i,x;
        for (x=1;x<=7;x++)
        {
            int z =1 ; // no change for z -- z is for printing the pattern
            for (i = 1;  i<=x ; i++)
            {
                System.out.print(z);
                z=z+1;
            }
            System.out.println();
        }
    }
}
//
/*
1
12
123
1234
12345
123456
1234567
 */