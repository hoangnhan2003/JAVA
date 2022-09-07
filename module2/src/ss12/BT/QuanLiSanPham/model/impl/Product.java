package ss12.BT.QuanLiSanPham.model.impl;

import ss12.BT.QuanLiSanPham.model.AbsProduct;

public class Product extends AbsProduct implements Comparable<Product>{
    public Product(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice() > o.getPrice()? 1 : -1 ;
    }
}
