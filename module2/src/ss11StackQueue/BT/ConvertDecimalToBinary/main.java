package ss11StackQueue.BT.ConvertDecimalToBinary;

import java.util.Stack;

public class main {
    public static String getBinary(Stack<Integer> remainder){
        Stack<Integer> binary  = new Stack<>();
        int size = remainder.size();
        String binaryRS = "";
        for (int i=0 ; i < size;i++){
            int temp = remainder.pop();
            binary.push(temp);
            binaryRS+=temp;
        }
        String binaryX= binary.toString();
        return binaryRS;
    }
    public static void main(String[] args) {
        ConvertToBinary x = new ConvertToBinary(4);
        Stack<Integer> list = x.getRemainder();
        System.out.println(list.size());
        for (int b : list){
            System.out.print(b);
        }
        System.out.println();
        String binary = getBinary(list);
        System.out.println(binary);
        System.out.println(binary.length());

    }
}
