package ss3;

import java.util.Scanner;

public class baitapmang2chieu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = Input();
        Output(arr);
        findMaxElement(arr);
        System.out.println("Sum of main diagonal = "+ sumMainDiagonal(arr));
        System.out.println("sum of col = "+sumOfCol(arr));
    }
    public static int[][] Input(){
        int nSize;
        System.out.println("Enter size of square matrix");
        nSize = scanner.nextInt();
        int[][] arr = new int[nSize][nSize];
        for (int i = 0; i < nSize; i++) {
            for (int j = 0; j < nSize; j++) {
                System.out.print("arr["+i+"]"+"["+j+"] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }
    public static void Output(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void findMaxElement(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max Element in matrix = "+ max);
    }
    public static int sumMainDiagonal(int arr[][]){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    public static int sumOfCol(int[][] arr){
        System.out.println("Enter col you want to solve sum");
        int col = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j == col ){
                    sum+= arr[i][j];
                }
            }
        }
        return sum;
    }
}
