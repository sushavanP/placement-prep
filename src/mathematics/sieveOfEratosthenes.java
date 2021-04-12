package mathematics;
//Based on Sieve of Eratosthenes Algorithm t.c = O(n log log n)

import java.util.Arrays;

public class sieveOfEratosthenes {
    public static void printPrimeSieve(int n){
        if(n <= 1) return;
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for(int j = i*i; j <= n; j = j+i)
                    isPrime[j] = false;
            }
        }
        for(int i = 2; i <= n; i++){
            if(isPrime[i])
                System.out.print(i +" ");
        }
    }
    public static void main(String[] args){
        printPrimeSieve(343);
    }
}
