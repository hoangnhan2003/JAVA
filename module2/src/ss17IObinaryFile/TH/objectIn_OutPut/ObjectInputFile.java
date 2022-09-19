package ss17IObinaryFile.TH.objectIn_OutPut;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputFile {


    public static void main(String[] args) throws Exception{
        ObjectInputStream ois= null;
        try{
            ois = new ObjectInputStream(new FileInputStream("H:\\CODEGYM\\module2\\src\\ss17IObinaryFile\\TH\\objectIn_OutPut\\product.txt") );
            List<Product1> product = (List<Product1>) ois.readObject();
            System.out.println(product.toString());
            ois.close();
        }
        catch (IOException e){
            System.out.println("Invalid!!");
        }
        finally {
            System.out.println("Finished");
        }
    }

}
