package TestCodeGym.model;

public class DTXachTay extends AbsPhone{
    static int count =1;
    private String nature;
    private String status;

    public DTXachTay( String namePhone, float price, int amount, String manuFactor, String nature, String status) {
        super(namePhone, price, amount, manuFactor);
        this.nature = nature;
        this.status = status;
        super.setId(count);
        count++;
    }

    public DTXachTay(int id) {
        super(id);
    }

    public DTXachTay(String namePhone) {
        super(namePhone);
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() +
                "nature='" + nature + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    public String convertToString(){
        return super.getId() +","+
                super.getNamePhone()+',' +
                super.getPrice() +","+
                super.getAmount() +","+
                super.getManuFactor() + ','+
                nature+','+status+'\n';
    }
}
