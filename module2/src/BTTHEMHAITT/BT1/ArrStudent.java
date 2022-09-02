package BTTHEMHAITT.BT1;
import java.util.ArrayList;
import java.util.List;

public class ArrStudent<T> {
    private int DEFAULT_CAPACITY =10;
    List<T> arrayStd;

    public ArrStudent(){
        arrayStd = new ArrayList<>();
    }
    public void addStd(T student){
        arrayStd.add(student);
    }
    public void removeStd(int index){
        arrayStd.remove(index);
    }
    public void display(){
        for (T element : arrayStd){
            System.out.println(element.toString());
        }
    }
}



