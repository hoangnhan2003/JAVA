package TestCodeGym.model;

public class DTChinhHang extends AbsPhone{
    static int count = 1;
    private int tgianBaoHanh;
    private String phamViBaoHanh;

    public DTChinhHang( String namePhone, float price, int amount, String manuFactor, int tgianBaoHanh, String phamViBaoHanh) {
        super( namePhone, price, amount, manuFactor);
        this.tgianBaoHanh = tgianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
        super.setId(count);
        count++;
    }

    public DTChinhHang(int id) {
        super(id);
    }

    public DTChinhHang(String namePhone) {
        super(namePhone);
    }

    public int getTgianBaoHanh() {
        return tgianBaoHanh;
    }

    public void setTgianBaoHanh(int tgianBaoHanh) {
        this.tgianBaoHanh = tgianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tgianBaoHanh='" + tgianBaoHanh + '\'' +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
                '}';
    }
    public String convertToString(){
        return super.getId() +","+
                super.getNamePhone()+',' +
                super.getPrice() +","+
                super.getAmount() +","+
                super.getManuFactor() + ','
                +tgianBaoHanh+","+phamViBaoHanh+'\n';
    }
}
