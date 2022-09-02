package BTTHEMHAITT.BT2.repository;

import BTTHEMHAITT.BT2.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ArrayCar implements Array<Car> {
    private static List<Car> listCar ;
    static {
        listCar = new ArrayList<>();
        Car car1 = new Car("73A-0009867","Honda",2020,"Hoang Nhan",4,"Xe con");
        Car car2 = new Car("73B-00456","Honda",2020,"Hoang Sam",5,"Taxi");
        Car car3 = new Car("73A-11111","Honda",2020,"Thuy Dung",4,"taxi");
        Car car4 = new Car("73A-222222","Honda",2020,"Ngo Nhan",4,"taxi");
        listCar.add(car1);
        listCar.add(car2);
        listCar.add(car3);
        listCar.add(car4);
    }
    public ArrayCar(){
        listCar = new ArrayList<>();

    }
    public void add(Car element){
        listCar.add(element);

    }
    public void remove(int index){
        listCar.remove(index);
    }
    public void display(){
        for (Car element : listCar){
            System.out.println(element.toString());
        }
    }
    public void search(String bienSo){
        for (Car element : listCar){
            if(element.getBienKiemSoat().equals(bienSo)){
                System.out.println(element.toString());
            }
        }
    }

}
