package ss17IObinaryFile.BT.ManageProduct.model;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Product implements Serializable {
    private int id;
    private String name;
    private String branch;
    private double price;
    private String description;

    public Product(int id, String name, String branch, double price, String description) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.price = price;
        this.description = description;
    }

    public Product(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId() == product.getId();
    }

//    public static void main(String[] args) {
//        List<Product> products = new ArrayList<>();
//        products.add(new Product(1,"aplle","x",2000,"delicous"));
//            ObjectOutputStream oos = null;
//            try{
//                oos = new ObjectOutputStream(new FileOutputStream("H:\\CODEGYM\\module2\\src\\ss17IObinaryFile\\BT\\ManageProduct\\repository\\data.txt"));
//                oos.writeObject(products);
//                oos.flush();
//                oos.close();
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//    }
}
