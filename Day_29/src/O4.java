public class O4 {
    public static void main(String[] args) {
        // Wrapper Classes
        int a = 5 ;
        // primitive data type
        // this above line int a = 5 is a very strong abstraction

        System.out.println(a);
        Integer b = new Integer(10);
        System.out.println(b);

        String s = "12";
        System.out.println(Integer.parseInt(s)+1);
        // converting String to Interger
        // as both are objects - string class and the Integer class objects are both objects


        int c = 3213;
        String s1 = c +"";
        System.out.println(s1.length());
        // interger can be converted to String by using the above way
        // or we can use these
        s1=Integer.toString(c);
        System.out.println(s1+1);



    }
}
// 3d objects - sphere pyramid
// 3d and 2d both are in the same menu

