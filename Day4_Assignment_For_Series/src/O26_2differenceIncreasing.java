public class O26_2differenceIncreasing {
    public static void main(String[] args) {
        for (int i = 5,a=1,j=0; a <=10 ; a++,i=i+j)
        {
            System.out.print(i + " ");
            j=j+2;
        }
    }
}
// 5 7 11 17 ...