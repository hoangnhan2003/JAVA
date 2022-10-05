package CaseStudy.ManageResort.repository.impFacility;

import CaseStudy.ManageResort.model.Facility.House;
import CaseStudy.ManageResort.repository.IFaculity.IFaculity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HouseRepo implements IFaculity<House> {
    private List<House> data = getData();
    @Override
    public void add(House newFaculity) {
        data.add(newFaculity);
        update();
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public List<House> Search(float price) {
        List<House> result = new ArrayList<>();
        House newHouse = new House(price);
        for(House house : data){
            if(house.equals(newHouse)){
                result.add(house);
            }
        }
        return result;
    }

    @Override
    public void update() {
        File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\house.csv");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for(House house : data){
                bufferedWriter.write(house.toString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<House> getData() {
        List<House> houseList = new ArrayList<>();
        File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\house.csv");
        if(file.exists()){
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = "";
                while((line = bufferedReader.readLine())!= null){
                    String[] data = line.split(",");
                    String service = data[0];
                    float fee = Float.parseFloat(data[1]);
                    float useArea = Float.parseFloat(data[2]);
                    int maxPerson = Integer.parseInt(data[3]);
                    int qualifiedRoom = Integer.parseInt(data[4]);
                    int numOfFloor = Integer.parseInt(data[5]);
                    House newHouse = new House(service,fee,useArea,maxPerson,qualifiedRoom,numOfFloor);
                    houseList.add(newHouse);
                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return houseList;
    }
    public List<House> getAll(){
        return getData();
    }
    public void edit(int index,House house){
        data.set(index,house);
        update();

    }

//    public static void main(String[] args) {
//        HouseRepo houseRepo = new HouseRepo();
//        houseRepo.add(new House("motel",100000,100,5,4,5));
//        houseRepo.add(new House("motel1",100000,100,5,4,5));
//        houseRepo.add(new House("motel2",100000,100,5,4,5));
//        houseRepo.add(new House("motel3",100000,100,5,4,5));
//        houseRepo.add(new House("motel4",100000,100,5,4,5));
//
//    }
}
