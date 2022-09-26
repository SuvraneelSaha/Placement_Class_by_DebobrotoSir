public class O8 {
    public static void main(String[] args) {
        /*
        String is immutable


         */
        String s ="SUVRANEEL";
        System.out.println(s);
        s=s.substring(1,s.length());
        // s er kono role ei nei
        // ami onno kono variable oo nite pari
        // as a third variable
        // so s er kono role nei
        // assignment operator needed


        System.out.println(s);

        // or

        StringBuffer s1 = new StringBuffer("Suvraneel");
        // no assignment needed
        //

        s1.deleteCharAt(0);
        System.out.println(s1);


    }
}
