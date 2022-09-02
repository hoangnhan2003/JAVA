package BTTHEMHAITT.BT2.service;

import BTTHEMHAITT.BT2.model.Motorbike;
import BTTHEMHAITT.BT2.repository.ArrMotorbike;

public class ServiceMotorbike implements ServiceVehicle<Motorbike> {
    ArrMotorbike repositoryMotor = new ArrMotorbike();

    @Override
    public void add(Motorbike element) {
        repositoryMotor.add(element);
    }

    @Override
    public void search(String bienSo) {
        repositoryMotor.search(bienSo);
    }

    @Override
    public void remove(int index) {
        repositoryMotor.remove(index);
    }

    @Override
    public void display() {
        repositoryMotor.display();
    }
}
