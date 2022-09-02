package BTTHEMHAITT.BT2.repository;

import BTTHEMHAITT.BT2.model.Motorbike;

import java.util.ArrayList;
import java.util.List;

public class ArrMotorbike implements Array<Motorbike>{
    private static List<Motorbike> listMotorBike;
    static {
        listMotorBike = new ArrayList<>();
        Motorbike mt1 = new Motorbike("73A-00357","Honda",2018,"Nhan",50);
        Motorbike mt2 = new Motorbike("73A-00367","Honda",2018,"Nhan",50);
        Motorbike mt3 = new Motorbike("73A-00389","Honda",2018,"Nhan",50);
        Motorbike mt4 = new Motorbike("73A-00456","Honda",2018,"Nhan",50);
        Motorbike mt5 = new Motorbike("73A-00789","Honda",2018,"Nhan",50);
        listMotorBike.add(mt1);
        listMotorBike.add(mt2);
        listMotorBike.add(mt3);
        listMotorBike.add(mt4);
        listMotorBike.add(mt5);
    }
    public ArrMotorbike(){
        listMotorBike = new ArrayList<>();
    }
    public void add(Motorbike element){
        listMotorBike.add(element);

    }
    public void remove(int index){
        listMotorBike.remove(index);
    }
    public void display(){
        for (Motorbike element : listMotorBike){
            System.out.println(element.toString());
        }
    }
    public void search(String bienSo){
        for (Motorbike element : listMotorBike){
            if(element.getBienKiemSoat().equals(bienSo)){
                System.out.println(element.toString());
            }
        }
    }
}
