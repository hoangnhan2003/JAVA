package ss9.BT;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList myLinked = new MyLinkedList(1);
        myLinked.addLast(2);
        myLinked.addLast(3);
        myLinked.addLast(4);
        myLinked.addLast(5);
        myLinked.remove(1);
        myLinked.display();
        System.out.println("Contain "+ myLinked.contains(1));
        System.out.println("Index of = "+myLinked.indexOf(4));
        Node newNode = (Node) myLinked.getFirst();
        System.out.println(newNode.getData());

    }

}
