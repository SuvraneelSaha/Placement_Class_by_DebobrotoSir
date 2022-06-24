public class O11 {
    public static void main(String[] args)
    {
       int i ,x ;
       for (x =1 ;  x<=6;x++) // for rows
       {
           for (i=1;i<=x;i++) // for spaces
               // the gaps or spaces is increasing in order
           {
               System.out.print("-");
           }
           for (i=x;i<=6;i++) // for printing
               //  the number or stars are decreasing in order
           {
               System.out.print("x");
           }
           System.out.println();
       }
    }
}

/*



 */

