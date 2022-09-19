package ss17IObinaryFile.BT.ManageProduct.controller;

import ss12.BT.QuanLiSanPham.model.impl.Product;

import ss17IObinaryFile.BT.ManageProduct.service.ProductService;

import java.util.Scanner;

public class controller {
    static Scanner scanner = new Scanner(System.in);

    static public int getOption(){
        int option;
        System.out.println("---------------------------------MENU--------------------------");
        System.out.println("0:Quit");
        System.out.println("1:Add product");
        System.out.println("2:Search product by name");
        System.out.println("3:Display list product");

        option= Integer.parseInt(scanner.nextLine());

        return option;
    }
    static public void MENU(ProductService productService){

        int option;
        do {
            option = getOption();
            switch (option){
                case 1:
                    productService.add();
                    break;
                case 2:
                    int id;
                    System.out.println("Input id product you want to search");
                    id = Integer.parseInt(scanner.nextLine());
                    productService.search(id);
                    break;
                case 3:
                    productService.display();
                    break;
            }
        }while (option!=0);

    }

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        MENU(productService);
    }
}
