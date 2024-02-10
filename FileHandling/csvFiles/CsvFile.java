package csvFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CsvFile {
    
    public static void createCsv(){

        //Get the current location of your project System.getProperty("user.dir")
        String csvFileName = System.getProperty("user.dir") + "/FileHandling/csvFiles/example.csv";

        try (//File writer class
        FileWriter fw = new FileWriter(csvFileName)) {

            fw.append("Name, Age, Email \n");
            fw.append("John, 30, john@gmail.com \n");
            fw.append("Grace, 10, grace@gmail.com \n");
            fw.append("Nil, 50, nil@gmail.com \n");
            fw.append("Bless, 5, bless@gmail.com \n");
            fw.close();
            System.out.println("CSV file created");
        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
        
    }
    //First Approach using Scanner class
    public static void readCsv(){
        String csvFileName = System.getProperty("user.dir") + "/FileHandling/csvFiles/example.csv";

        File file = new File(csvFileName);

       try (Scanner scanner = new Scanner(file)) {
            scanner.useDelimiter(",");
            while(scanner.hasNext()){
                System.out.println(scanner.next()+"\t");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
             System.out.println("Error occurred");
            e.printStackTrace();
        }
        
    }

    //Second Approach using Java Split method
    public static void readCsv2() throws IOException{
        String csvFileName = System.getProperty("user.dir") + "/FileHandling/csvFiles/example.csv";

       try (FileReader fr = new FileReader(csvFileName)) {
           BufferedReader bfr = new BufferedReader(fr);
           String line;
           while((line = bfr.readLine()) != null){
            String data[] = line.split(",");
            for(String value: data){
                System.out.print(value + "\t");
            }
            System.out.println();
           }
           bfr.close();
           fr.close();
        } catch (FileNotFoundException e) {
             System.out.println("Error occurred");
            e.printStackTrace();
        }
        
    }
}
