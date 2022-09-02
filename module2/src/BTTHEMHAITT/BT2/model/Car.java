package BTTHEMHAITT.BT2.model;

public class Car extends Vehicle {
    private int soChoNgoi;
    private String kieuXe;


    public Car(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Car{"
                +"BienKiemSoat="+ super.getBienKiemSoat()+'\n'+
                "tenHang= "+ super.getTenHang()+'\n'+
                "Nam San Xuat = "+super.getNamSanXuat()+'\n'+
                "Chu so huu = "+super.getChuSoHuu()+'\n'+
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
