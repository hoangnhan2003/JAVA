package ss11StackQueue.BT.QueueLienKetVong;



public class MainQueue {
    public static void main(String[] args) {
        QueueLKV QUEUE = new QueueLKV();
        QUEUE.enQueue(1);
        QUEUE.enQueue(2);
        QUEUE.enQueue(3);
        QUEUE.enQueue(4);
        QUEUE.enQueue(5);
        QUEUE.deQueue();
        QUEUE.displayQueue();
        System.out.println(QUEUE.getTail().next.data);
    }
}
