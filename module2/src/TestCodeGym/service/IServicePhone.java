package TestCodeGym.service;

public interface IServicePhone<E> {
    E getInfo();
    void add();
    int search(int id);
    int search(String namePhone);
    void delete(int id);
    void displayList();

}
