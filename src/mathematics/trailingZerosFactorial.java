package mathematics;

public class trailingZerosFactorial {
    /* Naive Solution
    public static int zeroFact(int n){
        int sum = 1;
        for(int i = 2; i <= n; i++)
            sum = sum*i;
        int res = 0;
        while(sum % 10 == 0){
            res++;
            sum = sum/10;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.print(zeroFact(10));
    }
    */
// Efficient Solution
    public static int zeroFact(int n){
        int res = 0;
        for(int i = 5; i <= n; i = i*5)
            res = res + n/i;
        return res;
    }
    public static void main(String[] args){
        System.out.print(zeroFact(251));
    }
}
