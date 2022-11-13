import java.util.Scanner;

import java.io.*;

public class O4 {
    public static void main(String[] args) throws Exception {
        // Scanner Class


        // Scanner in = new Scanner(System.in);

        myScanner in = new myScanner();
        System.out.println("Enter a value ");
        int x = in.nextInt();

        System.out.println(x);

    }
}

class myScanner
{
    int nextInt() throws Exception
    {

        // java genuine low level class for taking input
        // Core
        // Scanner oonek pore eseche
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int x = Integer.parseInt(s);
        return x;

    }
}
