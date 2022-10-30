public class O3 {
    public static void main(String[] args) {

//        final  int a =10;
//        int b = 20;
//
//        a++;
//        b++;
//
//        System.out.println(a +" "+b);

        // Here Final makes a var a constant
        // and it gives compilation time error

     Bank2 shimli = new Bank2();
        System.out.println(shimli.b);
        shimli.meth();

// everything is object in java
        // Wrapper Class is an Example


    }

}

 class Bank1

    // final keyword before a class
    // stops inheritance
    // cannot inherit from final Bank1 -- compilation time error
    // Stops Exteneds of a parent  class

{
    final int b = 10 ;
    // in case of final keyword in front of b variable
    // makes the b variable of that specific class constant
    // ie overrriding is possible in case of final variable
    //
    // variable access cannot be made to access to anyone
    // only the methods are exposed
    // ex - Scanner class methods we dont know the vars inside the
    // Scanner class


     void meth()
             // Final
            // stops method overriding

    {
        System.out.println("Hi");
    }
}
class Bank2 extends  Bank1
{
    int b = 20 ;
    void meth()
    {
        System.out.println("Hello");
    }
}

