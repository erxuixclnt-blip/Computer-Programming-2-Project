import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileInfoProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // INPUT
            System.out.print("Enter file path: ");
           
            String path = scanner.nextLine();
            
            File file = new File(path);
        
            System.out.println("Checking path: " + file.getAbsolutePath());

            // CHECK IF EXISTS
            if (file.exists()) {

                System.out.println("\n=== FILE INFORMATION ===");

                // ABSOLUTE PATH
                System.out.println("Absolute Path: " + file.getAbsolutePath());

                // FILE NAME
                System.out.println("File Name: " + file.getName());

                // PARENT DIRECTORY
                System.out.println("Parent Directory: " + file.getParent());

                // FILE SIZE
                System.out.println("File Size: " + file.length() + " bytes");

                // LAST MODIFIED
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date(file.lastModified());
                System.out.println("Last Modified: " + sdf.format(date));

            } else {
                System.out.println("\nFile does NOT exist. Please check the path.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
