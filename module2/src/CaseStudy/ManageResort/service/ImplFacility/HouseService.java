package CaseStudy.ManageResort.service.ImplFacility;

import CaseStudy.ManageResort.model.Facility.House;
import CaseStudy.ManageResort.repository.impFacility.HouseRepo;
import CaseStudy.ManageResort.service.IFacility.IFacilityService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseService implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    HouseRepo houseRepo = new HouseRepo();
    @Override
    public void displayListFacility() {
        List<House> houseList = houseRepo.getAll();
        for(House house : houseList){
            System.out.println(house.display());
        }
    }

    @Override
    public void addNewFacility() {
        House newHouse = getInfor();
        houseRepo.add(newHouse);
    }

    @Override
    public void displayListFacilityMaintenance() {

    }
    public House getInfor(){
        String service;
        float fee;
        float useArea;
        int maxPerson;
        int qualifiedRoom;
        int numOfFloor;
        System.out.println("Enter name service:");
        service = scanner.nextLine();
        System.out.println("Enter fee:");
        fee = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter use Area: ");
        useArea = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter max person: ");
        maxPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("Qualified room:");
        qualifiedRoom = Integer.parseInt(scanner.nextLine());
        System.out.println("Number of floor:");
        numOfFloor = Integer.parseInt(scanner.nextLine());
        House newHouse = new House(service,fee,useArea,maxPerson,qualifiedRoom,numOfFloor);
        return newHouse;

    }

    public static void main(String[] args) {
        HouseService houseService = new HouseService();
        houseService.displayListFacility();
    }
}
