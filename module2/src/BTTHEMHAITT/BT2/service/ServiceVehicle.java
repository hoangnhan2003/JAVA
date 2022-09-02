package BTTHEMHAITT.BT2.service;

public interface ServiceVehicle<T>
{
    void add(T element);
    void search(String bienSo);
    void remove(int index);
    void display();
}
