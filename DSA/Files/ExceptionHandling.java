package Files;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
// import java.io.IOException;
// import java.rmi.server.ExportException;

public class ExceptionHandling {
    public static void readFile(String filename) {
      FileReader reader = null;
      try {
         //  #1 Happy path scenario
         reader = new FileReader(filename);
         //This opens the file so you can read its contents, one character at a time.

         BufferedReader br = new BufferedReader(reader); 
         //This wraps the FileReader and adds a buffer, making reading faster and allowing you to read whole
         
         System.out.println(br.readLine()); 
         //br.readLine() - This reads one line of text from the file.
         br.close();
      }
     catch (FileNotFoundException ex){
      //  #2 Error Handling
        System.out.println("File doesn't exist! "+ ex.getMessage());
     }
     catch (Exception ex){
      System.out.println("An error occured " + ex.getMessage());
     }
      finally {
         //  #Cleanup..
         try{
            if(reader != null) {
            reader.close();
            }
         }
         catch (Exception ex) {
            //nothing it does just swallows the exception
         }
     }
   }


   public static void createFile(String filename) {
      File newfile = new File(filename);
      try{
         boolean isCreated = newfile.createNewFile();
         if(isCreated){
            System.out.println("File Created!!!");
         }
         else{
            System.out.println("File already Exist");
         }
      }catch(Exception ex){
         System.out.println("An error occured " + ex.getMessage());
      }
   }

   public static void writeContentsToFile(String filename, String content) {
      try{
         FileWriter writer = new FileWriter(filename);
         writer.write(content);
         writer.flush();
         writer.close();
      }
      catch(FileNotFoundException ex){
         System.out.println("File Doesn't exist" + ex.getLocalizedMessage());
      }
      catch (Exception ex){
         System.out.println("An error occured" + ex.getMessage());
      }
      finally {
         //System.out.println("Nothing to cleanup, Eveything is fine..");
      }
   }

   public static void deleteFile( String filename){
      try {
         File fileHandle = new File(filename);
         boolean isDeleted = fileHandle.delete();
         if(isDeleted)
            System.out.println("File Deleted Successfully..");
         else
            System.out.println("File doesn't exist or already deleted");
      }
      catch(Exception ex) {
         System.out.println("An error occured " + ex.getMessage());
      }
   }

   public static void checkAge(int age) throws Exception {
      if(age < 18)
         throw new Exception("not allowed to vote before 18years");
   }

   public static void checkEligibilityForVoting(){
      try {
         checkAge(16);
      }
      catch (Exception ex) {
         System.out.println("Error occured : " + ex.getMessage());
      }
      finally {
         System.out.println("Cleaning work done!!");
      }
   }
    public static void main(String[] args) {
      createFile("abc.txt");
      writeContentsToFile("abc.txt", "White mini");
      readFile("abc.txt");
      deleteFile("abc.txt");
      //when you use FileWriter to write to a file and the file does not exist, FileWriter will automatically create the file for you.

      checkEligibilityForVoting();
    }
}
