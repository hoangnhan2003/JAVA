package ss11StackQueue.BT.reverseInArr;

import ss11StackQueue.TH.Queue.MylinkedListQueue;

import java.util.Scanner;

public class ReverseMain {
    public static int getSelect(Scanner scanner) {
        int select;
        System.out.println("Enter your choice in Stack");
        System.out.println("----------------------------MENU----------------------------");
        System.out.println("0:Quit");
        System.out.println("1:Add");
        System.out.println("2:Display");
        System.out.println("3:pop");
        System.out.println("4: Reverse");
        System.out.println("5:Get size");
        select = Integer.parseInt(scanner.nextLine());
        return select;
    }
    public static void MENU(ReverseArray stack){
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
                    System.out.println("Element pop = "+stack.pop());
                    break;
                case 4:
                   stack.reverse();
                   break;
                case 5:
                    System.out.println("Size of stack = "+ stack.getSize());
                    break;
            }

        }while (select!=0);
    }

    public static void main(String[] args) {
        ReverseArray<Integer> stack = new ReverseArray<>();
        MENU(stack);
    }
}
