package ss13.BT;

import java.util.Scanner;

public class BinarySearch {
    public static void display(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.print("]\n");
    }
    public static void binarySearch(int[] arr,int high,int low,int value){
        int mid = (high+low)/2;
        if(low > high){
            System.out.println("Not found!!!");
            return ;
        }
        if(value>arr[mid]){
            binarySearch(arr,high,mid+1,value);
        }
        else if(value < arr[mid]){
            binarySearch(arr,mid-1,low,value);
        }
        else{
            System.out.println("The element you are looking for is in the array");
            return ;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter length of array");
        size = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("arr["+i+"] = " );
            arr[i] =Integer.parseInt(scanner.nextLine());
        }
        display(arr);
        System.out.println("Enter value you want to search:");
        int value = Integer.parseInt(scanner.nextLine());
        binarySearch(arr, arr.length, 0,value);


    }
}
