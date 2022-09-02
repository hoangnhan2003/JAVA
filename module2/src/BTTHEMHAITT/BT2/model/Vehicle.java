package BTTHEMHAITT.BT2.model;

public abstract class Vehicle {
    private String bienKiemSoat;
    private String tenHang;
    private int namSanXuat;
    private String chuSoHuu;

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public Vehicle(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHang = tenHang;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }
}
