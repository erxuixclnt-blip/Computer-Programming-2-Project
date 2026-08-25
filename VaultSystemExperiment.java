public class Main { 
    public static void main(String[] args) { 
        int year = 2000;
        System.out.println("The Year is: " + year);
        
        float money = 600.00f;
        System.out.println("Money: ₱" + money);
        
        char grade = 'A';
        System.out.println("A is the highest score: " + grade);
        
        double temperature = 100.6;
        System.out.println("The Number Of Temperature is: " + temperature);
        
        for(int i = 2; i <= 6; i++) { 
            System.out.println("Vault unlocked " + i);
            
            int attempt = 0;
            while(attempt < 3) { 
                System.out.println("try " + (attempt+1));
                attempt++;
                
                int choice = 0; 
                do {
                    System.out.println("1. Save 2. Read 3. Exit");      
                } while(choice != 3); 
                
            } 
            
        } 
        
    } 
    
} 

import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        int year = 2000;
        System.out.println("The Year is: " + year);
        float money = 600.00f;
        System.out.println("Money: ₱" + money);
        char grade = 'A';
        System.out.println("A is the highest score: " + grade);
        double temperature = 100.6;
        System.out.println("The Number Of Temperature is: " + temperature);
        
        int choice = 0; 
        
        for(int i = 2; i <= 6; i++) { 
            System.out.println("Vault unlocked " + i);
            
            int attempt = 0;
            while(attempt < 3) { 
                System.out.println("try " + (attempt+1));
                attempt++;
                
                do {
                    System.out.println("1. Save 2. Read 3. Exit");
                    System.out.print("Vault unlocked : ");
                    choice = sc.nextInt();  
                    
                } while(choice != 3); 
                
            } 
            
        } 
        
        sc.close(); 
        
    } 
    	
} 


import java.util.Scanner;

public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        
        int year = 2000;
        System.out.println("The Year is: " + year);
        float money = 600.00f;
        System.out.println("Money: ₱" + money);
        char grade = 'A';
        System.out.println("A is the highest score: " + grade);
        double temperature = 100.6;
        System.out.println("The Number Of Temperature is: " + temperature);
        
        int choice = 0;
        
        for(int i = 1; i <= 6; i++) { 
            System.out.println("\nVault unlocked " + i);
            
            int attempt = 0;
            while(attempt < 3) { 
                System.out.println("try " + (attempt+1));
                attempt++;
                
                do {
                    System.out.println("1. Save 2. Read 3. Exit");
                    System.out.print("Vault unlocked : ");
                    choice = sc.nextInt();
                    
                    
                    if(choice == 1) {
                        System.out.println("Saving...");
                    } else if(choice == 2) {
                        System.out.println("Reading...");
                    }
                    
                } while(choice != 3);  
                
                System.out.println(" closed "); 
                
            } 
            
        } 
        
        System.out.println("\nAll Vaults locked "); 
        sc.close();
        
    } 
}

____________________________________________________

ONE FILE PROGRAM 
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
       
        int year = 2000;
        System.out.println("The Year is: " + year);
        
        float money = 600.00f;
        System.out.println("Money: ₱" + money);
        
        char grade = 'A';
        System.out.println("A is the highest score: " + grade);
        
        double temperature = 100.6;
        System.out.println("The Number Of Temperature is: " + temperature);
        
        System.out.println("\n=== VAULT SYSTEM ONLINE ==="); 
        
        int choice = 0; 
      
          for(int i = 1; i <= 6; i++) { 
            System.out.println("\nVault locked " + i);
            
            int attempt = 0;
            
            
            while(attempt < 3) { 
                System.out.println(" Locked " + (attempt+1));
                attempt++;
                
                
                do {
                    System.out.println("1. Save 2. Read 3. Exit");
                    System.out.print("Vault unlocked : ");
                    choice = sc.nextInt();
                    
                    
                    if(choice == 1) {
                        System.out.println("Saving...");
                    } else if(choice == 2) {
                        System.out.println("Reading...");
                    } else if(choice == 3) {
                        System.out.println("Exiting...");
                    } else {
                        System.out.println("Invalid ");
                    }
                    
                } while(choice != 3); 
             
                   if(choice == 3) {
                    System.out.println("\nAll Vaults locked ");
                  
                      sc.close(); 
                    return; 
                }
                
            } 
            
        } 
        
        
        System.out.println("\nAll Vaults locked ");
        sc.close();
        
    } 
    
} 


