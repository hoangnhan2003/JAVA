package CaseStudy.ManageResort.readAndWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile <E> {
    private String path;

    public WriteFile(String path) {
        this.path = path;
    }
    public List<E> readFile(){
        List<E> result = new ArrayList<>();
        try{
            File file = new File(this.path);
            if(!file.exists()){
                throw new RuntimeException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine())!= null){
                String [] strings = line.split(",");

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
