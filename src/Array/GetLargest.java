package Array;

public class GetLargest {
    int getLargest(int arr[]){
        int length = arr.length;
        int res = 0, largest = Integer.MIN_VALUE;
        for(int i = 1; i < length; i++){
            if(arr[i] > arr[res]){
                res = i;
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String [] args){
        GetLargest getLargest = new GetLargest();
        int arr[] = {2, 89, 1, 20};
        System.out.println("The largest number is " + getLargest.getLargest(arr));
    }
}
