package ss9.TH;

//class Node{
//    private Node next;
//    private Object data;
//    public Node(Object data){
//        this.data = data;
//    }
//    public Object getData(){
//        return this.data;
//    }
//}
//import java.util.Arrays;
public class MylinkedList {

    private Node head ;
    private int numNodes = 1;
    private class Node{
        private Node next;
        private final Object data;
        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
    public MylinkedList(Object data){
        head = new Node(data);
    }
    public void add(int index ,Object data){
        Node temp =head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node current = new Node(data);
        temp.next = current;
        temp.next.next = current.next;
        numNodes++;
    }
    public void addLast(Object data){
        Node temp = head;
        for (int i = 1; i < numNodes; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        numNodes++;
    }
    public void addFirst(Object data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void s(Object data){
        Node temp = head;
        int index =0;
        while (temp.data != data){
            index++;
            temp = temp.next;
        }
        if(index > numNodes ){
            System.out.println("Khong co phan tu can tim kiem");
        }
        else{
            System.out.println("Phan tu "+ data +" o vi tri = "+ index);
        }
    }


}
