import java.util.InputMismatchException;

public class O3 {
    public static void main(String[] args)
    {
        //throw new InputMismatchException();
        // this throws an unreachable statement


        try
        {
            throw  new InputMismatchException();
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        //  Exception must be caught or declared to be thrown
        // must be catch
        // or decalared to be thrown


    }
}
