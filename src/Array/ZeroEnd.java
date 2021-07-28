package Array;

/** Moves zeroes to the end of the array and the array order remains the same */

public class ZeroEnd {
    void moveZeroes(int arr[]){
        int count = 0;
        int temp;
        int length = arr.length;
        for(int i = 0; i < length; i++){
            if(arr[i] != 0){
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
    }
    public static void main(String[] args){
        ZeroEnd zeroEnd = new ZeroEnd();
        int arr[] = {10, 0, 0, 35, 69, 89, 0, 0, 100};
        zeroEnd.moveZeroes(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
