package ss9.BT;

public class MyLinkedList<E> {
    Node head;
    int numNodes = 1 ;
    public MyLinkedList(Object data){
        head = new Node(data);
    }
    public void add(int index, E element){
        Node preNode = head;
        for (int i = 0; i < index -1; i++) {
            preNode = preNode.next;
        }
        Node temp = preNode.next;
        Node newNode = new Node(element);
        preNode.next = newNode;
        newNode.next = temp;
        numNodes++;
    }
    public void display(){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
    public void addFirst(E element ){
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }
    public void addLast(E element){
        Node preNode = head;
        for (int i = 0; i < numNodes - 1; i++) {
            preNode = preNode.next;
        }
        preNode.next = new Node(element);
        numNodes++;
    }
    public void remove(int index){
        Node preNode = head;
        for (int i = 0; i < index-1; i++) {
            preNode = preNode.next;
        }
        Node afterNode = preNode.next.next;
        preNode.next = afterNode;
        numNodes--;
    }
    public boolean remove(Object e){
        Node preNode = head;
        Node temp = head;
        boolean flag = false;
        for (int i = 0; i < numNodes; i++) {
            if(preNode.getData().equals(e) || temp.getData().equals(e)){
                flag = true;
                break;
            }
            preNode = preNode.next;
            temp = preNode.next;
        }
        if(flag){
            preNode.next = temp.next;
        }
        return flag;
    }
    public int size(){
        return numNodes;
    }
    public boolean contains(E o){
        Node temp = head;
        while(temp.data != null){
            if(temp.data.equals(o)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int indexOf(E o){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if(temp.data.equals(o)){
                return i;
            }
            temp= temp.next;
        }
        return -1;
    }

    public E get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp= temp.next;
        }
        return (E) temp;
    }
    public E getFirst(){

        return (E) head;
    }
    public E getLast(){
        Node temp = head;
        while(temp.next.getData() !=null){
            temp = temp.next;
        }
        return (E) temp;
    }
    public void clear(){
        head = null;
    }



}
class Node {
    Node next;
    Object data;
    public Node(Object data){
        this.data = data;
    }
    public Object getData(){
        return this.data;
    }
}
