public class Question2 {
    public static void main(String[] args) {
        // first understand the requirement
        // 212562879126
        // o/p -- 2 2 6 2 8 2 6

        String s="212562879126";
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            String ch = c+""; // + "" is a string
            int a = Integer.parseInt(ch); // converting the string into int
            if(a%2==0)
            {
                System.out.println(a);
            }


        }
    }
}
