package recursion;

public class countSubsetsSum {
    static int countSubsets(int arr[], int n, int sum){
        if(n == 0)
            return (sum == 0) ? 1 : 0;

        return countSubsets(arr, n - 1, sum) + countSubsets(arr, n - 1, sum - arr[n-1]);
    }
    public static void main(String[] args){
        int arr[] = {10, 15, 20, 5};
        int sum = 25;
        int n = arr.length;
        System.out.println("No. of subsets with the sum as given is " + countSubsets(arr, n, sum));
    }
}
