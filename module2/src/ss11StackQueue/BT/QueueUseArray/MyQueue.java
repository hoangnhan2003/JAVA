package ss11StackQueue.BT.QueueUseArray;

public class MyQueue {
    private int capacity ;
    private int[] queueArr;
    int head=0;
    int tail=-1;
    int currentSize;
    public MyQueue(int queueSize){
        this.capacity = queueSize;
    }
    public boolean isQueueFull(){
        return this.currentSize == capacity;
    }
    public boolean  isQueueEmpty(){
        return this.currentSize == 0;
    }
    public void enQueue(int item ){
        if(isQueueFull()){
                System.out.println("Queue is fulled");
            }
        else{
                tail++;
                if(tail == capacity -1){
                    tail=0;
                }
                queueArr[tail]= item;
                currentSize++;
            }
    }
    public void deQueue(){
            if(isQueueEmpty()){
                System.out.println("Queue is empty!!!");
            }
            else{
                if(head == capacity-1){
                    head++;
                    if(head == capacity){
                        System.out.println("Pop operation done ! Remove"+ queueArr[head-1]);
                        head =0;
                    }
                    else{
                        System.out.println("Pop operation done! Remove"+ queueArr[head-1]);
                    }
                    currentSize--;
                }
            }
    }
}
