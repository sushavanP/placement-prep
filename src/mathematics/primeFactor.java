package mathematics;

public class primeFactor {
    /* Naive method t.c = O(n^2 logn)
    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i < n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
    public static void factorsPrime(int num){
        for(int i = 2; i < num; i++){
            if(isPrime(i)){
                int x = i;
                while(num % x == 0){
                    System.out.print(i +" ");
                    x = x * i;
                }
            }
        }
    }
    */
    /*Efficient Method
    public static void factorsPrime(int num){
        if(num <= 1) return;
        for(int i = 2; i*i <= num; i++){
            while(num % i == 0){
                System.out.print(i);
                num = num/i;
            }
        }
        if(num > 1)
            System.out.print(num);
    }
    */
    //More efficient method t.c = theta(sqrt(n))
    public static void factorsPrime(int n) {
        if (n <= 1)
            return;
        while(n % 2 == 0){
            System.out.print(2);
            n = n/2;
        }
        while(n % 3 == 0){
            System.out.print(3);
            n = n/3;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            while(n % i == 0){
                System.out.print(i);
                n = n/i;
            }
            while(n % (i+2) == 0){
                System.out.print(i+2);
                n = n / (i+2);
            }
        }
        if(n > 3)
            System.out.print(n);
    }
    public static void main(String[] args){
        factorsPrime(450);
    }
}
