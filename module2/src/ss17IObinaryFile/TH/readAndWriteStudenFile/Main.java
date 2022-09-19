package ss17IObinaryFile.TH.readAndWriteStudenFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students){
        try{
           FileOutputStream fos = new FileOutputStream(path);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(students);
           oos.close();
           fos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Ngo","QuangBinh"));
        students.add(new Student(2,"Ngo","QuangBinh"));
        students.add(new Student(3,"Ngo","QuangBinh"));
        students.add(new Student(4,"Ngo","QuangBinh"));
        students.add(new Student(5,"Ngo","QuangBinh"));
        String filePath = "H:\\CODEGYM\\module2\\src\\ss17IObinaryFile\\TH\\readAndWriteStudenFile\\data.txt";
        writeToFile(filePath,students);
    }
}
