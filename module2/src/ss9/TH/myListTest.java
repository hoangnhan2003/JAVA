package ss9.TH;
import java.util.Arrays;
public class myListTest<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] element;
    public myListTest(){
        element = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCap(){
        int newSize = element.length + 1;
        element = Arrays.copyOf(element,newSize);

    }
    public void add(E e){
        if(size == element.length){
            ensureCap();
        }
        element[size++] = e;
    }
    public E get(int i){
        if(i>=size || i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ",Size" + i);
        }
        return (E) element[i];
    }

    public static void main(String[] args) {
        myListTest<Integer> listInterger = new myListTest<>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);
        listInterger.add(5);
        listInterger.add(6);
        listInterger.add(7);
        listInterger.add(8);
        listInterger.add(9);
        listInterger.add(10);
        listInterger.add(11);
        System.out.println("element 4 = "+ listInterger.get(4));
        System.out.println("element 2 = "+ listInterger.get(2));
        System.out.println("element 0 = "+ listInterger.get(0));
        System.out.println("Length of array = "+ listInterger.element.length);
    }


}

