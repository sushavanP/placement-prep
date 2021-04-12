package bitwiseMagic;

public class powerSet {
    // t.c = theta((2^n)*n)
    public static void printPowerSet(String str){
        int n = str.length();
        int powSize = (int)Math.pow(2, n);
        for(int count = 0; count < powSize; count++){
            for(int j = 0; j < n; j++){
                if((count & (1 << j)) != 0)
                    System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printPowerSet("loll");
    }
}
