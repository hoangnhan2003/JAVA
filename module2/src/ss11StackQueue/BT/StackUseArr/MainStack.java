package ss11StackQueue.BT.StackUseArr;

public class MainStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
        myStack.push(2);
        myStack.push(4);
        myStack.push(3);
        myStack.push(6);
        myStack.push(7);
        myStack.push(5);
        myStack.push(8);
        myStack.pop();
        myStack.display();
    }
}
