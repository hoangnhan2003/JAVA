package CaseStudy.ManageResort.repository.ipmPerson;

import CaseStudy.ManageResort.model.people.Employee;
import CaseStudy.ManageResort.repository.IPerson.IPerson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo  implements IPerson<Employee> {

    public List<Employee> getData(){
        List<Employee> employeeList = new ArrayList<>();
        File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\employee.csv");
        if(file.exists()){
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line = bufferedReader.readLine())!= null){
                    String[] strings = line.split(",");
                    String name = strings[0];
                    int sex = Integer.parseInt(strings[1]);
                    String dateOfBirth = strings[2];
                    String identifyCard= strings[3];
                    String numberPhone = strings[4];
                    String employeeCode = strings[5];
                    String academicLevel = strings[6];
                    String jobPos = strings[7];
                    float salary = Float.parseFloat(strings[8]);
                    Employee newEmployee = new Employee(name,sex,dateOfBirth,identifyCard,numberPhone,employeeCode,academicLevel,jobPos,salary);
                    employeeList.add(newEmployee);
                }
                bufferedReader.close();
            }
            catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return employeeList;
        }



    List<Employee> data = getData();
    public void update() {
        ObjectOutputStream oos = null;
        try {
            File f = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\employee.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f));
            for(Employee employee : data){
                bufferedWriter.write(employee.toString());
            }
            bufferedWriter.close();
        }
        catch (EOFException e){
            System.out.println("Error!!!");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public void add(Employee person) {
        data.add(person);
        update();
    }

    @Override
    public void delete(Employee person) {

    }

    @Override
    public int search(int id) {
        return 0;
    }
    public void edit(int index,Employee employee){
        data.set(index,employee);
        update();
    }
    public int indexOf(Employee employee){
        return data.indexOf(employee);
    }

    @Override
    public List<Employee> getAll() {
        return getData();
    }

    public static void main(String[] args) {
        EmployeeRepo employeeRepo = new EmployeeRepo();
        employeeRepo.add(new Employee("Nhan",1,"22/05/2003","102201132","091232423","11111","university","intership",10000));
        employeeRepo.add(new Employee("Nhan1",1,"22/05/2003","102201132","091232423","11111","university","intership",10000));
        employeeRepo.add(new Employee("Nhan2",1,"22/05/2003","102201132","091232423","11111","university","intership",10000));
    }
}
