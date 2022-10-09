package TestCodeGym.repository.Impl;

import TestCodeGym.model.DTChinhHang;
import TestCodeGym.repository.IPhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepoDTChinhHang implements IPhone<DTChinhHang> {
    List<DTChinhHang> data = getData();
    @Override
    public void add(DTChinhHang phone) {
        data.add(phone);
        update();
    }

    @Override
    public void deletePhone(int id) {
        Scanner scanner = new Scanner(System.in);
        DTChinhHang dtChinhHang = new DTChinhHang(id);
        int index = data.indexOf(dtChinhHang);
        if(index != -1){
            int select;
            System.out.println("Confirm delete");
            System.out.println("1:YES");
            System.out.println("2:NO");
            select = Integer.parseInt(scanner.nextLine());
            if(select == 1){
                data.remove(index);
                this.update();
            }

        }

    }

    @Override
    public int search(int id) {
        DTChinhHang dtChinhHang = new DTChinhHang(id);

        return data.indexOf(dtChinhHang);
    }

    @Override
    public int search(String namePhone) {
        DTChinhHang dtChinhHang = new DTChinhHang(namePhone);
        return data.indexOf(dtChinhHang);
    }

    @Override
    public List<DTChinhHang> getData() {
        List<DTChinhHang> result = new ArrayList<>();
        File file = new File("H:\\CODEGYM\\module2\\src\\TestCodeGym\\repository\\data\\DTChinhHang.csv");
        if(file.exists()){
            try{
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = "";
                while((line = bufferedReader.readLine())!= null){
                    String[] strings = line.split(",");
                    String namePhone = strings[1];
                    float price = Float.parseFloat(strings[2]);
                    int amount = Integer.parseInt(strings[3]);
                    String manuFactor = strings[4];
                    int tgianBaoHanh = Integer.parseInt(strings[5]);
                    String phamViBaoHanh = strings[6];
                    DTChinhHang newPhone = new DTChinhHang(namePhone,price,amount,manuFactor,tgianBaoHanh,phamViBaoHanh);
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
        File file = new File("H:\\CODEGYM\\module2\\src\\TestCodeGym\\repository\\data\\DTChinhHang.csv");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for(DTChinhHang dtChinhHang : data){
                bufferedWriter.write(dtChinhHang.convertToString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        RepoDTChinhHang repoDTChinhHang = new RepoDTChinhHang();
        repoDTChinhHang.add(new DTChinhHang("Iphone",1000,100,"Viet Nam",760,"Toan Quoc"));
        repoDTChinhHang.add(new DTChinhHang("Iphone",1000,100,"Viet Nam",760,"Toan Quoc"));

    }
}
