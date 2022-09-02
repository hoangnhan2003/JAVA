package BTTHEMHAITT.BT2.model;

public class Motorbike extends Vehicle {
    private float congSuat;
    public Motorbike(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu, float congSuat) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "congSuat=" + congSuat +
                ", bienKiemSoat='" + super.getBienKiemSoat() + '\'' +
                ", tenHang='" + super.getTenHang() + '\'' +
                ", namSanXuat=" + super.getNamSanXuat() +
                ", chuSoHuu='" + super.getChuSoHuu() + '\'' +
                '}';
    }

}
