package CaseStudy.ManageResort.service.ImplFacility;

import CaseStudy.ManageResort.model.Facility.Room;
import CaseStudy.ManageResort.repository.impFacility.RoomRepo;
import CaseStudy.ManageResort.service.IFacility.IFacilityService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomService implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    RoomRepo roomRepo = new RoomRepo();
    @Override
    public void displayListFacility() {
        List<Room> roomList = roomRepo.getAll();
        for(Room room : roomList){
            System.out.println(room.display());
        }
    }

    @Override
    public void addNewFacility() {
        Room newRoom = getInfo();
        roomRepo.add(newRoom);
    }

    @Override
    public void displayListFacilityMaintenance() {

    }
    public Room getInfo(){
        String service;
        float fee;
        float useArea;
        int maxPerson;
        String freeService;
        System.out.println("Enter name service:");
        service = scanner.nextLine();
        System.out.println("Enter fee:");
        fee = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter use Area: ");
        useArea = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter max person: ");
        maxPerson = Integer.parseInt(scanner.nextLine());
        System.out.println("Free Service:");
        freeService = scanner.nextLine();
        Room newRoom = new Room(service,fee,useArea,maxPerson,freeService);
        return newRoom;
    }
}
