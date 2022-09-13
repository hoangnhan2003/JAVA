package ss16IOTextFile.BT.docFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {


    public static List<Country> readFile(String filePath){
        List<Country> result = new ArrayList<Country>();
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while((line = bufferedReader.readLine())!= null){
                String[] string = line.split(",");
                String id = string[0]; // lam id int se phat sinh loi
                String code = string[1];
                String name = string[2];
                result.add(new Country(id,code,name));
            }
        }
        catch (IOException e){
            System.out.println("Invalid!!");
        }
        return result;
    }

    public static void main(String[] args) {
        String filePath = "H:\\CODEGYM\\module2\\src\\ss16IOTextFile\\BT\\docFile\\country.csv";
        List<Country> countryList = readFile(filePath);
        for (Country country : countryList){
            System.out.println(country.toString());
        }

    }
}
