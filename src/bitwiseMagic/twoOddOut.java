package bitwiseMagic;

public class twoOddOut {
    public static void twoOdds(int arr[], int n){
        int xor = 0, res1 = 0, res2 = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ arr[i];
        }
        int sn = xor & (~(xor - 1));
        for(int i = 0; i < n; i++){
            if((arr[i] & sn) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        System.out.println(res1+ " " +res2);
    }
    public static void main(String[] args){
        int arr[] = {2, 4, 5, 8, 5, 2, 8, 40, 8, 4};
        int n = arr.length;
        twoOdds(arr, n);
    }
}
