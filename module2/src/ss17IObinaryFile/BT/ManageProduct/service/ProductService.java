package ss17IObinaryFile.BT.ManageProduct.service;



import ss17IObinaryFile.BT.ManageProduct.model.Product;
import ss17IObinaryFile.BT.ManageProduct.repository.ProductRepo;

import java.util.List;
import java.util.Scanner;
public class ProductService {
    private ProductRepo repo = new ProductRepo();
    public void add(){
        Product newProduct = info();
        repo.addProduct(newProduct);
    }
    public void search(int id){
        repo.search(id);
    }
    Scanner scanner = new Scanner(System.in);
    public Product info(){
        int id;
        String name,description,brand;
        double price;
        System.out.println("Input id:");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name:");
        name = scanner.nextLine();
        System.out.println("Input price:");
        price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter brand");
        brand = scanner.nextLine();
        System.out.println("Description:");
        description = scanner.nextLine();
        Product newProduct = new Product(id,name,brand,price,description);
        return newProduct;
    }
    public void display(){
        List<Product> list = repo.getAll();
        for (Product product : list){
            System.out.println(product.toString());
        }
    }
}
