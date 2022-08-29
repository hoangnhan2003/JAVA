package ss11StackQueue.TH.Queue;

import ss11StackQueue.TH.Stack.MyGenericStack;

import java.util.Scanner;

public class MylinkedQueueMain {
    public static void MENU(MylinkedListQueue stack){
        Scanner scanner = new Scanner(System.in);
        int select ;
        do {
            select = getSelect(scanner);
            switch (select){
                case 1:
                    int numOfElement;
                    System.out.println("Enter number of Array");
                    numOfElement = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < numOfElement; i++) {
                        int element;
                        System.out.println("Enter value");
                        element = Integer.parseInt(scanner.nextLine());
                        stack.enqueue(element);
                    }

                    break;
                case 2:
                    System.out.print("[\t");
                    stack.display();
                    System.out.print("]");
                    System.out.println("");
                    break;
                case 3:
                    stack.dequeue();
                    break;
                case 4:
                    System.out.println("Is empty : "+ stack.isEmpty());
                    break;
            }

        }while (select!=0);
    }

    public static int getSelect(Scanner scanner) {
        int select;
        System.out.println("Enter your choice in Stack");
        System.out.println("----------------------------MENU----------------------------");
        System.out.println("0:Quit");
        System.out.println("1:Enqueue ");
        System.out.println("2:Display");
        System.out.println("3:Dequeue");
        System.out.println("4: Check empty");
        select = Integer.parseInt(scanner.nextLine());
        return select;
    }

    public static void main(String[] args) {
        MylinkedListQueue listNode = new MylinkedListQueue();
        MENU(listNode);

    }
}
