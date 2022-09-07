public class InterviewQuestion {
    public static void main(String[] args) {
        /*
        total number of elements - 7
        i/p - 6 , 4 , 9 , 10 , 34,56,54
        sum = 4 + 10 + 54
        first we will find the lowest element
        then we will delete the elements which are residing beside the minimum element

        Capgemini Interview Question
         */

        int[] arr = {6,4,9,10,34,56,54};
        int sum = 0 ;

        for(;arr.length>0;)
        {
            int[] brr = new int[arr.length];

            int pos = 0;

            int min = arr[0];
            int minpos=0;

            for (int j = 0; j < arr.length; j++)
            {
                if(arr[j]<min)
                {
                    min = arr[j];
                    minpos = j ;
                }
            }

            sum = sum + min;


            for (int i = 0; i < arr.length; i++) {
                if(i<minpos-1 || i>minpos+1)
                {
                    brr[pos] = arr[i];
                    pos++;
                }

            }
            int[] crr = new int[pos];
            for (int j = 0; j < pos; j++)
            {
                crr[j] = brr[j];
            }
            arr=crr;
        }
        System.out.println(sum);

    }
}
