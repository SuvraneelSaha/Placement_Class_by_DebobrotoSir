public class O8 {
    public static void main(String[] args) {

        banksbi ob1 = new banksbi();
        banksbi ob2 = new banksbi();
        banksbi ob3 = new banksbi();

        banksbi.b = 10 ;
        banksbi.b = 30 ;
        banksbi.b = 20 ;
        ob1.x = 100;
        ob2.x = 200;
        ob3.x = 300;

        System.out.println(banksbi.b + " " + ob1.x);
        System.out.println(banksbi.b+ " " + ob2.x);
        System.out.println(banksbi.b + " " + ob3.x);
    }
}

class banksbi
{
   static  int b; // same variable for each objects
    int x;
}

// in case of var final will make it a constant
// method - overriidn stpop
// class - stop inheritance

