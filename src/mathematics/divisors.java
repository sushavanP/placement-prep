package mathematics;

public class divisors {
    /* Naive Solution, t.c = theta(n), Auxillary Space = theta(1)
    public static void printDivisors(int n){
        for(int i = 1; i <= n; i++){
            if(n%i == 0)
                System.out.print(i +" ");
        }
    }
    */
    //Efficient Solution
    public static void printDivisors(int n){
        int i;
        for(i = 1; i*i < n; i++){
            if(n%i == 0)
                System.out.print(i +" ");
        }
        for(; i >= 1; i--){
            if(n%i == 0)
                System.out.print(n/i +" ");
        }
    }
    public static void main(String[] args){
        printDivisors(15);
    }
}
