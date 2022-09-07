package BTTHEMHAITT.BT1.service;

import BTTHEMHAITT.BT1.model.Student;

public interface Service<T> {
    void add(T element);
    void remove(int index);
    void display();
    T infomation();
}
