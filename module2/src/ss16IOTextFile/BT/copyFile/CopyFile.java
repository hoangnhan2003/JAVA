package ss16IOTextFile.BT.copyFile;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void copyFile(String inputLink,String outputLink){
        try{
            File inputFile = new File(inputLink);
            FileWriter outputFile = new FileWriter(outputLink);
            if(!inputFile.exists() ){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bufferedWriter = new BufferedWriter(outputFile);
            String line = "";
            while ((line = bufferedReader.readLine())!= null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        }
        catch (IOException e){
            System.out.println("Invalid!!!");
        }

    }

    public static void main(String[] args) {
        String inputFile = "H:\\CODEGYM\\module2\\src\\ss16IOTextFile\\BT\\copyFile\\input.txt";
        String outputFile = "H:\\CODEGYM\\module2\\src\\ss16IOTextFile\\BT\\copyFile\\output.txt";
        copyFile(inputFile,outputFile);
    }
}
