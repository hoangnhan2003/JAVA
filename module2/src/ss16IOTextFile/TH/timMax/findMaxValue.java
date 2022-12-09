package ss16IOTextFile.TH.timMax;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class findMaxValue {
    public static List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();

        }
        catch (Exception e){
            System.out.println("file doesn't exist or content has invalid!!");
        }
        return numbers;
    }
    public static void writeFile(String filePath,int max) throws IOException {

            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Max: "+ max);
            bufferedWriter.close();

    }
    public static void main(String[] args) throws IOException {
        String filePath = "H:\\CODEGYM\\module2\\src\\ss16IOTextFile\\TH\\timMax\\number.txt";
        List<Integer> numbers = readFile(filePath);
        for (Integer x : numbers){
            System.out.println(x);
        }
        String filePath2 = "H:\\CODEGYM\\module2\\src\\ss16IOTextFile\\TH\\timMax\\result.txt";
        writeFile(filePath2,19);
    }


}
