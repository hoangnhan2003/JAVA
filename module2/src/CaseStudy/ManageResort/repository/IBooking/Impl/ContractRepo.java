package CaseStudy.ManageResort.repository.IBooking.Impl;

import CaseStudy.ManageResort.model.feature.Booking;
import CaseStudy.ManageResort.model.feature.Contract;
import CaseStudy.ManageResort.repository.IBooking.IContract;

import java.io.*;
import java.util.*;

public class ContractRepo implements IContract {
    Scanner scanner = new Scanner(System.in);
    Queue<Contract> data = new LinkedList<>();
    BookingRepo bookingRepo = new BookingRepo();
    TreeSet<Booking> bookingTreeSet = bookingRepo.getData();
    @Override
    public void add() {
        String bookingCode;
        for(Booking booking : bookingTreeSet){
            bookingCode = booking.getBookingCode();
            if(!booking.isHasContract()){
                booking.setHasContract(true);
                String contractCode;
                int deposit;
                int sumMoney;
                String customerCode = booking.getCustomerCode();
                System.out.println("Enter contract code :");
                contractCode = scanner.nextLine();
                System.out.println("Enter deposit");
                deposit = Integer.parseInt(scanner.nextLine());
                System.out.println("Sum money:");
                sumMoney = Integer.parseInt(scanner.nextLine());
                Contract contract = new Contract(contractCode,bookingCode,deposit,sumMoney,customerCode);
                data.add(contract);
                break;
            }
        }
        update();
    }


    @Override
    public Queue<Contract> getData() {
        Queue<Contract> contractQueue = new LinkedList<>();
        File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\contract.csv");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while((line = bufferedReader.readLine())!= null){
                String[] strings = line.split(",");
                String contractCode = strings[0];
                String bookingCode = strings[1];
                int deposit = Integer.parseInt(strings[2]);
                int sumMoney = Integer.parseInt(strings[3]);
                String customerCode = strings[4];
                Contract contract = new Contract(contractCode,bookingCode,deposit,sumMoney,customerCode);
                contractQueue.add(contract);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contractQueue;
    }
    public void update(){
        File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\contract.csv");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for(Contract contract : data){
                bufferedWriter.write(contract.toString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
