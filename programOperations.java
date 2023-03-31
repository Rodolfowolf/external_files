import java.io.*;
import java.util.Date;

/*
 * Assignment 10 External files
 * @author Rodolfo Carvalho 200536943
 * @date March 28, 2023
 * @time 03:20pm
 */
public class programOperations {
    public static void main(String[] args) {
        Date date = new Date();
        // This block will create the new external file
        File newObj = new File(
                "//Users//rodolfosilva//Documents//Programming fundamentals//28-03-23//Assignment10//newfile.txt");
        try {
            if (newObj.createNewFile()) {
                System.out.println("File " + newObj.getName() + " Created in " + date);
            } else {
                System.out.println("File doesn't created");
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        // This block will update the new file created.
        System.out.println("******************************");
        try {
            FileWriter wrObj = new FileWriter(
                    "//Users//rodolfosilva//Documents//Programming fundamentals//28-03-23//Assignment10//newfile.txt");
            wrObj.write("We can write everything that we can, this update was in " + date);
            System.out.println("File " + newObj.getName() + " updated");
            wrObj.close();
        } catch (Exception e) {
            System.out.println("File writer exception: " + e);
        }
        // This block will whow us the content found in our file.
        System.out.println("******************************");
        try {
            FileReader reObj = new FileReader(
                    "//Users//rodolfosilva//Documents//Programming fundamentals//28-03-23//Assignment10//newfile.txt");
            int cont;
            while ((cont = reObj.read()) != -1) {
                System.out.print((char) cont);
            }
            System.out.println("");
            reObj.close();

        } catch (Exception e) {
            System.out.println("Read exception: " + e);
        }
        // this blok will show us some properties about our file, than after will
        // remove.
        System.out.println("******************************");
        File inObj = new File(
                "//Users//rodolfosilva//Documents//Programming fundamentals//28-03-23//Assignment10//newfile.txt");
        if (inObj.exists()) {
            System.out.println("Name: " + inObj.getName());
            System.out.println("Located in: " + inObj.getPath());
            System.out.println("Size: " + inObj.length());
            System.out.println("Can be written: " + inObj.canWrite());
            System.out.println("Can be read: " + inObj.canRead());
            System.out.println("Removing file " + inObj.getPath());
            System.out.println("Removing ... " + inObj.delete());
        } else {
            System.out.println("File doesn't found");
        }
        System.out.println("****************ALL DONE********************");

    }
}