package Array;

/** Remove duplicate from a sorted array. */

public class RemoveDuplicate {
    int remDups(int arr[]){
        int length = arr.length;
        int res = 1;
        for(int i = 1; i < length; i++){
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        for(int i = 0; i < res; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return res;
    }
    public static void main(String[] args){
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int arr[] = {10, 10, 10, 20, 30, 30, 30, 30, 50, 80};
        System.out.println(removeDuplicate.remDups(arr));
    }
}
