package ss12.BT.QuanLiSanPham.controller;

import ss12.BT.QuanLiSanPham.model.impl.Product;
import ss12.BT.QuanLiSanPham.service.impl.ServiceProduct;

import java.util.Scanner;

public class control {
    static Scanner scanner = new Scanner(System.in);

    static public int getOption(){
        int option;
        System.out.println("---------------------------------MENU--------------------------");
        System.out.println("1:Add product");
        System.out.println("2:Remove product by id");
        System.out.println("3:Search product by name");
        System.out.println("4:Display list product");
        System.out.println("5:Sort up ascending by price");
        System.out.println("6:Sort descending by price");
        option= Integer.parseInt(scanner.nextLine());

        return option;
    }
    static public void MENU(ServiceProduct serviceProduct){
        int option;
        do {
            option = getOption();
            switch (option){
                case 1:
                    Product newProduct = serviceProduct.info();
                    serviceProduct.add(newProduct);
                    break;
                case 2:
                    String id;
                    System.out.println("Input id product you want to delete");
                    id = scanner.nextLine();
                    serviceProduct.remove(id);
                    break;
                case 3:
                    String nameProduct;
                    System.out.println("Enter product's name to find");
                    nameProduct = scanner.nextLine();
                    serviceProduct.searchByName(nameProduct);
                    break;
                case 4:
                    serviceProduct.display();
                    break;
                case 5:
                    serviceProduct.sortIncreaseByPrice();
                    break;
                case 6:
                    serviceProduct.sortDecreaseByPrice();
                    break;

            }
        }while (option!=0);

    }

    public static void main(String[] args) {
        ServiceProduct serviceProduct = new ServiceProduct();
        MENU(serviceProduct);
    }
}
