package Array;

/** Left rotate an array by 1 */

public class LeftRotate {
    void lRotate(int arr[]){
        int length = arr.length,  temp = arr[0];
        for(int i = 1; i < length; i++){
            arr[i - 1] = arr[i];
        }
        arr[length - 1] = temp;
    }
    public static void main(String [] args){
        LeftRotate leftRotate = new LeftRotate();
        int arr[] = {1, 4, 7, 9, 6};
        leftRotate.lRotate(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
