package ss9.TH;

public interface MyList<E> extends java.lang.Iterable<E>{
    public void add(E e);
    public void clear();
    public boolean contains(E e);
    public E get(int index);
    public int indexOf(E e);
    public boolean isEmpty();
    public int lastIndexOf(E e);
    public boolean remove(E e);
    public E remove(int x);
    public Object set(int index ,E e);
    public int size();
}
 abstract class MyabstractList<E> implements MyList<E>{
     int size = 0;
    protected MyabstractList(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }
     @Override
     public void add(E e) {
        add(size,e);    
     }

     protected abstract void add(int size, E e);


     @Override
     public boolean isEmpty() {
         return size ==0;
     }

     @Override
     public boolean remove(E e) {
        if(indexOf(e) >= 0){
            remove(indexOf(e));
            return true;
        }
        else{

        }
         return false;
     }

     @Override
     public int size() {
         return 0;
     }
 }
