package day02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader extends util.Reader {
    
    public List<Strategy> getStrategyInput(String fileName) throws IOException {

        List<String> input = super.getInput(fileName);
        List<Strategy> plays = new ArrayList<Strategy>();
        for (String data : input) {
            String[] items = data.split(" ");
            plays.add(new Strategy(items[0], items[1]));
        }
        return plays;
        
    }
}
