public class O7 {
    public static void main(String[] args) {
        Area obj = new Area(4,200,10,20);


    }
}
class Perimeter
{
    double len , breath;
    Perimeter(double a,double b)
    {
        len = a ;
        breath = b;
    }
    double Calculate()
    {
        return 2*(len+breath);
    }
    void show()
    {
        System.out.println(len + " "+breath);
        System.out.println(Calculate());

    }
}
class Area extends Perimeter
{
    double h,area;

    Area(double hhh, double ar,double aaa, double bbb)
    {
        super(aaa,bbb);
        h=hhh;
        area = ar;

    }

    void doarea()
    {
        area = breath*h;
    }

    void show()
    {
        System.out.println(h);
        super.show();
        System.out.println(area);
    }
}