package org.example.topik6;

import java.io.*;

public class task1_9 {
    public static void main(String[] args) {

        String text = "The quick brown fox jumped over the moon.As he leapt," +
                " he looked back over his shoulder and cried aloud, Hello World!";

        task1_9 task = new task1_9();
        task.writeToFile(text);
        task.readFromFile("My Poem.txt");
    }

    void writeToFile(String s){

        try(FileWriter writer = new FileWriter("My Poem.txt", false))
        {
            String text = s;
            writer.write(text);
            writer.flush();
            System.out.println("Success!");
        }
        catch(IOException ex){

            System.out.println( "Unable to write to the file at this time " + ex.getMessage());
        }
    }

    void readFromFile(String fileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("‘The contents of the text file have been successfully read!’");
        } catch (IOException e) {
            System.out.println("Unable to read from the file at this time.");
            throw new RuntimeException(e);
        }
    }
}
