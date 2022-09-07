package ss12.BT.QuanLiSanPham.service;

public interface IServiveProduct<T> {
    void add(T element);
    void display();
    void remove(String id);

    void searchByName(String name);
    void sortIncreaseByPrice();
    void sortDecreaseByPrice();

}
