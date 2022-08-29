package ss11StackQueue.BT.countWord;

import java.util.HashMap;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.print("Input:");
        input = scanner.nextLine();
        HashMap<String,Integer> map = new HashMap<>();
        String[] arrayWord = input.split(" ");
        int count=1;
        for (String element : arrayWord){
            if(map.containsKey(element)){
                int flag = map.get(element);
                flag++;
                map.put(element,flag);
            }else
            {
                map.put(element,count);
            }
        }
        System.out.println(map);
    }

}
