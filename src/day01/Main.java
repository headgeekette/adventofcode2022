package day01;

import java.io.IOException;

import util.Elf;
import util.Reader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Reader reader = new Reader();
        List<String> input = null;
        try {
            input = reader.getInput("src/day01/input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Integer currentElf = 1;
        Integer currentElfTotal = 0;
        List<Elf> elfList = new ArrayList<Elf>();

        for (String data : input) {
            if (data.isEmpty() || data.isBlank()) {
                elfList.add(new Elf(currentElf, currentElfTotal));
                currentElf++;
                currentElfTotal = 0;
           } else {
                currentElfTotal += Integer.parseInt(data);
            }
        }

        Collections.sort(elfList);

        System.out.println("--- Part 1 ---");
        System.out.println("elf : " + elfList.get(elfList.size() - 1).getId());
        System.out.println("total : " + elfList.get(elfList.size() - 1).getTotal());

        System.out.println("--- Part 1 ---");
        Integer top3Total = elfList.get(elfList.size() - 1).getTotal() + 
        elfList.get(elfList.size() - 2).getTotal() +
        elfList.get(elfList.size() - 3).getTotal(); 
        System.out.println("top 3 total : " + top3Total);
    }
}