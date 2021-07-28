package Array;

public class sortedArray {
    boolean checkSortedArray(int arr[]){
        int length = arr.length;
        for(int i = 1; i < length; i++){
            if(arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        sortedArray SortedArray = new sortedArray();
        int arr[] = {0, 45, 89, 100, 345};
        System.out.println(SortedArray.checkSortedArray(arr));
    }
}
