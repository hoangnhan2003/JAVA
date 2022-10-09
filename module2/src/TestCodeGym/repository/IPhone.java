package TestCodeGym.repository;

import java.util.List;

public interface IPhone<E> {
    void add(E phone);
    void deletePhone(int id);
    int search(int id);
    int search(String namePhone);
    List<E> getData();
    void update();

}
