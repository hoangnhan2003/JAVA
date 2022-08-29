package ss11StackQueue.TH.Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push (T element){
        stack.addFirst(element);

    }
    public boolean isEmpty(){
        return stack.size() ==0;
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public void display(){
        for (T element : stack ){
            System.out.print(element +"\t");
        }
    }


}
