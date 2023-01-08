import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bank accnt[] = new bank[0];
        // we will be creating a dynamic array approach
        boolean loop = true;
        while (loop) {
            System.out.println("Press 1 to sign in IN , Press 2 for sign up");
            int ch = in.nextInt();


            if (ch == 1) {
                System.out.println("Enter your userid");
                String u = in.next();
                int usid = Integer.parseInt(u.substring(4));
                if (usid >= accnt.length)
                {
                    System.out.println("UserId does not exist");
                }
                else
                {


                    System.out.println("Enter your password");
                    String p = in.next();


                    if (accnt[usid].check(p))
                    //p.equals(accnt[usid].passwd) instead of pulling we are psuing
                    //here we are actually implementing the encapsulation

                    {

                        System.out.println("Successful Sign in");
                        System.out.println("Hi" + accnt[usid].name + "successful signin");
                        boolean l = true;
                        while (l) {


                            System.out.println("Press 1 for Balance Enquiry");
                            System.out.println("Press 2 for submit");
                            System.out.println("Press 3 for withdraw");
                            System.out.println("press 4 for logout");

                            int ch1 = in.nextInt();

                            if (ch1 == 1) {

                            } else if (ch1 == 2) {

                            } else if (ch1 == 3) {
                                System.out.println("Enter the amount you want to withdraw");
                                int amt = in.nextInt();
                                accnt[usid].withdraw(amt);

                            } else if (ch1 == 4) {
                                l = false;
                            } else {
                                System.out.println("Password Mismatch , Try again");
                            }
                        }

                    }
                }
            }


            else if(ch==2)
            {
                System.out.println("Enter Your name");
                String n = in.next();

                System.out.println("Enter your initial balance");
                int b = in.nextInt();

                System.out.println("Enter a Password");
                String p = in.next();



                bank temp[] = new bank[accnt.length+1];
                // dynamic array approach
                // intial size was 0

                for (int i = 0; i <= accnt.length-1 ; i++) {
                    temp[i] = accnt[i];
                }
                temp[temp.length-1] = new bank(b,n,p);
                accnt = temp;
                System.out.println("your account has been created");
                System.out.println("Your user id is "+(temp.length-1));
            }
            else if(ch==3)
            {
                loop = false;
            }
            else
            {
                System.out.println("Invalid Choice");
            }

        }


    }
        }

class bank
{
    int b;
    String name;
   private String passwd;
   // real time scneario
    // where encapsulation works in real life

    bank(int bb,String n,String p)
    {
        b=bb;
        name = n;
        passwd=p;

    }
    boolean check(String p)
    {
        return (p.equals(passwd));
    }
    void balance_enquiry()
    {

        System.out.println("Hi"+name+"your balance is "+b);
    }
    void withdraw(int x)
    {
        if(x<=b)
        {
            b=b-x;
            System.out.println("Hi"+name+"Rs."+"your balance is "+b);
        }
        else
        {
            System.out.println("insufficient balance");
        }
    }
    void submit(int x)
    {
        b=b+x;
        System.out.println("hi"+name+"Rs."+x+"is credited into your account");

    }
}

// password should be incalpsulated