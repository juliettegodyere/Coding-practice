package textFiles;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFiles {
    //Create files

    public static void createFile(String filePath){
        File file = new File(filePath);
        
        try  {
            if(file.createNewFile()){
                System.out.println("File created successfully ....");
            }else{
                System.out.println("File already exists ....");
            }
        } catch (IOException e) {
            System.out.println("error occured");
            e.printStackTrace();
        }
        
    }

    //Write files

    public static void writeFile(String filePath){
        try (FileWriter fw = new FileWriter(filePath)) {

            fw.write("Welcome to me first file writing tutorial");
            fw.close();
            System.out.println("File written successfully ....");
        } catch (IOException e) {
            System.out.println("error occured");
            e.printStackTrace();
        }
        
    }

    //Read files

    public static void readFile(String filePath){
        try (FileReader fr = new FileReader(filePath)) {

            Scanner myReader = new Scanner(fr);
            while(myReader.hasNext()){
               String data = myReader.nextLine();
               System.out.println(data);
            }
            fr.close();
            myReader.close();
            System.out.println("File written successfully ....");
        } catch (IOException e) {
            System.out.println("error occured reading file");
            e.printStackTrace();
        }
        
    }
    //RENAME FILE
    public static void reNameFile(String oldFileName,String newFilePath){
        File oldFile = new File(oldFileName);
        File newFile = new File(newFilePath);

        if(oldFile.renameTo(newFile)){
            System.out.println("File rename successful");
        }else{
            System.out.println("File rename unsuccessful");
        }
    }

     public static void deleteFile(String filePath){
        File file = new File(filePath);

        try {
            if(file.delete()){
                System.out.println("File delete successful");
            }else{
                System.out.println("File delete unsuccessful");
            }
        } catch (Exception e) {
             System.out.println("error occured deleting file");
        }
    }

}
