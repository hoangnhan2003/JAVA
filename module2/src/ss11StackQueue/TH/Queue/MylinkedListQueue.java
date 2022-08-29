package ss11StackQueue.TH.Queue;

import ss9.TH.MylinkedList;

public class MylinkedListQueue {
    private Node head;
    private Node tail;
    public MylinkedListQueue(){
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail==null){
            this.head = this.tail = temp;

        }
        else{
            this.tail.next = temp;
            this.tail = temp;
        }
    }
    public Node dequeue(){

        if(this.head ==null){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if(this.head == null){
            this.tail = null;
        }
        return temp;

    }
    public void display(){
        Node temp = this.head;
        while (temp != null){
            System.out.print(temp.key+"\t");
            temp = temp.next;
        }
    }
    public boolean isEmpty(){
        return this.head == null;
    }
}
class Node{
    int key;
    Node next;
    public Node(int key){
        this.key = key;
    }
}
