import java.util.Arrays;
import java.util.Scanner;

public class O16 {
    public static void main(String[] args) {
        // check two strings are anagram or not
        Scanner in = new Scanner(System.in);

        String word1 = "pears";
        String word2 = "spare";

        char[] arr1 = Array(word1);

        char[] arr2 = Array(word2);

        System.out.println("Word Array 1 = "+ Arrays.toString(arr1));
        System.out.println("Word Array 2 = "+Arrays.toString(arr2));

        Arrays.sort(arr1);

        Arrays.sort(arr2);

        System.out.println("Is Anagram "+isAnagram(arr1,arr2));









    }
    public static Boolean isAnagram(char[] arr1 , char[] arr2)
    {
        if(arr1.length != arr2.length)
        {
            return false;

        }

        int flag = 1;
        for (int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] != arr2[i])
            {
                flag = 0;
                break;
            }
        }

        if(flag==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static char[] Array(String word)
    {
        char[] arr = new char[word.length()];

        for (int i = 0; i < word.length(); i++)
        {
            arr[i] = word.charAt(i);

        }
        return arr;

    }
}
