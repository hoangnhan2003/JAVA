package TestCodeGym.model;

import java.util.Objects;

public abstract class AbsPhone {

    private int id;
    private String namePhone;
    private float price;
    private int amount;
    private String manuFactor;

    public AbsPhone(String numberPhone, float price, int amount, String manuFactor) {
        this.id = id;
        this.namePhone = numberPhone;
        this.price = price;
        this.amount = amount;
        this.manuFactor = manuFactor;
    }

    public AbsPhone(int id) {
        this.id = id;
    }

    public AbsPhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getManuFactor() {
        return manuFactor;
    }

    public void setManuFactor(String manuFactor) {
        this.manuFactor = manuFactor;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id='" + id + '\'' +
                ", numberPhone='" + namePhone + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", manuFactor='" + manuFactor + '\'' ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbsPhone)) return false;
        AbsPhone absPhone = (AbsPhone) o;
        return getId() == absPhone.getId() || Objects.equals(getNamePhone(), absPhone.getNamePhone());
    }


}
