package IO;

import Model.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReaderAndWriteProduct {
    public void write(List<Product> products){
        File file = new File("product.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product p:products){
                 bufferedWriter.write(p.write());
                 bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
