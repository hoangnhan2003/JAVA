package BTTHEMHAITT.BT2.service;

import BTTHEMHAITT.BT2.model.Car;
import BTTHEMHAITT.BT2.repository.ArrayCar;

public class ServiceCar implements ServiceVehicle<Car>{
    ArrayCar repositoryCar = new ArrayCar();
    @Override
    public void add(Car element) {
        repositoryCar.add(element);
    }

    @Override
    public void search(String bienSo) {
        repositoryCar.search(bienSo);
    }

    @Override
    public void remove(int index) {
        repositoryCar.remove(index);
    }

    @Override
    public void display() {
        repositoryCar.display();
    }
}
