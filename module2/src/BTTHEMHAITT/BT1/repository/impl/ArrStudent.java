package BTTHEMHAITT.BT1.repository.impl;
import BTTHEMHAITT.BT1.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ArrStudent {
    private int DEFAULT_CAPACITY =10;
     static List<Student> arrayStd = new ArrayList<>();
     static {
         Student std1 = new Student("Nhan","23/05/2003",1,"A05",8.5);
         Student std2 = new Student("Hoang","12/03/2003",1,"A05",8.6);
         Student std3 = new Student("Ngo","05/05/2003",1,"A05",8.0);
         arrayStd.add(std1);
         arrayStd.add(std2);
         arrayStd.add( std3);
     }


    public ArrStudent(){


    }
    public void addStd(Student student){
        arrayStd.add(student);
    }
    public void removeStd(int index){
        arrayStd.remove(index);
    }
    public void display(){
        for (Student element : arrayStd){
            System.out.println(element.toString());
        }
    }
}



