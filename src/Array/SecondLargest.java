package Array;

public class SecondLargest {
    int secondLargest(int arr[]){
        int length = arr.length;
        int res = -1, largest = 0;
        for(int i = 1; i < length; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if(res == -1 || arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res; // returns the index of the second largest number
    }
    public static void main(String[] args){
        SecondLargest secondLargest = new SecondLargest();
        int arr[] = {5, 10, 8, 12, 9, 22};
        System.out.println("The second largest number is in index " + secondLargest.secondLargest(arr));
    }
}
