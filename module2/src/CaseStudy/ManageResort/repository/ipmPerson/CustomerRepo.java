package CaseStudy.ManageResort.repository.ipmPerson;

import CaseStudy.ManageResort.model.people.Customer;
import CaseStudy.ManageResort.repository.IPerson.IPerson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements IPerson<Customer> {
    public List<Customer>getData(){
        List<Customer> customerList = new ArrayList<>();
        try{
            File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\customer.csv");
            if(file.exists()){
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = "";
                while ((line = bufferedReader.readLine())!= null){
                    String[] strings = line.split(",");
                    String name = strings[0];
                    int sex = Integer.parseInt(strings[1]);
                    String dateOfBirth = strings[2];
                    String identifyCard= strings[3];
                    String numberPhone = strings[4];
                    String idCustomer = strings[5];
                    String customerType= strings[6];
                    String address = strings[7];
                    Customer newCustomer = new Customer(name,sex,dateOfBirth,identifyCard,numberPhone,idCustomer,customerType,address);
                    customerList.add(newCustomer);

            }
                bufferedReader.close();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return customerList;

    }
    List<Customer> data = getData();
    public void update(){

        try{
            File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\customer.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Customer customer : data){
                bufferedWriter.write(customer.toString());
                bufferedWriter.write("\n");
            }

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void add(Customer person) {
        data.add(person);
        update();
    }
    public int getIndex(Customer customer){
        return data.indexOf(customer);
    }

    @Override
    public void delete(Customer person) {

    }

    @Override
    public int search(int id) {
        return 0;
    }

    @Override
    public List<Customer> getAll() {
        return getData();
    }
    public void edit(int index,Customer customer){
        data.set(index,customer);
        update();
    }

//    public static void main(String[] args) {
//        CustomerRepo customerRepo = new CustomerRepo();
//        customerRepo.add(new Customer("Nhan",1,"22/05/2022","10221231","091922312","1122","VIP","Quang Binh"));
//        customerRepo.add(new Customer("Nhan1",1,"22/05/2022","10221231","091922312","1122","VIP","Quang Binh"));
//        customerRepo.add(new Customer("Nhan2",1,"22/05/2022","10221231","091922312","1122","VIP","Quang Binh"));
//        customerRepo.add(new Customer("Nhan3",1,"22/05/2022","10221231","091922312","1122","VIP","Quang Binh"));
//    }
}
