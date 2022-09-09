package ss14.TH;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min_index =i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min_index] ){
                    min_index = j;
                }
            }
            if(min_index!=i){
                int c =arr[min_index];
                arr[min_index] = arr[i];
                arr[i]=c;
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
        selectionSort(arr);
        display(arr);
    }
}
