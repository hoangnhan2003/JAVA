package ss11StackQueue.BT.CheckDauNgoac;
import java.lang.String;
import java.util.Scanner;
import java.util.Stack;

public class CheckDauNguoacSDStack {


    public static void checkBracket(String input){

       Stack bracketLeft = new Stack();
       Stack bracketRight = new Stack();
        for (int i = 0; i < input.length(); i++) {
           if( input.charAt(i)==')'){
               bracketLeft.push(input.charAt(i));
           }
           else if(input.charAt(i) == '(' ){
               bracketRight.push(input.charAt(i));
           }
        }
        if(bracketRight.size() == bracketLeft.size()){
            System.out.println("Valid expression");
        }
        else{
            System.out.println("Valid is not expression");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");
        String input;
        input = scanner.nextLine();
        checkBracket(input);
    }
}
