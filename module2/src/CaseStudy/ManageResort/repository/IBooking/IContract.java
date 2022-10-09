package CaseStudy.ManageResort.repository.IBooking;

import CaseStudy.ManageResort.model.feature.Contract;

import java.util.List;
import java.util.Queue;

public interface IContract {
    void add();
    Queue<Contract> getData();
}
