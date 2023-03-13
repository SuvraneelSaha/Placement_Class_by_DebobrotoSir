package Week1;

import java.util.Arrays;

public class O1 {
    public static void main(String[] args) {
        System.out.println( canConstruct("bg", "gbhgsd"));
    }
    public static boolean canConstruct(String r, String m)
    {
        if(r==null)
        {
            return false;
        }
        else if(m.contains(r))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
