package ss9.TH;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MylinkedList linkedList = new MylinkedList(10);
        linkedList.addLast(11);
        linkedList.addLast(13);
        linkedList.addLast(12);
        linkedList.addLast(16);
        linkedList.addLast(17);
        linkedList.addFirst(5);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.printList();

    }
}
