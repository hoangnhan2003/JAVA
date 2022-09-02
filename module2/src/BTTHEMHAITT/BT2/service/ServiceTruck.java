package BTTHEMHAITT.BT2.service;

import BTTHEMHAITT.BT2.model.Truck;
import BTTHEMHAITT.BT2.repository.ArrTruck;

public class ServiceTruck implements ServiceVehicle<Truck>{
    ArrTruck repositoryTruck = new ArrTruck();

    @Override
    public void add(Truck element) {
        repositoryTruck.add(element);
    }

    @Override
    public void search(String bienSo) {
        repositoryTruck.search(bienSo);
    }

    @Override
    public void remove(int index) {
        repositoryTruck.remove(index);
    }

    @Override
    public void display() {
        repositoryTruck.display();
    }
}
