package ss12.BT.QuanLiSanPham.repository;

public interface InterArr<T> {
    void add(T element);
    void remove(String id);
    void display();
    void search(String id);
    void sort();
}
