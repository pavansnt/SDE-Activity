package Files;
import java.io.File;
public class FileDemo {
    public static void main(String[] args) {
        File firstFile = new File("FirstFile.txt");
        try{
            boolean isCreated = firstFile.createNewFile();
            if(isCreated)
                System.out.println("File Created successfully..!!");
            else
                System.out.println("File Already Exists");

        }
        catch(Exception e) {
            System.out.println("An error occured");
        }
    }
}
