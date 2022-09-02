package ss11StackQueue.BT.StackUseArr;

import java.sql.Array;

public class MyStack {
    private int[] arr;
    public int size =0;
    private int index;
    private int CAPACITY;
    public MyStack(int size){
        this.CAPACITY = size;
        arr = new int[size];
    }
    public boolean isFull(){
        return size == CAPACITY;
    }
    public boolean isEmpty(){
        return size ==0;
    }
    public void push(int element){
        if(!isFull()){
           arr[size] = element;
           size++;
        }
    }
    public int pop(){
        if(!isEmpty()){
            size--;
        }
        return arr[size];
    }
    public void display(){
        System.out.print("[\t");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.print("]");
    }
}
