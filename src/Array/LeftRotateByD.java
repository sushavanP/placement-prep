package Array;

public class LeftRotateByD {
    void lRotate(int arr[], int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
    void reverse(int arr[], int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args){
        LeftRotateByD leftRotateByD = new LeftRotateByD();
        int arr[] = {1, 2, 3, 4, 5};
        leftRotateByD.lRotate(arr, 2);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
