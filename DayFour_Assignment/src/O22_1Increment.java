public class O22_1Increment {
    public static void main(String[] args) {
        for (int i = 2,a=0; a <10 ; i++) {

            i=i+a;
            System.out.print(i + " ");

            a++;
        }
    }
}
// 2 4 7 11 16
// IMPORTANT POINT TO REMEMBER :
// THE I WILL NOT GET REINITIALIZED ONCE THE FOR LOOP IS IN ACTION
// EX - for(int i = 2 ; i<=100 ; i=i+3)
/*
        then in the first iteration i will be sout  --- > 2
        then in 2nd time ---> 5
        then in 3rd time ---> 8
        POINT --> THE I'S INITIAL VALUE WONT BE CONSIDER OR COME INTO PLAY IN THE FOR LOOP


 */