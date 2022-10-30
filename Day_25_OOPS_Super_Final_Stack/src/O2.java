public class O2 {
    public static void main(String[] args)
    {
        // what is the meaning of psvm ?
        // what is the static keyword ?

        Bank ankit = new Bank();

        Bank Arya = new Bank();

        ankit.age = 20;
        ankit.b = 20000;

        Arya.age = 21;
        // Bank.a = 21 ;
        // we can use class name for clear cut understanding
        // Bank.a = 22; // this is the result not the cause
        // we can access data using the class name . variable


        Arya.b = 21000;

        System.out.println(ankit.age +" "+ ankit.b);
        System.out.println(Arya.age +" "+ Arya.b);


        // Bank.a = 20 ; this will get executed
        // as it will be of class level
        // sbi bank name change example
        // it may happen that the sbi bank changes its name in the
        // Future so that people can use it


        // Constant keyword is used for making a var constant


    }
}
class Bank
{
   static int b; // balance
    // in case of Static -- it is one version
    // ex - x = 10 ;
    // x=20 ;
    // therefore x = 20 ;
    // in this case , b will be the same for the two objects
    // but the age will be different

    int age;
}
