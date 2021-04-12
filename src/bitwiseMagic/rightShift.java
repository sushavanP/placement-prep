package bitwiseMagic;

public class rightShift {
    public static void main(String[] args){
        int x = 31;
        System.out.println("Right shifting " + (x >> 1));
        int y = -2;
        System.out.println("Signed Right shifting " + (y >> 1));
        int z = -2;
        System.out.println("Unsigned Right shifting " + (z >>> 1));
        //Signed and Unsigned shifting works only for negative numbers. For positive numbers it works the same.
    }
}
