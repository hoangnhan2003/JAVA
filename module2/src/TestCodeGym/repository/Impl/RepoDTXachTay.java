package TestCodeGym.repository.Impl;

import TestCodeGym.model.DTChinhHang;
import TestCodeGym.model.DTXachTay;
import TestCodeGym.repository.IPhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepoDTXachTay implements IPhone<DTXachTay> {
    List<DTXachTay> data = getData();
    @Override
    public void add(DTXachTay phone) {
        data.add(phone);
        update();
    }

    @Override
    public void deletePhone(int id) {
        Scanner scanner = new Scanner(System.in);
        DTXachTay dtXachTay = new DTXachTay(id);
        int index = data.indexOf(dtXachTay);
        if(index!=-1){
            int select;
            System.out.println("Confirm delete");
            System.out.println("1:YES");
            System.out.println("2:NO");
            select = Integer.parseInt(scanner.nextLine());
            if(select==1){
                data.remove(index);
                this.update();
            }

        }
    }

    @Override
    public int search(int id) {
        DTXachTay dtXachTay = new DTXachTay(id);
        return data.indexOf(dtXachTay);
    }

    @Override
    public int search(String namePhone) {
        DTXachTay dtXachTay = new DTXachTay(namePhone);
        return data.indexOf(dtXachTay);
    }

    @Override
    public List<DTXachTay> getData() {
        List<DTXachTay> result = new ArrayList<>();
        File file = new File("H:\\CODEGYM\\module2\\src\\TestCodeGym\\repository\\data\\DTXachTay.csv");
        if(file.exists()){
            try{
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = "";
                while((line = bufferedReader.readLine())!= null){
                    String[] strings = line.split(",");
                    String numberPhone = strings[1];
                    float price = Float.parseFloat(strings[2]);
                    int amount = Integer.parseInt(strings[3]);
                    String manuFactor = strings[4];
                    String nature = strings[5];
                    String status = strings[6];
                    DTXachTay newPhone = new DTXachTay(numberPhone,price,amount,manuFactor,nature,status);
                    result.add(newPhone);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }

    @Override
    public void update() {
        File file = new File("H:\\CODEGYM\\module2\\src\\TestCodeGym\\repository\\data\\DTXachTay.csv");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for(DTXachTay dtXachTay : data){
                bufferedWriter.write(dtXachTay.convertToString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        RepoDTXachTay repoDTXachTay = new RepoDTXachTay();
        repoDTXachTay.add(new DTXachTay("Iphone",1000,100,"Viet Nam","Viet Nam","new"));
        repoDTXachTay.add(new DTXachTay("Iphone",1000,100,"Viet Nam","Viet Nam","new"));
        repoDTXachTay.add(new DTXachTay("Iphone",1000,100,"Viet Nam","Viet Nam","new"));
        repoDTXachTay.add(new DTXachTay("Iphone",1000,100,"Viet Nam","Viet Nam","new"));
        repoDTXachTay.deletePhone(3);
    }
}
