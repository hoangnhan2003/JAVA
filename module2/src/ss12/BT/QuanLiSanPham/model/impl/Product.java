package ss12.BT.QuanLiSanPham.model.impl;

import ss12.BT.QuanLiSanPham.model.AbsProduct;

public class Product extends AbsProduct implements Comparable<Product>{
    public Product(String id, String name, double price) {
        super(id, name, price);
    }

    public Product() {

    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice() > o.getPrice()? 1 : -1 ;
    }

    @Override
    public String toString() {
        return "Product{" + "id:"+ super.getId()+"\t"+
                "name: "+ super.getName()+"\t"+
                "price: "+super.getPrice() +
                "}";
    }
}
