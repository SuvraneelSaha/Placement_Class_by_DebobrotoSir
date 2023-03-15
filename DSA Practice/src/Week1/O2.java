package Week1;
// ransom note solution 1

public class O2 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));


    }
    public static boolean canConstruct(String ransomNote, String magazine)
    {
        char[] mc = magazine.toCharArray(), rc = ransomNote.toCharArray();
        int[] map = new int[128];
        for(char c: mc)
        {
            map[c]++;
        }

        for(char c: rc)
        {
            if(--map[c] < 0) return false;
        }
        return true;
    }
}
