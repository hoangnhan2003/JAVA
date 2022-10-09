package CaseStudy.ManageResort.model.feature;

import java.util.Objects;

public abstract class AbsService {
    private String bookingCode;
    private String startDay;
    private String endDay;
    private String customerCode;
    private String nameService;
    private String serviceType;
    private boolean hasContract;

    public AbsService(String bookingCode, String startDay, String endDay, String customerCode, String nameService, String serviceType,boolean hasContract) {
        this.bookingCode = bookingCode;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerCode = customerCode;
        this.nameService = nameService;
        this.serviceType = serviceType;
        this.hasContract = hasContract;
    }

    public boolean isHasContract() {
        return hasContract;
    }

    public void setHasContract(boolean hasContract) {
        this.hasContract = hasContract;
    }

    public AbsService(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return  bookingCode + ',' +
                startDay + ',' +
                endDay + ',' +
                customerCode + ',' +
                nameService + ',' +
                serviceType +','+
                hasContract +  '\n';
    }

    public String display(){
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", nameService='" + nameService + '\'' +
                ", serviceType='" + serviceType + '\'' +
                "hasContract = "+ hasContract+ '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbsService)) return false;
        AbsService that = (AbsService) o;
        return Objects.equals(getBookingCode(), that.getBookingCode());
    }


}
