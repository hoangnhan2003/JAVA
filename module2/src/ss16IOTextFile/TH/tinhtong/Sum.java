package ss16IOTextFile.TH.tinhtong;

import java.io.*;
import java.util.Scanner;

public class Sum {
    public void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            int sum =0;
            while((line = br.readLine())!= null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum = "+ sum);
        }
        catch (Exception e){
            System.out.println("the file does not exits or contents has error!!");
        }
    }

    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
//        String filePath = "src\\ss16IOTextFile\\TH\\tinhtong\\number.txt";
//        readFileText(filePath);
            System.out.println("Input file link");
            String link ;
            link = scanner.nextLine();
            Sum sum = new Sum();
            sum.readFileText(link);

        }


    }
}
