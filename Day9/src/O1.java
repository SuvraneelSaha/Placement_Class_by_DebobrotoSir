public class O1 {

        public static void main(String[] args)
        {
            int[] a ={10,20,30,10,10,20,40};

            for(int j=0;j<a.length;j=j+1)
            {
                int val=a[j];
                int found=0;
                for(int i=0;i<j;i=i+1)
                {
                    if(a[i]==val)
                    {
                        found=1;
                    }
                }
                if(found==0)
                {
                    int c=0;
                    for(int i=0;i<a.length;i=i+1)
                    {
                        if(a[i]==val)
                        {
                            c=c+1;
                        }
                    }
                    System.out.println("frequency of "+val+" is "+c);
                }
            }
        }
    }


