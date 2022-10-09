package CaseStudy.ManageResort.repository.IBooking.Impl;

import CaseStudy.ManageResort.model.feature.Booking;
import CaseStudy.ManageResort.repository.IBooking.IBooking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BookingRepo implements IBooking {
    TreeSet<Booking> data = getData();
    @Override
    public void add(Booking newBooking) {
        data.add(newBooking);
        update();
    }

    @Override
    public TreeSet<Booking> getData() {
        TreeSet<Booking> data = new TreeSet<>();
        File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\booking.csv");
        if(file.exists() && file != null){
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line=bufferedReader.readLine())!=null){
                    String[] strings = line.split(",");
                    String bookingCode = strings[0];
                    String startDay =strings[1];
                    String endDay = strings[2];
                    String customerCode = strings[3];
                    String nameService = strings[4];
                    String serviceType =strings[5];
                    Booking newBooking = new Booking(bookingCode,startDay,endDay,customerCode,nameService,serviceType,false);
                    data.add(newBooking);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            catch (EOFException e ) {
                System.out.println("Loi file rong");
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return data;
    }
    public void update()  {
        File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\booking.csv");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for(Booking booking : data){
                bufferedWriter.write(booking.toString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        BookingRepo bookingRepo = new BookingRepo();
        bookingRepo.add(new Booking("221asd0","11/05/2020","19/05/2020","eSgSE","villa","VIP",false));
        bookingRepo.add(new Booking("221asd0","13/05/2018","19/02/2020","eSgSE","villa","VIP",false));
        bookingRepo.add(new Booking("221asd0","08/05/2020","07/05/2020","eSgSE","villa","VIP",false));
        bookingRepo.add(new Booking("221asd0","23/05/2029","19/05/2020","eSgSE","villa","VIP",false));

    }


}
