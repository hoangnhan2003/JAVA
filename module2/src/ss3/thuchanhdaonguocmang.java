package ss3;

import java.util.Scanner;

public class thuchanhdaonguocmang {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n;
        System.out.println("Enter size of array");
        do{
            n = scanner.nextInt();
        }while (n>20 || n<0);
        int[] arr = new int[n];
        int[] arr2 = new int[n];

        input(arr,n);
        output(arr,n);
        input(arr2,n);
        output(arr2,n);
//        reverse(arr,n);
//        output(arr,n);
//        findMaxValue(arr,n);
//        findMinValue(arr,n);
//        arr = deleteElement(arr,2);
//        output(arr,n);
//        arr = addElement(arr,3,15);
//        output(arr,n);
        int[] newArr =new int[2*n];
        newArr = concat(arr,arr2);
        output(newArr,2*n);

    }
    public static void input(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element arr[" + i+"] = " );
            arr[i] = scanner.nextInt();
        }
    }
    public static void reverse(int[] arr,int n){
        int flag = n-1;
        for (int i = 0; i < Math.floor((n/2)); i++) {
            int c = arr[i];
            arr[i] = arr[flag];
            arr[flag] =c;
            flag--;

        }

    }
    public static void output(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void findMaxValue(int[] arr,int n){
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Biggest Value in array = "+ max);
    }
    public static void findMinValue(int[] arr,int n){
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if(min > arr[i]){
                min =arr[i];
            }
        }
        System.out.println("smallest Value in array = "+ min);
    }
    public static int [] deleteElement(int[] arr,int index){
        int[] arrTmp = new int[arr.length-1];
        if(index > 0 && index < arr.length ){
            for (int i = 0; i < index ; i++) {
                arrTmp[i] = arr[i];
            }
            for (int j = index; j < arr.length-1; j++) {
                arrTmp[j] = arr[j+1];
            }


        }
        return arrTmp;
    }
    public static int[] addElement(int[] arr, int index, int value){

        int[] newArr = new int[arr.length+1];
        do{
        if(index >0 && index < arr.length+1){

            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = value;
            for (int j = index+1; j < arr.length+1; j++) {
                newArr[j] = arr[j-1];
            }

        }
        else{
            System.out.println("Index was entered illegal!!");

        }
        }while (index <0 || index > arr.length+1);
        return newArr;
    }
    public static int[] concat(int[] arr1,int[] arr2){
        System.out.println("Array after merged is : ");
        int flag = arr1.length;
        int[] newArr = new int[arr1.length+ arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            newArr[flag + j] = arr2[j];
        }
        return newArr;
    }
}
