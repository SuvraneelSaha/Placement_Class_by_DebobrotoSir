public class O13 {
    public static void main(String[] args) {
        String s = "Rahul";
        System.out.println("The size of the String is "+s.length());

        for (int x = 0; x < s.length()  ; x++)
        {
            for (int i = 0; i <= x; i++)
            {
                System.out.print(s.charAt(i) + " ");
            }
            System.out.println();
        }
    }
}
