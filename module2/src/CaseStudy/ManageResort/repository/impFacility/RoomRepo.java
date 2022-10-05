package CaseStudy.ManageResort.repository.impFacility;

import CaseStudy.ManageResort.model.Facility.Room;
import CaseStudy.ManageResort.model.Facility.Villa;
import CaseStudy.ManageResort.repository.IFaculity.IFaculity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoomRepo implements IFaculity<Room> {
    List<Room> data = getData();
    @Override
    public void add(Room newFaculity) {
        data.add(newFaculity);
        update();
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public List<Room> Search(float price) {
        return null;
    }

    @Override
    public void update() {
        File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\room.csv");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for(Room room : data){
                bufferedWriter.write(room.toString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Room> getData() {
        List<Room> roomList = new ArrayList<>();
        File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\room.csv");
        if(file.exists()){
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line = bufferedReader.readLine())!= null){
                    String[] data = line.split(",");
                    String service = data[0];
                    float fee = Float.parseFloat(data[1]);
                    float useArea = Float.parseFloat(data[2]);
                    int maxPerson = Integer.parseInt(data[3]);
                    String freeService = data[4];
                    Room newRoom = new Room(service,fee,useArea,maxPerson,freeService);
                    roomList.add(newRoom);
                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return roomList;
    }
    public List<Room> getAll(){
        return getData();
    }
    public void edit(int index,Room room){
        data.set(index,room);
        update();
    }

//    public static void main(String[] args) {
//        RoomRepo roomRepo = new RoomRepo();
//        roomRepo.add(new Room("VIP",1000,30,3,"Water"));
//        roomRepo.add(new Room("VIP1",1000,30,3,"Water"));
//        roomRepo.add(new Room("VIP2",1000,30,3,"Water"));
//        roomRepo.add(new Room("VIP3",1000,30,3,"Water"));
//    }
}
