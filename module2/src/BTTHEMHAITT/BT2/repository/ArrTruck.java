package BTTHEMHAITT.BT2.repository;

import BTTHEMHAITT.BT2.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class ArrTruck implements Array<Truck>{
    private static List<Truck> listTruck;
    static {
        listTruck = new ArrayList<>();
        Truck trk1 = new Truck("73H-00123","Huyndai",2020,"Nhan",3);
        Truck trk2 = new Truck("73H-00124","Huyndai",2020,"Nhan",3);
        Truck trk3 = new Truck("73H-00125","Huyndai",2020,"Nhan",3);
        Truck trk4 = new Truck("73H-00126","Huyndai",2020,"Nhan",3);
        Truck trk5 = new Truck("73H-00127","Huyndai",2020,"Nhan",3);
        Truck trk6 = new Truck("73H-00128","Huyndai",2020,"Nhan",3);
        listTruck.add(trk1);
        listTruck.add(trk2);
        listTruck.add(trk3);
        listTruck.add(trk4);
        listTruck.add(trk5);
        listTruck.add(trk6);
    }
    public ArrTruck(){
        listTruck = new ArrayList<>();
    }
    public void add(Truck element){
        listTruck.add(element);

    }
    public void remove(int index){
        listTruck.remove(index);
    }
    public void display(){
        for (Truck element : listTruck){
            System.out.println(element.toString());
        }
    }
    public void search(String bienSo){
        for (Truck element : listTruck){
            if(element.getBienKiemSoat().equals(bienSo)){
                System.out.println(element.toString());
            }
        }
    }
}
