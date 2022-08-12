package ss3;
import java.util.Scanner;
public class BT8 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input;
        System.out.println("Enter string :");
        input = scanner.nextLine();
        int count =0;
        char x = 'a';
        for (int i = 0; i < input.length(); i++) {
            if (x == input.charAt(i)) {
                count++;

            }
        }
        System.out.println("Times char appear in string is "+ count );
    }
}
