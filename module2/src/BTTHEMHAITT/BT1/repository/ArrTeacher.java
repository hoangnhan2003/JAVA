package BTTHEMHAITT.BT1.repository;

import java.util.ArrayList;
import java.util.List;

public class ArrTeacher<T> {

    private int DEFAULT_CAPACITY =10;
    List<T> arrayStd ;

    public ArrTeacher(){
        arrayStd = new ArrayList<>();
    }
    public void addTeacher(T teacher){
        arrayStd.add(teacher);
    }
    public void removeTeacher(int index){
        arrayStd.remove(index);
    }
    public void display(){
        for (T element : arrayStd){
            System.out.println(element.toString());
        }
    }
}
