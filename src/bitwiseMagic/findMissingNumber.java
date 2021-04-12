package bitwiseMagic;

//This program is a variation of the odd one out program.

public class findMissingNumber {
    public static int missingNumber(int arr[], int n){
        int res = 0;
        for(int i = 1; i <= n+1; i++){
            res = res ^ i;
        }
        for(int i = 0; i < n; i++){
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.print(missingNumber(arr, n));
    }
}
