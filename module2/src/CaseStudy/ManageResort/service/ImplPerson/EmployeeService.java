package CaseStudy.ManageResort.service.ImplPerson;

import CaseStudy.ManageResort.model.people.Customer;
import CaseStudy.ManageResort.model.people.Employee;
import CaseStudy.ManageResort.repository.ipmPerson.EmployeeRepo;
import CaseStudy.ManageResort.service.IPerson.IPerson;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IPerson {
    Scanner scanner = new Scanner(System.in);
    EmployeeRepo employeeRepo = new EmployeeRepo();

    @Override
    public void displayListPerson() {
        List<Employee> employeeList = employeeRepo.getData();
        for(Employee employee : employeeList){
            System.out.println(employee.display());
        }
    }

    @Override
    public void addNewPerson() {
        Employee newEmployee = getInfo();
        employeeRepo.add(newEmployee);
    }

    @Override
    public void editPerson() {
        List<Employee> employeeList = employeeRepo.getAll();
        String nameService;
        System.out.println("Enter name service you want to edit");
        nameService = scanner.nextLine();
        Employee employee = new Employee(nameService);
        int index = employeeList.indexOf(employee);
        if(index !=-1){
            Employee employeeEdit = getInfo();
            employeeRepo.edit(index,employeeEdit);
        }

    }
    public Employee getInfo(){
        String name;
        int sex;
        String dateOfBirth;
        String identifyCard;
        String numberPhone;
        String employeeCode;
        String academicLevel;
        String jobPos;
         float salary;
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
        System.out.println("Enter Employee code");
        employeeCode = scanner.nextLine();
        System.out.println("Enter academic level:");
        academicLevel = scanner.nextLine();
        System.out.println("Enter job position:");
        jobPos = scanner.nextLine();
        System.out.println("Enter salary:");
        salary = Float.parseFloat(scanner.nextLine());
        Employee newEmployee = new Employee(name,sex,dateOfBirth,identifyCard,numberPhone,employeeCode,academicLevel,jobPos,salary);
        return newEmployee;
    }
}
