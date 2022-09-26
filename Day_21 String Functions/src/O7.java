public class O7
{
    public static void main(String[] args)
    {
        String s = "Happy New Year";
        // to char array
        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++)
        {
            arr[i] = s.charAt(i);
        }

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
        }
    }
}

/*

This year is the Year
oppurtunity that comes in a lifetime yoo

 */
