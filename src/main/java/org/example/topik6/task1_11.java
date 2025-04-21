package org.example.topik6;

import java.io.*;
import java.util.*;

public class task1_11 {
    public static void main(String[] args) {

        int [] sales = {10, 20, 35, 56, 24, 12, 45, 1, 80, 43, 23, 45};
//        List<int[]> salesList = Arrays.asList(sales);
        List list = new ArrayList();

        for (Object o : sales) {
            list.add(o);
        }

        File salesFile = new File("Sales.txt");

          task1_11 t = new task1_11();

          t.printList(list);

        t.writeToFile(salesFile, list);
        String data = t.readFromFile(String.valueOf(salesFile));
        System.out.println(data);
    }

    void writeToFile(File file, List list){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Object item : list) {
                writer.write((Integer) item);
                writer.newLine();
            }
            System.out.println("Written to file was success.");
        } catch (IOException e) {
            System.out.println(" Writing was fail: " + e.getMessage());
        }
    }

    String readFromFile(String fileName){
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;

            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                result.append(line);
            }
            System.out.println("‘The contents of the text file have been successfully read!’");
        } catch (IOException e) {
            System.out.println("Unable to read from the file at this time.");
            throw new RuntimeException(e);
        }
        return result.toString();
    }

    void printList(List list){
        for (Object item : list) {
            System.out.print(item + " ");
        }
    }

}
