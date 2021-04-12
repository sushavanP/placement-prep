package mathematics;

public class lcmNumber {
    /* Naive Solution t.c - O(a*b - Max(a,b))
    public static int lcm(int a, int b){
        int res = Math.max(a, b);
        while(true){
            if(res%a == 0 && res%b == 0)
                break;
            res++;
        }
        return res;
    }
    */
    /*
    Efficient Solution
    lcm = a*b/gcd(a,b)
    t.c = O(log(min(a,b))
    */
    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        else return gcd(b, a%b);
    }
    public static int lcm(int a, int b){
        return a*b/gcd(a, b);
    }
    public static void main(String[] args){
        System.out.print(lcm(4, 6));
    }
}
