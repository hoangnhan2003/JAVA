package ss11StackQueue.BT.CheckPalindromeString;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckPalindrome {
    public static void checkPalindrome(String str){
        Queue queue = new LinkedList();
        for (int i =  str.length()-1; i >=0; i--) {
            queue.add(str.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()){
            reverseString +=queue.remove();
        }
        if(reverseString.equals(str)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input ;
        System.out.println("Input String:");
        input = scanner.nextLine();
        checkPalindrome(input);

    }
}
