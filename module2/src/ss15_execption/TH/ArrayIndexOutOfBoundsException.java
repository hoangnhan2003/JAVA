package ss15_execption.TH;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List of array:");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100 - 10) + 10;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = createRandom();

        while (true) {
            try {
                int index;
                System.out.println("Input index you want to search:");
                index = Integer.parseInt(scanner.nextLine());
                System.out.println("Value of element at index" + index + " = " + arr[index]);
            } catch (Exception exception) {
                System.out.println("Index invalid!!");
            }

        }

    }
}
