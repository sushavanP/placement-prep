package mathematics;

public class gcdNumber {
    /* Naive Solution t.c = O(min(a,b))
    public static int gcd(int a, int b){
        int res = Math.min(a, b);
        while(res > 0){
            if(a % res == 0 && b % res == 0)
                break;
            res--;
        }
        return res;
    }
    */
    //Effective Solution using Euclidean Algorithm t.c = O(log(min(a,b))
    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        else return gcd(b, a%b);
    }
    public static void main(String[] args){
        System.out.print(gcd(10, 15));
    }
}
