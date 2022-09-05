package BTTHEMHAITT.BT1.service;

import BTTHEMHAITT.BT1.repository.ArrTeacher;

public class ServiceTeacher implements Service{
    ArrTeacher repositoryTeacher ;
    public ServiceTeacher(){
        repositoryTeacher = new ArrTeacher<>();
    }

    @Override
    public void add(Object element) {
        repositoryTeacher.addTeacher(element);
    }

    @Override
    public void remove(int index) {
        repositoryTeacher.removeTeacher(index);
    }

    @Override
    public void display() {
        repositoryTeacher.display();
    }
}
