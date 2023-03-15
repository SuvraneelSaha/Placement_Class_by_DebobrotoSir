package Week1;
// ransom Note leetcode - final ans
public class O5 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aaa","aab"));

    }

    public static boolean canConstruct(String ransomNote, String magazine)
    {
        if(ransomNote.length()>magazine.length())
        {
            return false;

        }
        int[] char_count = new int[26];
        // incrementing the frequency of the characters present in the magazine
        // via the char count array
        //
        for(char ch : magazine.toCharArray())
        {
            char_count[ch-'a']++;
        }

        // now we are checking if the number of frequency of characters in the ransom note
        // matches the char count which we derived from the magazine
        // if it is more than the frequency of the magazine character elements
        // then false


        for(char ch : ransomNote.toCharArray())
        {
            if(char_count[ch-'a']<=0)
            {
                return false;
            }
            char_count[ch-'a']--;

        }
        return true;

    }
}
