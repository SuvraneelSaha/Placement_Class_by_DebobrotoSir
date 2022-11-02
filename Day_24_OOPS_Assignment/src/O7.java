import java.util.Arrays;

public class O7 {
    public static void main(String[] args) {
    SwapSort obj = new SwapSort("wigga",5,"wigga","wigga");
    obj.Display();
    }
}
// Swap Word Question
class SwapSort
{

    String word;
    int len;
    String swap_word;
    String sort_word;

    SwapSort(String word,int len,String swap_word,String sort_word)
    {
        this.word = word;
        this.len = len;
        this.swap_word = swap_word;
        this.sort_word = sort_word;

    }
    void ReadWord()
    {
        // not needed
    }
    void SwapChar()
    {
        char[] arr = new char[word.length()];
        for (int i = 0; i < word.length(); i++)
        {
            char a = word.charAt(i);
            arr[i] = a;
        }

        // Swap

        char temp = arr[0];
        arr[0] = arr[word.length()-1];
        arr[word.length()-1] = temp;

        swap_word = Arrays.toString(arr);



    }
    void SortWord()
    {
        char[] arr = new char[word.length()];
        for (int i = 0; i < word.length(); i++)
        {
            char a = word.charAt(i);
            arr[i] = a;
        }
         Arrays.sort(arr);
        sort_word=Arrays.toString(arr);



    }
    void Display()
    {
        SwapChar();
        SortWord();
        System.out.println("Original Word "+word);
        System.out.println("Swapped Word "+swap_word);
        System.out.println("Sorted Word"+sort_word);

    }
}
