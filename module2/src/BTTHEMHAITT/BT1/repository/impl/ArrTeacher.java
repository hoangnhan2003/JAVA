package BTTHEMHAITT.BT1.repository.impl;

import BTTHEMHAITT.BT1.model.Teacher;
import BTTHEMHAITT.BT1.repository.RepoPerson;

import java.util.ArrayList;
import java.util.List;

public class ArrTeacher implements RepoPerson<Teacher> {

    private int DEFAULT_CAPACITY =10;
    List<Teacher> arrayStd ;

    public ArrTeacher(){
        arrayStd = new ArrayList<>();
    }
    public void add(Teacher teacher){
        arrayStd.add(teacher);
    }
    public void remove(int index){
        arrayStd.remove(index);
    }
    public void display(){
        for (Teacher element : arrayStd){
            System.out.println(element.toString());
        }
    }


}
