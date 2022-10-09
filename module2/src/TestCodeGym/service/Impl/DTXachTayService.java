package TestCodeGym.service.Impl;

import TestCodeGym.model.DTXachTay;
import TestCodeGym.repository.Impl.RepoDTXachTay;
import TestCodeGym.service.IServicePhone;

import java.util.List;
import java.util.Scanner;

public class DTXachTayService implements IServicePhone<DTXachTay> {
    RepoDTXachTay repoDTXachTay = new RepoDTXachTay();
    @Override
    public DTXachTay getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name phone");
        String namePhone =scanner.nextLine();
        System.out.println("enter price phone");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter amount of phone");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("enter factory");
        String manuFactor = scanner.nextLine();
        System.out.println("Enter nature");
        String nature = scanner.nextLine();
        System.out.println("Enter Status");
        String status = scanner.nextLine();
        DTXachTay dtXachTay = new DTXachTay(namePhone,price,amount,manuFactor,nature,status);
        return dtXachTay;
    }

    @Override
    public void add() {
        DTXachTay dtXachTay = getInfo();
        repoDTXachTay.add(dtXachTay);

    }

    @Override
    public int search(int id) {

        return repoDTXachTay.search(id);
    }

    @Override
    public int search(String namePhone) {
        return repoDTXachTay.search(namePhone);
    }

    @Override
    public void delete(int id) {
        repoDTXachTay.deletePhone(id);
    }

    @Override
    public void displayList() {
        List<DTXachTay> dtXachTayList = repoDTXachTay.getData();
        for(DTXachTay dtXachTay : dtXachTayList){
            System.out.println(dtXachTay.toString());
        }
    }
}
