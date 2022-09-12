public class O12 {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Bpple";
        System.out.println(s1.compareTo(s2));
        // s1 - (s2)  imagine this as
        // o/p -- -1
        // if the length is the same
        // then ascii character difference


        String s3="Cricket";
        String s4="Crick";

        System.out.println(s3.compareTo(s4));
        // always imagine this .compareTo with - sign


        // when the length is different then it gives the difference
        // between the two strings



    }
}
