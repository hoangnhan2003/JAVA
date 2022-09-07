package ss12.BT.QuanLiSanPham.repository.impl;

import ss12.BT.QuanLiSanPham.model.impl.Product;
import ss12.BT.QuanLiSanPham.repository.InterArr;

import java.util.ArrayList;
import java.util.List;

public class ProductData implements InterArr<Product> {

    static List<Product> data = new ArrayList<>();
    @Override
    public void add(Product element) {
        data.add(element);
    }

    @Override
    public void remove(String id) {
        Product product = new Product();
        for (Product x : data){
            if(x.getId().equals(id)){
                product = x;
            }
        }
        if(product != null){
            data.remove(product);
        }
        else{
            System.out.println("Not found!!");
        }
    }

    @Override
    public List<Product> getAll() {
        return data;
    }
    public void setAll(List<Product> item){
        data = item;
    }
}
