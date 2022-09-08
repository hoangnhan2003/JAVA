package ss13.TH;

import java.util.Scanner;

public class CountCharRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Input string:");
        input = scanner.nextLine();
        int[] frequentlyRate = new int[255];//1
        for (int i = 0; i < input.length(); i++) {
            int ascii = (int)input.charAt(i);
            frequentlyRate[ascii]+=1;
            //n *2 O(n) n is length of string
        }
        char maxChar = (char)0;//1
        int count = frequentlyRate[0];//1
        for (int i = 1; i < 255; i++) {
            if(frequentlyRate[i] > count){//1
                count =frequentlyRate[i]; //1
                maxChar = (char) i; //1
            }
        } // the best is 255*3 the worst is pow(255,2)
        System.out.println("Character have highest in string is "+ maxChar+"\n times = "+count);
    }
    // O = n*2 + 3 + 255*3*(1-255) the best when maxChar at index 0 the wort when char[i] increase times rate and maxChar at index 255
}
