package ss17IObinaryFile.TH.objectIn_OutPut;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamEx {
    public static void main(String[] args) throws Exception{
        List<Product1> list = new ArrayList<>();
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream("H:\\CODEGYM\\module2\\src\\ss17IObinaryFile\\TH\\objectIn_OutPut\\product.txt"));
            Product1 product = new Product1(1,"apple",10000,"limited");
            Product1 product1 = new Product1(2,"apple",20000,"limited");
            list.add(product1);
            list.add(product);
            oos.writeObject(list);
            oos.flush();
        }
        catch (Exception e){
            System.out.println("Invalid!!!");
        }
        finally {
            oos.close();
        }

    }
}
