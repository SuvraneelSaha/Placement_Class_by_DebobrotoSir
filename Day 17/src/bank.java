 class bank
 {
    int b;
    String name;
    bank(int balance,String n) // constructor ; only once can be called
    {
        b=balance;
        name = n ;
    }
    void balance_enquiry()
    {
        System.out.println("your balance is "+b);
    }
     void withdraw(int n)
     {
         b=b-n;
         System.out.println("Rs "+n+"has been debited from your account");
     }
     void submit(int n)
     {
         b=b+n;
         System.out.println("Rs "+n+"has been credited to your account");
     }

}
// if objects are created then the objects have the same
 // same set of programs but different objects will have differet values
 // same functionality just for different users or objects
 // sign up - means object opening

 // in 1 class there is var , constructor and functions number may be varying but these are must


 // constructor -- no return type , name will be the same as class ,
 // only 1 time call can be done when the object is being made
 // operations can be done inside the constructor


 // we can call the object

