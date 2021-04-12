package bitwiseMagic;

public class leftShift {
    public static void main(String [] args){
        int x = 3, y = 1;
        System.out.println("Positive Number " + (x << y)); //uses formula x = x*(2^y), for comparatively smaller numbers
        int z = -1;
        System.out.println("Negative Number " + (z << 1));
    }
}
