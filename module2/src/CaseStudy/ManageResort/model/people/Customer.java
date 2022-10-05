package CaseStudy.ManageResort.model.people;

import java.io.Serializable;

public class Customer extends Person implements Serializable {
    private String idCustomer;
    private String customerType;
    private String address;

    public Customer(String name, int sex, String dateOfBirth, String identifyCard, String numberPhone, String idCustomer, String customerType, String address) {
        super(name, sex, dateOfBirth, identifyCard, numberPhone);
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name) {
        super(name);
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getName()+","+getSex()+","+getDateOfBirth()+","+getIdentifyCard()+","+getNumberPhone()+","+getIdCustomer()+","+getCustomerType()+","+getAddress();
    }

    public String display(){
        return "Customer{" +
                "name='" + getName() + '\'' +
                ", sex=" + getSex() +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", identifyCard='" + getIdentifyCard() + '\'' +
                ", numberPhone='" + getNumberPhone() + '\'' +
                "idCustomer='" + idCustomer + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
