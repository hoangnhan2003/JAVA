package BTTHEMHAITT.BT2.model;

public class Truck extends Vehicle {
    private float trongTai;


    public Truck(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu, float trongTai) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "trongTai=" + trongTai +
                ", bienKiemSoat='" + super.getBienKiemSoat() + '\'' +
                ", tenHang='" + super.getTenHang() + '\'' +
                ", namSanXuat=" + super.getNamSanXuat() +
                ", chuSoHuu='" + super.getChuSoHuu() + '\'' +
                '}';
    }
}
