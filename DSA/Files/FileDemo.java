package Files;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.FileWriter;

public class FileDemo {
    public static void main(String[] args) {
        String filename = "NewFile.txt";
        createFile(filename);
        writeContentsToFile(filename, "Namaskara Karnataka");
        appendContentsToFile(filename, "Namaste Bharatha!!");
        readFilePrintToConsole(filename);
        deleteFile(filename);
    }

    public static void createFile(String filename) {
        System.out.println("Creating File.....");
        File firstFile = new File(filename);
        try{
            boolean isCreated = firstFile.createNewFile();
            if (isCreated) {
                System.out.println("New File created successfully!!");
            }
            else {
                System.out.println("File already Exists");
            }
        }
        catch(Exception e) {
            System.out.println("An error occured!!" + e);
        }
        

    }

    public static void writeContentsToFile(String filename, String content) {
        System.out.println("Writing content to file.....");
        try{
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(content + "\n");
            fileWriter.write(content + "\n");
            fileWriter.write(content + "\n");
            fileWriter.flush();
            fileWriter.close();
        }
        catch(Exception e) {
            System.out.println("An error occured" + e);
        }
        
    }

    public  static void readFilePrintToConsole(String filename) {
        System.out.println("Reading content of a file......");
        try{
           
            System.out.println("--------- printing the content of file ------");
            String content = Files.readString(Path.of(filename));
            System.out.println(content);
            System.out.println("-------------- End of the file ----------------");
            
        }
        catch(Exception e){
            System.out.println("an error occured " + e);
        }
    }


    public static void appendContentsToFile(String filename, String content) {
        System.out.println("Appending the content of a file......");
        try{
            FileWriter fileWriter = new FileWriter(filename,true);//append : boolean if {@code true}, then data will be written to the end of the file rather than the beginning.
            fileWriter.write(content);
            fileWriter.flush();
            fileWriter.close();
        }
        catch(Exception e) {
            System.out.println("An error occured" + e);
        }
    }

    public static void deleteFile(String filename) {
        System.out.println("Deleting a File.....");
        try {
            File fileHandle = new File(filename);
            fileHandle.delete();
            System.out.println("Deleted File Success");

        }
        catch (Exception e) {
            System.out.println("An error occured" + e);
        }
    }

}
