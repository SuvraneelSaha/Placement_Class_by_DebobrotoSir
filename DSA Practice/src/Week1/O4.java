package Week1;

public class O4 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aaa","aab"));

    }
    public static boolean canConstruct(String ransomNote, String magazine)
    {
        int[] char_count = new int[26];

        for (int i = 0; i < magazine.length(); i++)
        {
            char_count[magazine.charAt(i) -'a']++;

        }
        for (int i = 0; i < ransomNote.length(); i++)
        {
            if(--char_count[ransomNote.charAt(i)-'a'] < 0)
            {
                return false;
            }
        }
        return true;

    }
}
