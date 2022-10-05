package CaseStudy.ManageResort.model.Facility;

import CaseStudy.ManageResort.model.Facility.AbsUnit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class House extends AbsUnit {
    private int qualifiedRoom;
    private int NumOfFloor;

    public House(String service, float fee, float useArea, int maxPerson, int qualifiedRoom, int numOfFloor) {
        super(service, fee, useArea, maxPerson);
        this.qualifiedRoom = qualifiedRoom;
        NumOfFloor = numOfFloor;
    }

    public House(float fee) {
        super(fee);
    }

    public int getQualifiedRoom() {
        return qualifiedRoom;
    }

    public void setQualifiedRoom(int qualifiedRoom) {
        this.qualifiedRoom = qualifiedRoom;
    }

    public int getNumOfFloor() {
        return NumOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        NumOfFloor = numOfFloor;
    }

    @Override
    public String toString() {
        return  super.getService() +','+
                super.getFee() +","+
                super.getUseArea() +','+
                super.getMaxPerson() +','+
                qualifiedRoom +','+
                NumOfFloor +','+'\n';

    }

    public String display(){
        return "House{" +
                "service='" + getService()  +
                ", fee=" + getFee() +
                ", useArea=" + getUseArea() +
                ", maxPerson=" + getMaxPerson() +" ,"+
                "qualifiedRoom=" + qualifiedRoom +
                ", NumOfFloor=" + NumOfFloor +
                '}';
    }
//    public List<House> data()  {
//        List<House> result = new ArrayList<>();
//        File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\houseList.txt");
//        BufferedReader bufferedReader = null;
//        if(!file.exists()){
//            throw new RuntimeException();
//        }
//        try {
//            bufferedReader = new BufferedReader(new FileReader(file));
//            String line = "";
//            while((line = bufferedReader.readLine())!= null){
//                String [] data = line.split(",");
//                String service = data[0];
//                float fee = Float.parseFloat(data[1]);
//                float useArea = Float.parseFloat(data[2]);
//                int maxPeople = Integer.parseInt(data[3]);
//                int qualify = Integer.parseInt(data[4]);
//                int numberOfFloor = Integer.parseInt(data[5]);
//                result.add(new House(service,fee,useArea,maxPeople,qualify,numberOfFloor));
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            try {
//                bufferedReader.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//
//        return result;
//    }
}
