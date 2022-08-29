package ss11StackQueue.TH.Stack;

import ss11StackQueue.TH.Queue.MylinkedQueueMain;

import java.util.Scanner;

public class MyGenericStack_Main {
    public static void MENU(MyGenericStack<Integer> stack){
        Scanner scanner = new Scanner(System.in);
        int select ;
        do {
            select = MylinkedQueueMain.getSelect(scanner);
            switch (select){
                case 1:
                    int numOfElement;
                    System.out.println("Enter number of Array");
                    numOfElement = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < numOfElement; i++) {
                        int element;
                        System.out.println("Enter value");
                        element = Integer.parseInt(scanner.nextLine());
                        stack.push(element);
                    }

                    break;
                case 2:
                    System.out.print("[\t");
                    stack.display();
                    System.out.print("]");
                    System.out.println("");
                    break;
                case 3:
                    stack.pop();
                    break;
                case 4:
                    System.out.println("Is empty : "+ stack.isEmpty());
                    break;
            }

        }while (select!=0);
    }
    public static void main(String[] args) {
        MyGenericStack<Integer> intList = new MyGenericStack<>();
        MENU(intList);
    }
}
