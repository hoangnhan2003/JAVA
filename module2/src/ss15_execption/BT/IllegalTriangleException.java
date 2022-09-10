package ss15_execption.BT;

public class IllegalTriangleException extends Exception{

    static IllegalTriangleException forInputString(String s){
        throw new NumberFormatException("For input string"+ s+"\n");
    }
}
