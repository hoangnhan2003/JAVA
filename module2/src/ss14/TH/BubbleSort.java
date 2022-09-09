package ss14.TH;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    int c =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                }
            }
        }

    }
    public static void display(int arr[]){
        for (int x : arr){
            System.out.print(x +" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,6,8,7,9,10};
        bubbleSort(arr);
        display(arr);
    }
}
