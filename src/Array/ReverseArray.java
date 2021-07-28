package Array;

public class ReverseArray {
    void reverseArray(int arr[]){
        int length = arr.length;
        int temp, low = 0, high = length - 1;
        while(low < high) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String [] args){
        ReverseArray newReverseArray = new ReverseArray();
        int arr[] = {3, 56, 78, 90, 1, -69, 67};
        newReverseArray.reverseArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
