package CaseStudy.ManageResort.model.feature;

public class Booking extends AbsService implements Comparable<Booking>{
    public Booking(String bookingCode, String startDay, String endDay, String customerCode, String nameService, String serviceType) {
        super(bookingCode, startDay, endDay, customerCode, nameService, serviceType);
    }

    @Override
    public int compareTo(Booking o) {
        String startDay = this.getStartDay();
        int year1 = Integer.parseInt(startDay.substring(5));
        int month1 =Integer.parseInt(startDay.substring(2,4));
        int day1 = Integer.parseInt(startDay.substring(0,1));
        String startDay2 = o.getStartDay();
        int year2 = Integer.parseInt(startDay2.substring(5));
        int month2 =Integer.parseInt(startDay2.substring(2,4));
        int day2 = Integer.parseInt(startDay2.substring(0,1));
        if(year1 == year2){

        }else {
            return year2 - year1;
        }

        return 0;
    }
}
