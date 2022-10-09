package CaseStudy.ManageResort.service.Ifeature.IpmlFeature;

import CaseStudy.ManageResort.model.feature.Booking;
import CaseStudy.ManageResort.repository.IBooking.Impl.BookingRepo;
import CaseStudy.ManageResort.service.Ifeature.IFeature;

import java.util.Scanner;
import java.util.TreeSet;

public class BookingService implements IFeature {
    Scanner scanner = new Scanner(System.in);
    BookingRepo bookingRepo = new BookingRepo();
    @Override
    public void createNewFeature() {
        Booking newBooking = getInfo();
        bookingRepo.add(newBooking);
    }
    public Booking getInfo(){
        String bookingCode;
        String startDay;
        String endDay;
        String customerCode;
        String nameService;
        String serviceType;
        boolean hasContract = false;
        System.out.println("Enter booking code");
        bookingCode = scanner.nextLine();
        System.out.println("Enter start day :");
        startDay = scanner.nextLine();
        System.out.println("Enter end day:");
        endDay = scanner.nextLine();
        System.out.println("Enter customer code:");
        customerCode = scanner.nextLine();
        System.out.println("Enter name service:");
        nameService = scanner.nextLine();
        System.out.println("Enter service type");
        serviceType = scanner.nextLine();
        Booking newBooking = new Booking(bookingCode,startDay,endDay,customerCode,nameService,serviceType,hasContract);
        return newBooking;
    }

    @Override
    public void display() {
        TreeSet<Booking> bookingTreeSet = bookingRepo.getData();
        for(Booking booking: bookingTreeSet){
            System.out.println(booking.display());
        }
    }
}
