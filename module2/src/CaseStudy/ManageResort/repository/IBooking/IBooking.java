package CaseStudy.ManageResort.repository.IBooking;

import CaseStudy.ManageResort.model.feature.Booking;

import java.util.List;
import java.util.TreeSet;

public interface IBooking {
    void add(Booking newBooking);
    TreeSet<Booking> getData();

}
