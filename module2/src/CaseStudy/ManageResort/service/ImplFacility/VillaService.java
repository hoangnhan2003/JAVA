package CaseStudy.ManageResort.service.ImplFacility;

import CaseStudy.ManageResort.model.Facility.Villa;
import CaseStudy.ManageResort.repository.impFacility.VillaRepo;
import CaseStudy.ManageResort.service.IFacility.IFacilityService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaService implements IFacilityService {
    VillaRepo villaRepo = new VillaRepo();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void displayListFacility() {
        List<Villa> villaList = villaRepo.getAll();
        for(Villa villa : villaList){
            System.out.println(villa.display());
        }
    }

    @Override
    public void addNewFacility() {
        Villa newVilla = getInfo();
        villaRepo.add(newVilla);
    }

    @Override
    public void displayListFacilityMaintenance() {

    }
    public Villa getInfo(){
        String service;
        float fee;
        float useArea;
        int maxPerson;
        int qualifiedRoom;
        float poolArea;
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
        System.out.println("Pool area:");
        poolArea = Float.parseFloat(scanner.nextLine());
        Villa newVilla = new Villa(service,fee,useArea,maxPerson,qualifiedRoom,poolArea);
        return newVilla;
    }
}
