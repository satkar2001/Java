import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class WritingFiles{

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("Files/SomeText.txt");

        try(  
            BufferedWriter writer1 = Files.newBufferedWriter(path);
            BufferedWriter writer2 = new BufferedWriter(writer1);
            PrintWriter pW = new PrintWriter(writer2);
        ){
        writer1.write("Hello World");      
    
        pW.printf("\n I = %d\n", 10);

    }catch(IOException ioe){
        ioe.printStackTrace();
    }
    System.out.println("Done");
    }
}