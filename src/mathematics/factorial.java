package mathematics;

public class factorial {
    //Iterative function
    /*
        public static int fact(int n){
            int sum = 1;
            for(int i = 1; i <= n; i++){
                sum = sum*i;
            }
            return sum;
        }
    */
    // Recursive function
    public static int fact(int n){
        if(n == 0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args){
        System.out.println(fact(6));
    }
}
