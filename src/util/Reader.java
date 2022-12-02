package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    
    public List<String> getInput(String fileName) throws IOException {

        List<String> data = new ArrayList<String>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(fileName);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                data.add(line);
            }
        } finally {
            bufferedReader.close();
            fileReader.close();
        }



        return data;
    }
}
