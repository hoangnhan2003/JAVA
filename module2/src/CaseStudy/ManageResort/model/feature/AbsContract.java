package CaseStudy.ManageResort.model.feature;

public abstract class AbsContract {
    private String contractCode;
    private String bookingCode;
    private int deposit;
    private int sumMoney;
    private String customerCode;

    public AbsContract(String contractCode, String bookingCode, int deposit, int sumMoney, String customerCode) {
        this.contractCode = contractCode;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.sumMoney = sumMoney;
        this.customerCode = customerCode;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(int sumMoney) {
        this.sumMoney = sumMoney;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return contractCode + ',' +
                bookingCode + ',' +
                deposit +","+
                sumMoney + ","+
                customerCode + '\n';

    }
    public String display(){
        return "Contract{" +
                "contractCode='" + contractCode + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", deposit=" + deposit +
                ", sumMoney=" + sumMoney +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}
