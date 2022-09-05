package BTTHEMHAITT.BT1.service;

import BTTHEMHAITT.BT1.model.Student;
import BTTHEMHAITT.BT1.repository.ArrStudent;

public class ServiceStudent implements Service<Student>{
    ArrStudent repositoryStd;
    public ServiceStudent(){
        repositoryStd = new ArrStudent();
    }

    @Override
    public void add(Student element) {
        repositoryStd.addStd(element);
    }

    @Override
    public void remove(int index) {
        repositoryStd.removeStd(index);
    }

    @Override
    public void display() {
        repositoryStd.display();
    }
}
