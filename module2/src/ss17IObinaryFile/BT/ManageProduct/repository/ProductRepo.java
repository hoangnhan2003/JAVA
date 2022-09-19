package ss17IObinaryFile.BT.ManageProduct.repository;
import ss17IObinaryFile.BT.ManageProduct.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    public List<Product> data(){
        List<Product> result = new ArrayList<>();
        File file1 = new File("H:\\CODEGYM\\module2\\src\\ss17IObinaryFile\\BT\\ManageProduct\\repository\\data.txt");
        if(file1.exists()){
            ObjectInputStream oif ;
            try{
                File file = new File("H:\\CODEGYM\\module2\\src\\ss17IObinaryFile\\BT\\ManageProduct\\repository\\data.txt");
                InputStream inputStream = new FileInputStream(file);
                oif = new ObjectInputStream(inputStream);
                //            oif.readObject();
                result = (List<Product>) oif.readObject();
                oif.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }


        return result;
    }
    private List<Product> repository = data();
    public void addProduct(Product newProduct){
        repository.add(newProduct);
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream("H:\\CODEGYM\\module2\\src\\ss17IObinaryFile\\BT\\ManageProduct\\repository\\data.txt"));
            oos.writeObject(repository);
            oos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Product> getAll(){
        return data();
    }
    public void search(int id){
        int index = repository.indexOf(new Product(id));
        if(index!=-1){
            System.out.println(repository.get(index).toString()+"\n");
        }
        else{
            System.out.println("Not found!!!");
        }
    }


}
