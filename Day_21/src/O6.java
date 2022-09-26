public class O6 {
    public static void main(String[] args) {
        // 8.2 Assignment
        String s = "  Happy        New     Year  ";
        int i,j;
        for ( i = 0; i <s.length() ; i++)
        {
            if(s.charAt(i)!= ' ')
            {
                break;
            }

        }

        for ( j = s.length()-1; j >=0 ; j--)
        {
            if(s.charAt(j)!=' ')
            {
                break;
            }
        }

        for (int k = i; k <=j ; k++)
        {
            System.out.print(s.charAt(k));
        }
    }
}
