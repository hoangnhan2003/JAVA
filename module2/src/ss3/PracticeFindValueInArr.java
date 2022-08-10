package ss3;

import java.util.Scanner;

public class PracticeFindValueInArr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr[] = {"ngo","hoang","nhan","nguyen","hieu"};
        System.out.println("enter string you want to find ");
        String str = scanner.next();
        System.out.println(str);
        System.out.println(arr[2]);
        output(arr,5);
        findIndex(arr,str);
        if(arr[2] == str){
            System.out.println("Found!!!");
        }

    }
    public static void findIndex(String arr[],String x){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(x)){
                flag = true;
                System.out.println("Index element you was found at index = "+ i);
            }
        }
        if(!flag){
            System.out.println("Can't find value in array ");
        }
    }
    public static void output(String arr[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
