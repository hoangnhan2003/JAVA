package ss11StackQueue.BT.ConvertDecimalToBinary;

import java.util.Stack;

public class ConvertToBinary {
    private int decimal;
    Stack<Integer> remainder = new Stack<>();
    public ConvertToBinary(int decimal){
        this.decimal = decimal;
    }
    public Stack getRemainder(){
        while (decimal!=0){
            int rs = decimal % 2;
            remainder.push(rs);
            decimal /=2;
        }
        return remainder;
    }




}

