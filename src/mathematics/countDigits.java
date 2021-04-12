package mathematics;

/*
Iterative Solution

public class countDigits {
    public int digits(long n){
        int count = 0;
        while(n != 0){
            n = n/10;
            ++count;
        }
        return count;
    }
    public static void main(String[] args){
        countDigits co = new countDigits();
        System.out.println(co.digits(35478898));
    }
}
*/

//Logarithmic Solution
public class countDigits {
    public double digits(long n) {
        return Math.floor(Math.log10(n) + 1);
    }
    public static void main(String[] args){
        countDigits co = new countDigits();
        System.out.println(co.digits(35478898));
    }
}