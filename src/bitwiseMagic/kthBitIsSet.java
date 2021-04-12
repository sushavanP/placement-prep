package bitwiseMagic;

//Two methods to check. One using left shift and the other using right shift.

public class kthBitIsSet {
    public static void kthBitLeftShift(int n, int k){
        if((n & (1 << (k - 1))) != 0)
            System.out.println("SET");
        else
            System.out.println("NOT SET");
    }
    public static void kthBitRightShift(int n, int k){
        if((n >> (k - 1) & 1) != 0)
            System.out.println("SET");
        else
            System.out.println("NOT SET");
    }
    public static void main(String[] args){
        kthBitLeftShift(5, 3);
        kthBitRightShift(8, 4);
    }
}
