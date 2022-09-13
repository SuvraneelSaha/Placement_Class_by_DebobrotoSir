package Polymorphism_Runtime_And_CompileTime;

public class O4_BankPolyMorphism {
    public static void main(String args[]){
        Bank b;
        b=new SBI();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b=new ICICI();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        b=new AXIS();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
    }
    // Upcasting is necessary in case of Runtime Polymorphism
    // method overriding is an example of Runtime Ploymorphism with just upcasting
    // and method overloadting is an example of CompileTime Polymorphism


}
class Bank
{
    float getRateOfInterest(){return 0;}
}
class SBI extends Bank
{
    float getRateOfInterest(){return 8.4f;}
}
class ICICI extends Bank
{
    float getRateOfInterest(){return 7.3f;}
}
class AXIS extends Bank
{
    float getRateOfInterest(){return 9.7f;}
}

