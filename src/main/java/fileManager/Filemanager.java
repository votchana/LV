package fileManager;

import java.io.*;
import java.util.Scanner;

public class Filemanager {

    public static void main(String[] args){

        Filemanager fm = new Filemanager();
        fm.createFile("Created by Liana.txt");
        fm.writeToFile("Created by Liana.txt", "This is my first line\n" + "This is my second\n");
        fm.readFile("Created by Liana.txt");
        fm.deleteFile("Created by Liana.txt");


    }

    public void createFile(String fileName){
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String fileName, String text){
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Oops!");
            e.printStackTrace();
        }

    }

    public void readFile(String fileName){

        File file = new File(fileName);
        int i =0;
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            i++;
            String row = scanner.nextLine();
            System.out.println("Next line is: " + row + " - end of line " + i);

            }
        scanner.close();
    }

    public void deleteFile(String fileName){
        File file = new File(fileName);
        if(file.exists()){
            file.delete();
        }
    }
}
