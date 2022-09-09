package ss14.BT;

public class InsertionSort {
    public static void insertion_sort(int[] arr){
        int pos,temp;
        for (int i = 1; i < arr.length; i++) {
             pos =i;
             temp = arr[i];
            while ( pos >0 && temp < arr[pos-1] ){ // doi cho 2 ve trong while se sinh ra loi
                arr[pos] = arr[pos-1];
                pos--;

            }
            arr[pos] = temp;
            display(arr);
        }
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void display(int arr[]){
        for (int x : arr){
            System.out.print(x +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,6,8,7,9,10};
        insertion_sort(arr);
        display(arr);
    }
}
