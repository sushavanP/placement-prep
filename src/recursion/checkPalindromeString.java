package recursion;

public class checkPalindromeString {
    static boolean isPalindrome(String str, int start, int end){
        if(start >= end)
            return true;
        return ((str.charAt(start) == str.charAt(end)) && isPalindrome(str, start+1, end-1));
    }
    public static void main(String[] args){
        String str = "abcba";
        int start = 0;
        int end = str.length();
        System.out.print(isPalindrome(str, start, end - 1));
    }
}
