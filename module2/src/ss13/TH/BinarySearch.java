package ss13.TH;

public class BinarySearch {
    static int binarySearch( int[] arr,int key){
        int low =0;
        int high = arr.length -1;
        while (low <= high){
            int mid = (low + high)/2;
            if(key < arr[mid]){
                high = mid-1;
            }
            else if(key > arr[mid]){
                low = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,14,17};
        System.out.println("2 at index: " + binarySearch(arr,2));
    }
}
