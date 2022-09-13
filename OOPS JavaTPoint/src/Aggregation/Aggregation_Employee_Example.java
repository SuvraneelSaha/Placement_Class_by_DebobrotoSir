package Aggregation;

public class Aggregation_Employee_Example {
    public static void main(String[] args)
    {
        Address address1=new Address("gzb","UP","india");
        Address address2=new Address("gno","UP","india");

        Emp e=new Emp(111,"varun",address1);
        Emp e2=new Emp(112,"arun",address2);

       // e.displayName();
        //e.displayAddress();
        e2.displayName();
        e2.displayAddress();

    }
}
class Address
{
    String city,state,country; // declaration

     Address(String city, String state, String country) // this is the constructor
    {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}

class Emp
{
    int id;
    String name;
    Address address;
    // declaration above

     Emp(int id, String name, Address address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void displayName()
    {
        System.out.println(id + " " + name);
        //System.out.println(address.city + " " + address.state + " " + address.country);
    }
    void displayAddress()
    {
        System.out.println(address.city + " " + address.state + " " + address.country);
    }
}
