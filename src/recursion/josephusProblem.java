package recursion;

public class josephusProblem {
    static int josephus(int n, int k){
        if(n == 1) return 0;
        return (josephus(n-1, k) + k) % n;
    }
    public static void main(String[] args){
        System.out.println("The survivor is " + josephus(5, 3));
    }
}
