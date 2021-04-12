package mathematics;

public class iterativePower {
    //t.c = O(log n), auxillary space = O(1)
    public static int power(int x, int n){
        int res = 1;
        while(n > 0){
            if(n%2 != 0){
                res = res * x;
                n = n / 2;
            }
            x = x*x;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.print(power(3, 3));
    }
}
