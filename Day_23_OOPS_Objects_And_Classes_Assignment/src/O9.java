import java.util.Scanner;

public class O9 {
    public static void main(String[] args) {
        // Fruit Juice

        FruitJucie obj = new FruitJucie();
        obj.input();
        obj.discount();
        obj.display();
    }
}
class FruitJucie
{
    int product_code;
    String Flavour;
    String pack_type;
    int pack_size;
    int product_price;



    FruitJucie()
    {
        System.out.println("A new object is created !!");
    }

    void input()
    {
        // store the product code
        // store the flavour
        // store the pack_type ;
        // pack size
        // product price
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the product code Number:");
        product_code = in.nextInt();
        System.out.println("Please enter the Flavour of the Juice:");
        Flavour = in.nextLine();
        Flavour = in.nextLine();
        System.out.println("Please enter the pack type :");
        pack_type = in.nextLine();
        System.out.println("Please enter the pack size :");
        pack_size = in.nextInt();
        System.out.println("Please enter the product price:");
        product_price = in.nextInt();


    }

    void discount()
    {
        // reduce the product price by 10

        product_price = product_price - 10;
    }

    void display()
    {
        // product code , flavour , pack type , pack size , product price

        System.out.println("Product Code :"+product_code);
        System.out.println("Flavour :"+Flavour);
        System.out.println("Pack type :"+pack_type);
        System.out.println("Pack Size :"+pack_size);
        System.out.println("Product price:"+product_price);
    }
}
