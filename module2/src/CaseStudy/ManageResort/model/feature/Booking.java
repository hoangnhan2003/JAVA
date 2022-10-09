package CaseStudy.ManageResort.model.feature;

public class Booking extends AbsService implements Comparable<Booking>{
    public Booking(String bookingCode, String startDay, String endDay, String customerCode, String nameService, String serviceType,boolean hasContract) {
        super(bookingCode, startDay, endDay, customerCode, nameService, serviceType,hasContract);
    }

    public Booking(String bookingCode) {
        super(bookingCode);
    }

    @Override
    public int compareTo(Booking o) {
        String startDay = this.getStartDay();
        int year1 = Integer.parseInt(startDay.substring(6));
        int month1 =Integer.parseInt(startDay.substring(3,5));
        int day1 = Integer.parseInt(startDay.substring(0,2));
        String startDay2 = o.getStartDay();
        int year2 = Integer.parseInt(startDay2.substring(6));
        int month2 =Integer.parseInt(startDay2.substring(3,5));
        int day2 = Integer.parseInt(startDay2.substring(0,2));
        if(year1 == year2){
            if(month1 == month2){
                return day2 - day1;
            }
            else{
                return month2 - month1;
            }
        }else {
            return year2 - year1;
        }
    }


//    public static void main(String[] args) {
//        String startDay = "23/05/2003";
//        String year1 = startDay.substring(6);
//        String month1 =startDay.substring(3,5);
//        String day1 = startDay.substring(0,2);
//        String startDay2 = "13/06/2012";
////        int year2 = Integer.parseInt(startDay2.substring(5));
////        int month2 =Integer.parseInt(startDay2.substring(2,4));
////        int day2 = Integer.parseInt(startDay2.substring(0,1));
//        System.out.println(year1);
//        System.out.println(month1);
//        System.out.println(day1);
//    }
}
