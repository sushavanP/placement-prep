package mathematics;

import java.util.Scanner;

public class palindrome {
    public boolean checkPalindrome(int n){
        int r, sum = 0;
        int temp = n;
        while(temp != 0){
            r = temp%10;
            sum = sum*10 + r;
            temp = temp/10;
        }
        return (sum == n);
    }
    public static void main(String[] args){
        palindrome pal = new palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(pal.checkPalindrome(num));
    }
}
