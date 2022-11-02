public class O2 {
    public static void main(String[] args) {
    Purchase obj = new Purchase("oil",10,100,1000,5,11);
    obj.Update();
    obj.Display();
    }
}
// Stock and Purchase problem
// A Logical error is present in the update function

class Stock
{
    String item_name;
    int quantity;
    double rate;
    double amount;

    Stock(String item,int quantity,double rate,double amount)
    {
        this.item_name = item;
        this.quantity = quantity;

        this.rate = rate;
        this.amount =amount;
    }

    void  Display()
    {
        System.out.println("item Name "+item_name);
        System.out.println("Quantity of Stock "+quantity);
        System.out.println("Unit Price of the Item "+rate);
        System.out.println("net value "+amount);

    }

}
class Purchase extends Stock
{
    int p_quantity;
    double p_rate;

    Purchase(String item,int quantity,double rate,double amount,int p_quantity,double p_rate)
    {
        super(item,quantity,rate,amount);
        this.p_quantity = p_quantity;
        this.p_rate = p_rate;

    }
    void Update()
    {
        p_quantity = p_quantity + super.quantity;

        if(super.rate != p_rate)
        {
            p_rate = super.rate;

        }

        super.amount = super.quantity * super.rate;

    }

    void Display()
    {
        super.Display();
        System.out.println("Purchased quantity: "+p_quantity+" Kg");
        System.out.println("Unit rate of the purchased Item: Rs"+p_rate);

    }
}
