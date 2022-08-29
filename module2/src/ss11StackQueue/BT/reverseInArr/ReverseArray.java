package ss11StackQueue.BT.reverseInArr;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class ReverseArray<T> {
    private LinkedList<T> stack ;
    public ReverseArray(){
        stack = new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public boolean isEmpty(){
        return stack.size() ==0;
    }
    public T pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();

    }
    public void display(){
        for (T element : stack){
            System.out.print(element+"\t");
        }
    }
    public int getSize(){
        return stack.size();
    }
    public void reverse(){
        LinkedList<T> newStack ;
        newStack = new LinkedList<>();
        for (T element : stack) {
            newStack.addFirst(element);
        }
        stack = newStack;
        for (T element : newStack){
            System.out.print(element+"\t");
        }
        System.out.println();

    }

}
