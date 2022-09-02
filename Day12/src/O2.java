public class O2 {
    /*
    import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
	    int n=sc.nextInt();

	    int a[]=new int[n];

	    for(int i=0;i<n;i++)
	        a[i]=i+1;

	    int count=2;
	    while(count<=n)
	    {
    	    int pos=0;
    	    int b[]=new int[n];
    	    for(int i=0,c=1;i<n;i++,c++)
    	    {
    	        if(c%count!=0)
    	        {
    	            b[pos]=a[i];
    	            pos++;
    	        }
    	    }
    		a=b;
    		n=pos;

    		for(int i=0;i<pos;i++)
    		{


}
