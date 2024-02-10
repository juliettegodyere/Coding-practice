import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public void readTextFile(){
    try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
        System.out.println(br.readLine());
    }catch(IOException ex){
        System.out.println(ex.getMessage());
    }
    }
}
