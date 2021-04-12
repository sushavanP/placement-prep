package bitwiseMagic;

public class powerOfTwo {
    /* Naive Solution
    public static boolean checkPower(int n){
        if(n == 0)
            return false;
        while(n != 1){
            if(n % 2 != 0)
                return false;
            n = n/2;
        }
        return true;
    }
    */
    // Efficient Solution
    public static boolean checkPower(int n){
        if(n == 0)
            return false;
        return ((n & (n - 1)) == 0);
    }
    public static void main(String[] args){
        System.out.println(checkPower(8));
    }
}
