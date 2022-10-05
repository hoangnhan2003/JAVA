package CaseStudy.ManageResort.model.feature;

public abstract class AbsService {
    private String bookingCode;
    private String startDay;
    private String endDay;
    private String customerCode;
    private String nameService;
    private String serviceType;

    public AbsService(String bookingCode, String startDay, String endDay, String customerCode, String nameService, String serviceType) {
        this.bookingCode = bookingCode;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerCode = customerCode;
        this.nameService = nameService;
        this.serviceType = serviceType;
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
                serviceType + '\n';
    }

    public String display(){
        return "Service{" +
                "bookingCode='" + bookingCode + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", nameService='" + nameService + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
}
