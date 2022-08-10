package ss3;

import java.util.Scanner;

public class baitapmang {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int select;
        int[] arr1 = Input();
        int[] arr2 = Input();
        int[] arr3 = new int[arr1.length+arr2.length];
        System.out.println("----------MENU------------");
        System.out.println("Only for array 1");

        do{
            System.out.println("0: Quit");
            System.out.println("1: Find smallest Element");
            System.out.println("2: Delete 1 element");
            System.out.println("3: Add 1 element");
            System.out.println("4: Merge array1 and array2");
            select =scanner.nextInt();
            switch (select){
                case 1:
                    findMinElement(arr1);
                    break;
                case 2:
                    arr1 = deleteElement(arr1);
                    Output(arr1);
                    break;
                case 3:
                    arr1 = addElement(arr1);
                    Output(arr1);
                    break;
                case 4:
                    arr3 = concat(arr1,arr2);
                    Output(arr3);
                    break;
            }
        }while (select!=0);

    }
    public static int[] Input(){
        int n;
        System.out.println("Enter length of array");
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr["+i+"] = ");
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        return arr;
    }

    public static int[] deleteElement(int[] arr){
        int index;
        System.out.println("Enter index you want to delete");
        index = scanner.nextInt();
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i < index ; i++) {
            newArr[i] = arr[i];
        }
        for (int j = index; j < arr.length-1; j++) {
            newArr[j] =arr[j+1];
        }
        return newArr;
    }
    public static int[] addElement(int[] arr){
        int index,value;
        System.out.println("Enter index you want to add");
        index = scanner.nextInt();
        System.out.println("Enter value you want to add");
        value = scanner.nextInt();
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] =value;
        for (int j = index; j < arr.length; j++) {
            newArr[j+1] = arr[j];
        }
        return newArr;
    }
    public static void findMinElement(int[] arr){
        int min =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min element in array = "+ min);
    }
    public static int[] concat(int[] arr1,int[] arr2){
        int[] newArr = new int[arr1.length+ arr2.length];
        int flag = arr1.length;
        for (int i = 0; i < arr1.length ; i++) {
            newArr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            newArr[j+flag] = arr2[j];
        }
        return newArr;
    }
    public static void Output(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
