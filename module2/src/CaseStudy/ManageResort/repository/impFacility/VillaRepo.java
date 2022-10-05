package CaseStudy.ManageResort.repository.impFacility;

import CaseStudy.ManageResort.model.Facility.Villa;
import CaseStudy.ManageResort.repository.IFaculity.IFaculity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VillaRepo implements IFaculity<Villa> {
    List<Villa> data = getData();
    @Override
    public void add(Villa newFaculity) {
        data.add(newFaculity);
        update();
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public List<Villa> Search(float price) {
        return null;
    }

    @Override
    public void update() {
        File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\villa.csv");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for(Villa villa : data){
                bufferedWriter.write(villa.toString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Villa> getData() {
        List<Villa> villaList = new ArrayList<>();
        File file = new File("H:\\CODEGYM\\module2\\src\\CaseStudy\\ManageResort\\repository\\database\\villa.csv");
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
                    int qualifiedRoom = Integer.parseInt(data[4]);
                    float poolArea = Float.parseFloat(data[5]);
                    Villa newVilla = new Villa(service,fee,useArea,maxPerson,qualifiedRoom,poolArea);
                    villaList.add(newVilla);
                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return villaList;
    }
    public List<Villa> getAll(){
        return getData();
    }
    public int getIndex(Villa villa){
        return data.indexOf(villa);
    }
    public void edit(int index,Villa villa){
        data.set(index,villa);
        update();
    }

//    public static void main(String[] args) {
//        VillaRepo villaRepo = new VillaRepo();
//        villaRepo.add(new Villa("nothing",1000,5,5,4,35));
//        villaRepo.add(new Villa("nothing1",1000,5,5,4,35));
//        villaRepo.add(new Villa("nothing2",1000,5,5,4,35));
//        villaRepo.add(new Villa("nothing3",1000,5,5,4,35));
//
//        Villa editVilla = new Villa("nothing3",3000,8,7,4,35);
//        Villa newVilla = new Villa("nothing3");
//        int index = villaRepo.getIndex(newVilla);
//        System.out.println("Index : "+ index);
//        villaRepo.edit(index,editVilla);
//    }
}
