import java.util.Arrays;

public class O7 {
    /*
    11203458760011
    Count the frequency of each number :
    Frequency of 0 : 3
    Frequency of 1 : 4
    ..
     */

    public static void main(String[] args) {
        String s = "11203458760011";
        int count = 0 ;
        int b = 0 ;
        int[] arr = new int[s.length()];
        for (int i = 0,k=0; i < s.length(); i++,k++)
        {
            char c= s.charAt(i);
            String ch = c+"";
            int a = Integer.parseInt(ch);
            arr[k] = a;

        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j <arr.length; j++)
            {


                if (arr[i] == arr[j])
                {
                    count++;
                }
                System.out.printf("Freuency of %d is %d",arr[i],count);
                System.out.println();

            }
        }


    }
}
