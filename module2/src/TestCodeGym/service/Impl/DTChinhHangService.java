package TestCodeGym.service.Impl;

import TestCodeGym.model.DTChinhHang;
import TestCodeGym.repository.Impl.RepoDTChinhHang;
import TestCodeGym.service.IServicePhone;
import ss12.BT.QuanLiSanPham.repository.InterArr;

import java.util.List;
import java.util.Scanner;

public class DTChinhHangService implements IServicePhone<DTChinhHang> {
    RepoDTChinhHang repoDTChinhHang = new RepoDTChinhHang();

    @Override
    public DTChinhHang getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name phone");
        String namePhone =scanner.nextLine();
        System.out.println("enter price phone");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter amount of phone");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("enter factory");
        String manuFactor = scanner.nextLine();
        System.out.println("Nhap thoi gian bao hanh");
        int tgianBaoHanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap pham vi bao hanh");
        String phamViBaoHanh = scanner.nextLine();
        DTChinhHang dtChinhHang = new DTChinhHang(namePhone,price,amount,manuFactor,tgianBaoHanh,phamViBaoHanh);

        return dtChinhHang;
    }

    @Override
    public void add() {
        DTChinhHang dtChinhHang = getInfo();
        repoDTChinhHang.add(dtChinhHang);

    }

    @Override
    public int search(int id) {
        return repoDTChinhHang.search(id);
    }

    @Override
    public int search(String namePhone) {
        return repoDTChinhHang.search(namePhone);
    }

    @Override
    public void delete(int id) {
        repoDTChinhHang.deletePhone(id);
    }

    @Override
    public void displayList() {
        List<DTChinhHang> dtChinhHangList = repoDTChinhHang.getData();
        for(DTChinhHang dtChinhHang : dtChinhHangList){
            System.out.println(dtChinhHang.toString());
        }
    }


}
