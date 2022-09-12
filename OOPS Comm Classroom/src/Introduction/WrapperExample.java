package Introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;

        System.out.println("After changing :");

        Swap(a,b);

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        // still not passing due to the final keyword present in the Integer class

    }
    static void Swap(Integer a , Integer b)
    {
        int temp = a ;
        a=b;
        b=temp;
    }
}
