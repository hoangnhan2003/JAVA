package ss12.BT.QuanLiSanPham.repository;

import java.util.List;

public interface InterArr<T> {
    void add(T element);
    void remove(String id);
    List<T> getAll();


}
