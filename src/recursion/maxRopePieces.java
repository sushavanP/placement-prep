package recursion;

public class maxRopePieces {
    public static int maxPieces(int n, int a, int b, int c){
        if(n == 0) return 0;
        if(n < 0) return -1;

        int res = Math.max(maxPieces(n - a, a, b, c),
                Math.max(maxPieces(n - b, a, b, c), maxPieces(n - c, a, b, c)));

        if(res == -1)
            return -1;
        return res + 1;
    }
    public static void main(String[] args){
        System.out.println(maxPieces(5, 3, 1, 2));
    }
}
