package BTTHEMHAITT.BT2.controller;

import BTTHEMHAITT.BT2.model.Car;
import BTTHEMHAITT.BT2.model.Motorbike;
import BTTHEMHAITT.BT2.model.Truck;
import BTTHEMHAITT.BT2.service.ServiceCar;
import BTTHEMHAITT.BT2.service.ServiceMotorbike;
import BTTHEMHAITT.BT2.service.ServiceTruck;
import ss4.Fan;

import java.sql.SQLOutput;

import java.util.Scanner;

public class controller {
    public static int getSelect(){
        Scanner scanner = new Scanner(System.in);
        int select ;
        System.out.println("Enter request:");
        System.out.println("------------------------MENU---------------------");
        System.out.println("1:Add vehicle");
        System.out.println("2:Remove vehicle");
        System.out.println("3:Search vehicle");
        System.out.println("4:Display vehicle");
        select = Integer.parseInt(scanner.nextLine());
        return select;
    }
    public static void MENU(ServiceCar listCar, ServiceTruck listTruck, ServiceMotorbike listMotor){
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            select = getSelect();
            switch (select){
                case 1:
                    int option;
                    System.out.println("1:Add car");
                    System.out.println("2:Add Motorbike");
                    System.out.println("3:Add truck");
                    option = Integer.parseInt(scanner.nextLine());
                    if(option == 1){
                        String bienKiemSoat;
                        String tenHang;
                        int namSanXuat;
                        String chuSoHuu;
                        int soChoNgoi;
                        String kieuXe;
                        System.out.println("Enter license plates");
                        bienKiemSoat = scanner.nextLine();
                        System.out.println("Enter brand");
                        tenHang = scanner.nextLine();
                        System.out.println("Year of manufacture");
                        namSanXuat = Integer.parseInt(scanner.nextLine());
                        System.out.println("Owner:");
                        chuSoHuu = scanner.nextLine();
                        System.out.println("Number of seat:");
                        soChoNgoi = Integer.parseInt(scanner.nextLine());
                        System.out.println("Vehicle type");
                        kieuXe = scanner.nextLine();
                        Car newCar = new Car(bienKiemSoat,tenHang,namSanXuat,chuSoHuu,soChoNgoi,kieuXe);
                        listCar.add(newCar);
                    }
                    else if(option ==2){
                        String bienKiemSoat;
                        String tenHang;
                        int namSanXuat;
                        String chuSoHuu;
                        float congSuat;
                        System.out.println("Enter license plates");
                        bienKiemSoat = scanner.nextLine();
                        System.out.println("Enter brand");
                        tenHang = scanner.nextLine();
                        System.out.println("Year of manufacture");
                        namSanXuat = Integer.parseInt(scanner.nextLine());
                        System.out.println("Owner:");
                        chuSoHuu = scanner.nextLine();
                        System.out.println("Wattage:");
                        congSuat = Float.parseFloat(scanner.nextLine());
                        Motorbike newMTB = new Motorbike(bienKiemSoat,tenHang,namSanXuat,chuSoHuu,congSuat);
                        listMotor.add(newMTB);
                    }
                    else if(option ==3){
                        String bienKiemSoat;
                        String tenHang;
                        int namSanXuat;
                        String chuSoHuu;
                        float trongTai;
                        System.out.println("Enter license plates");
                        bienKiemSoat = scanner.nextLine();
                        System.out.println("Enter brand");
                        tenHang = scanner.nextLine();
                        System.out.println("Year of manufacture");
                        namSanXuat = Integer.parseInt(scanner.nextLine());
                        System.out.println("Owner:");
                        chuSoHuu = scanner.nextLine();
                        System.out.println("Tonnage");
                        trongTai = Float.parseFloat(scanner.nextLine());
                        Truck newTruck = new Truck(bienKiemSoat,tenHang,namSanXuat,chuSoHuu,trongTai);
                        listTruck.add(newTruck);
                    }
                    break;
                case 2:
                    System.out.println("1:remove car");
                    System.out.println("2:remove motorbike");
                    System.out.println("3:remove truck");
                    int c2;
                    c2 = Integer.parseInt(scanner.nextLine());
                    if(c2==1){
                        int index;
                        System.out.println("Enter index you want to remove:");
                        index = Integer.parseInt(scanner.nextLine());
                        listCar.remove(index);
                    }
                    else if(c2==2){
                        int index;
                        System.out.println("Enter index you want to remove:");
                        index = Integer.parseInt(scanner.nextLine());
                        listMotor.remove(index);
                    }
                    else if(c2 ==3){
                        int index;
                        System.out.println("Enter index you want to remove:");
                        index = Integer.parseInt(scanner.nextLine());
                        listTruck.remove(index);
                    }
                    break;
                case 3:
                    System.out.println("1:Search car");
                    System.out.println("2:search motorbike");
                    System.out.println("3:Search truck");
                    int c3 = Integer.parseInt(scanner.nextLine());
                    String bienSo;
                    System.out.println("Enter license plate");
                    bienSo = scanner.nextLine();
                    if(c3 ==1){
                        listCar.search(bienSo);
                    }
                    else if(c3==2){
                        listMotor.search(bienSo);
                    }
                    else if(c3 ==3){
                        listTruck.search(bienSo);
                    }

                case 4:
                    int c4;
                    System.out.println("1:Display list car:");
                    System.out.println("2:Display list motorbike");
                    System.out.println("3:Display list truck");
                    c4 = Integer.parseInt(scanner.nextLine());
                    if(c4 ==1){
                        listCar.display();
                    } else if (c4 ==2) {
                        listMotor.display();
                    }
                    else if(c4 ==3){
                        listTruck.display();
                    }

            }
        }while (select !=0);
    }
    public static void main(String[] args) {
        ServiceCar serviceCar = new ServiceCar();
        ServiceMotorbike serviceMotorbike = new ServiceMotorbike();
        ServiceTruck serviceTruck = new ServiceTruck();
        MENU(serviceCar,serviceTruck,serviceMotorbike);
    }
}
