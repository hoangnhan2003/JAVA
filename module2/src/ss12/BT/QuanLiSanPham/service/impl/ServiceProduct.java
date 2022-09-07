package ss12.BT.QuanLiSanPham.service.impl;

import ss12.BT.QuanLiSanPham.model.impl.Product;
import ss12.BT.QuanLiSanPham.repository.impl.ProductData;
import ss12.BT.QuanLiSanPham.service.IServiveProduct;

import java.util.*;

public class ServiceProduct implements IServiveProduct<Product> {
    Scanner scanner = new Scanner(System.in);
    private ProductData productList = new ProductData();

    @Override
    public void add(Product element) {
        productList.add(element);
    }

    @Override
    public void display() {
        List<Product> listAll = productList.getAll();
        for (Product x : listAll){
            System.out.println(x.toString());
        }
    }

    @Override
    public void remove(String id) {
        productList.remove(id);
    }



    @Override
    public void searchByName(String name) {
        List<Product> listAll = productList.getAll();
        int count =0;
        for(Product x : listAll){
            if(x.getName().equals(name)){
                System.out.println(x.toString());
                count++;
            }
        }
        if(count==0){
            System.out.println("Not found!!");
        }
    }

    @Override
    public void sortIncreaseByPrice() {
        List<Product> items = productList.getAll();
        Collections.sort(items);
        productList.setAll(items);
    }

    @Override
    public void sortDecreaseByPrice() {
        List<Product> items = productList.getAll();
        Collections.sort(items, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() < o2.getPrice()? 1 : -1;
            }
        });
        productList.setAll(items);
    }
    public Product info(){
        String id,name;
        double price;
        System.out.println("Input id:");
        id = scanner.nextLine();
        System.out.println("Input name:");
        name = scanner.nextLine();
        System.out.println("Input price:");
        price = Integer.parseInt(scanner.nextLine());
        Product newProduct = new Product(id,name,price);
        return newProduct;
    }
}
