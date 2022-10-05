package CaseStudy.ManageResort.controller;
import CaseStudy.ManageResort.service.ImplFacility.HouseService;
import CaseStudy.ManageResort.service.ImplFacility.RoomService;
import CaseStudy.ManageResort.service.ImplFacility.VillaService;
import CaseStudy.ManageResort.service.ImplPerson.CustomerService;
import CaseStudy.ManageResort.service.ImplPerson.EmployeeService;
import CaseStudy.ManageResort.view.FuramaView;

import java.util.Scanner;

public class FuramaController {
    private static HouseService houseService = new HouseService();
    private static RoomService roomService = new RoomService();
    private static VillaService villaService = new VillaService();
    private static EmployeeService employeeService = new EmployeeService();
    private static CustomerService customerService = new CustomerService();
    private static FuramaView furamaView = new FuramaView();

    public static void main(String[] args) {

        int mainSelect;
        Scanner scanner = new Scanner(System.in);
        do {
            furamaView.displayMainMenu();
        mainSelect = Integer.parseInt(scanner.nextLine());
        switch (mainSelect){
            case 1:
                int employeeSelect;
                employeeSelect = Integer.parseInt(scanner.nextLine());
                do {
                    furamaView.displayEmployeeMenu();
                    switch (employeeSelect){
                        case 1:
                            employeeService.displayListPerson();
                            break;
                        case 2:
                            employeeService.addNewPerson();
                            break;
                        case 3:
                            employeeService.editPerson();
                            break;
                    }
                }while (employeeSelect!=4);
                break;
            case 2:
                int customerSelect;
                customerSelect = Integer.parseInt(scanner.nextLine());
                do {
                    furamaView.displayCustomerMenu();
                    switch (customerSelect){
                        case 1:
                            customerService.displayListPerson();
                            break;
                        case 2:
                            customerService.addNewPerson();
                            break;
                        case 3:
                            customerService.editPerson();
                            break;
                    }
                }while (customerSelect!=4);
                break;
            case 3:
                int facilitySelect ;

                do {
                    furamaView.displayFacilityMenu();
                    facilitySelect = Integer.parseInt(scanner.nextLine());
                    switch (facilitySelect){
                        case 1:
                            int dislayFacilitySelect ;
                            do{
                            System.out.println("1:Display room list");
                            System.out.println("2:Display villa list");
                            System.out.println("3:Display house list");
                            System.out.println("4: Back");
                            dislayFacilitySelect = Integer.parseInt(scanner.nextLine());
                            switch (dislayFacilitySelect){
                                case 1:
                                    roomService.displayListFacility();
                                    break;
                                case 2:
                                    villaService.displayListFacility();
                                    break;
                                case 3:
                                    houseService.displayListFacility();
                                    break;
                            }
                            }while (dislayFacilitySelect!=4);
                            break;
                        case 2:
                            int addFacilitySelect;
                            do{
                                System.out.println("1:Add new Room");
                                System.out.println("2:Add new Villa");
                                System.out.println("3:Add new House");
                                System.out.println("4:Back");
                                addFacilitySelect = Integer.parseInt(scanner.nextLine());
                                switch (addFacilitySelect){
                                    case 1:
                                        roomService.addNewFacility();
                                        break;
                                    case 2:
                                        villaService.addNewFacility();
                                        break;
                                    case 3:
                                        houseService.addNewFacility();
                                        break;
                                }
                            }while (addFacilitySelect!=4);
                            //add
                            break;
                        case 3:
                            //editList
                            break;
                    }
                }while (facilitySelect!=4);

                break;
            case 4:
                int bookingSelect;
                bookingSelect = Integer.parseInt(scanner.nextLine());
                do {
                    furamaView.displayBookingMenu();
                    switch (bookingSelect){
                        case 1:
                            // add
                            break;
                        case 2:
                            //display
                            break;
                        case 3:
                            //create new contract
                            break;
                        case 4:
                            //displayListContract
                            break;
                        case 5:
                            //editContract
                            break;
                    }

                }while (bookingSelect!=6);

                break;
            case 5:
                String promotionSelect;
                promotionSelect = scanner.nextLine();
                do {
                    switch (promotionSelect){
                        case "a":
                            //diplayList customer use service
                            break;
                        case "b":
                            // 	Display list customers get voucher
                            break;
                    }
                }while (promotionSelect!="c");
                furamaView.promotionManager();
                break;

        }
        }while (mainSelect!=6);
    }

}
