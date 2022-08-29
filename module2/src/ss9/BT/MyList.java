package ss9.BT;

import java.util.Arrays;
import java.util.Scanner;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 1;
    int size = 0;
    E elements[];
    public MyList(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = (E[]) new Object[capacity];
    }
    public void ensureCap(){
        int newSize = elements.length+1;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void decreaseCap(){
        int newSize = elements.length -1;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e,int index){
        if(size == elements.length){
            this.ensureCap();
        }
        if(index >=0 || index <= elements.length){
            size++;
            elements[index] = e;
        }
    }
    public void addLast(E e){
        if(size == elements.length){
            this.ensureCap();
        }
        elements[size++] =e;
    }
    public void remove(int index){
        if(index >=0 && index < size){
            for (int i = index; i < size-1; i++) {
                elements[i]= elements[i+1];
            }
            size--;
            decreaseCap();
        }
    }
    public void display(){
//        for (int i = 0; i < size; i++) {
//            System.out.println(elements[i]);
//        }
        for (Object element : elements){
            System.out.println(element);
        }
    }
    public MyList Clone(){
        MyList<E> newList = new MyList<>(size);
        for (int i = 0; i < size; i++) {
            newList.elements[i] = this.elements[i];
        }
        return newList;
    }
        public boolean contains(E e){
        if(!isEmpty()){
            for(int i=0; i<size;i++){
               E temp = elements[i];
                if(temp.equals(e)){
                    return true;
                }
            }
        }
        return false;
    }
        public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int indexOf(E e){
        for (int i = 0; i < elements.length; i++) {
            if(elements[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    public void clear(){
        elements = null;
    }
    public int getSize(){
        return size;
    }
    public void MENU(){
        int select;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("-----------MENU------------");
            System.out.println("0: Quit");
            System.out.println("1: Add at last index");
            System.out.println("2: Add element at any index");
            System.out.println("3: Display list");
            System.out.println("4: Remove element");
            System.out.println("5: Clear list");
            System.out.println("6: Get Size of array: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    int numOfE;
                    System.out.println("Enter number element of Array");
                    numOfE = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < numOfE; i++) {
                        E value;
                        System.out.println("Enter value");
                        value = (E) scanner.next();
                        addLast(value);
                    }
                    break;
                case 2:
                    E value ;
                    System.out.println("Input value:");
                    value =(E) scanner.next();
                    int pos;
                    System.out.println("Enter index you want to insert:");
                    pos = Integer.parseInt(scanner.nextLine());
                    add(value,pos);
                case 3:
                    display();
                    break;
                case 4:
                    int index;
                    System.out.println("Enter index you want to delete");
                    index = scanner.nextInt();
                    this.remove(index);
                    break;
                case 5:
                    this.clear();
                    break;
                case 6:
                    System.out.println("Size = "+this.getSize());
                    break;
            }
        }while (select!=0);
    }

    public static void main(String[] args) {
        MyList<Integer> intList = new MyList<>();
//        intList.MENU();
//        MyList<Integer> newList = new MyList<>();
//        newList = intList.Clone();
//        newList.display();
        intList.addLast(1);
        intList.addLast(2);
        intList.addLast(3);
        intList.display();
        System.out.println("Contain : "+ intList.contains(1));

        System.out.println("Index Of : "+ intList.indexOf(1));

    }
}
