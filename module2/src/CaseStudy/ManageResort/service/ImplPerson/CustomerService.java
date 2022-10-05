package CaseStudy.ManageResort.service.ImplPerson;

import CaseStudy.ManageResort.model.people.Customer;
import CaseStudy.ManageResort.repository.ipmPerson.CustomerRepo;
import CaseStudy.ManageResort.service.IPerson.IPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements IPerson {
    Scanner scanner = new Scanner(System.in);
    CustomerRepo customerRepo = new CustomerRepo();
    @Override
    public void displayListPerson() {
        List<Customer> customerList = customerRepo.getAll();
        for(Customer customer : customerList){
            System.out.println(customer.display());
        }
    }

    @Override
    public void addNewPerson() {
        Customer newCustomer = getInfo();
        customerRepo.add(newCustomer);
    }

    @Override
    public void editPerson() {
        List<Customer> customerList = customerRepo.getAll();
        String nameService;
        System.out.println("Enter name service you want to edit");
        nameService = scanner.nextLine();
        Customer customer = new Customer(nameService);
        int index = customerList.indexOf(customer);
        Customer editCustomer = getInfo();
        customerRepo.edit(index,editCustomer);
    }
    public Customer getInfo(){
        String name;
        int sex;
        String dateOfBirth;
        String identifyCard;
        String numberPhone;
        String idCustomer;
        String customerType;
        String address;
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter sex:");
        System.out.println("1:Male");
        System.out.println("2:Female");
        System.out.println("3:Other");
        sex = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter born day:");
        dateOfBirth = scanner.nextLine();
        System.out.println("Enter identifyCard:");
        identifyCard = scanner.nextLine();
        System.out.println("Enter numberPhone");
        numberPhone = scanner.nextLine();
        System.out.println("Enter ID customer");
        idCustomer = scanner.nextLine();
        System.out.println("Enter customer type");
        customerType = scanner.nextLine();
        System.out.println("Enter address");
        address = scanner.nextLine();
        Customer newCustomer = new Customer(name,sex,dateOfBirth,identifyCard,numberPhone,idCustomer,customerType,address);
        return newCustomer;
    }
}
