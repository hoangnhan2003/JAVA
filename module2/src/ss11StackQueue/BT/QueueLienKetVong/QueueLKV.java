package ss11StackQueue.BT.QueueLienKetVong;



public class QueueLKV {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public QueueLKV(){
        this.head = head;
        this.tail = tail;

    }


    public boolean isEmpty(){
        return head == null;
    }
    public void enQueue(int data){
        if(isEmpty()){
            this.head = this.tail = new Node(data);
        }
        else{
            Node temp = head;
            while (temp != tail){
                temp = temp.next;
            }
            Node newNode = new Node(data);
            temp.next = newNode;
            this.tail = newNode;
            this.tail.next = head;
        }
    }
    public void deQueue(){
        if(!isEmpty()){
           this.head = head.next;

        }
        }

    public void displayQueue(){
        Node temp = head;
        do {
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }while (temp.next != head.next);
    }

}
class Node {
    int data;
    Node next;
    public Node() {
        this.data =0;
    }
    public Node(int data){
        this.data = data;
    }
}
