package _Bai_tap_quan_ly.util;

import _Bai_tap_quan_ly.Model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public List<String> read(String path){
        List<String> result = new ArrayList<>();
        createIsNotExists(path);

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ( (line= bufferedReader.readLine())!= null){
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result ;
    }
    public void write(String path, List<Product> products){
      createIsNotExists(path);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));) {

            for (int i = 0; i < products.size(); i++) {
                bufferedWriter.write(products.get(i).toString());
                bufferedWriter.newLine();
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void createIsNotExists(String path){
        try {
            File file = new File(path);
            if (!file.exists())
                file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
