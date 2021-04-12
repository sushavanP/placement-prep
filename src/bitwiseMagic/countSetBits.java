package bitwiseMagic;

public class countSetBits {
    /* Naive Solution t.c = theta(total bits of n)
    public static void countSet(int n){
        int res = 0;
        while(n > 0){
           if((n & 1) == 1)
               res++;
           n = n >> 1;
        }
        System.out.println(res);
    }
    */
    /*Brian and Kerningham Algorithm t.c = theta(set bits)
    public static void countSet(int n){
        int res = 0;
        while(n > 0){
            n = n & (n - 1);
            res++;
        }
        System.out.println(res);
    }
    */
    //Look up table for 32 bit numbers t.c = theta(1)
    static int table[] = new int[256];
    public static void initialize(){
        table[0] = 0;
        for(int i = 1; i < 256; i++){
            table[i] = (i & 1) + table[i/2];
        }
    }
    public static void countSet(int n){
        int res = table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];

        System.out.println(res);
    }
    public static void main(String[] args){
        initialize();
        countSet(13);
    }
}
