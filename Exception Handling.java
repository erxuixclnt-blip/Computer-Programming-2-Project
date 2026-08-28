Error Version
import java.util.Scanner;

public class InputMismatchError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();  i
        System.out.println("You entered: " + num);

        sc.close();
    }
}


Fixed Version
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Please enter a number: ");
                num = sc.nextInt(); 
                valid = true; 
            } catch (InputMismatchException e) {
                System.out.println("Oops! That’s not a number. Please try again!");
                sc.nextLine();
            }
        }

        System.out.println("You entered: " + num);
        sc.close();
    }
}

Error Version
public class ArrayError {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        // Error: index 5 does not exist
        System.out.println(numbers[5]);
    }
}
Fixed Version
public class ArrayFixed {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        int index = 5;

        if (index >= 0 && index < numbers.length) {
            System.out.println(numbers[index]);
        } else {
            System.out.println("Good Boy!");
        }
    }
}
Error Version
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
         
            reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            String line = reader.readLine();
            System.out.println("First line: " + line);

        } catch (IOException e) {
           
            e.printStackTrace();
        } finally {
            
            if (reader!= null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    System.out.println("Oops! Could not close the reader.");
                    ex.printStackTrace();
                }
            }
        }
    }
}

Fixed Version

import java.io.*;

public class IOExceptionFixed {
    public static void main(String[] args) {
        String fileName = "mytestfile.txt";

        // Step 1: Create and write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello! This file was created successfully.");
            System.out.println("Step 1: File created successfully!");
        } catch (IOException e) {
            System.out.println("Oops! We couldn't create the file.");
            e.printStackTrace();
        }

  
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            System.out.println("Step 2: Time to read the file...");
            System.out.println("Content found: " + line);
        } catch (IOException e) {
            System.out.println("oh no! We couldn't find or read the file.");
            e.printStackTrace();
        }

   
        System.out.println("All done! Program finished successfully!");
    }
}

Error Version
public class RuntimeError {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        int result = numerator / denominator;
        System.out.println("Result: " + result);
    }
}

Fixed Version
public class RuntimeFixed {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            if (denominator == 0) {
                throw new ArithmeticException("Oops! You can't divide by zero!");
            }
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("The program keeps running");
    }
}
Error Version
import java.util.Scanner;

public class NoSuchElementError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");

        int number = scanner.nextInt();

        System.out.println("You entered: " + number);

        scanner.close();
    }
}

Fixed Version
import java.util.Scanner;
import java.util.NoSuchElementException;

public class NoSuchElementFixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please enter a number:");

            int number = sc.nextInt();

            System.out.println("You entered: " + number);
        } catch (NoSuchElementException e) {
            System.out.println("Oops! It looks like you didn't provide any input.");
            e.printStackTrace();
        } finally {
            sc.close();
            System.out.println("Scanner closed. The program has finished running safely.");
        }
    }
}
Error Version 
public class ArithmeticError {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0; 
        int result = numerator / denominator;
        System.out.println("Result: " + result);
    }
}

Fixed Version
public class ArithmeticFixed {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
        
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
          
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program finished safely.");
    }
}


// Arithmetic and NonSuchElement

import java.util.Scanner;
import java.util.NoSuchElementException;

public class NoSuchElementFixed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please enter a number:");

           
            int number = sc.nextInt();

            System.out.println("You entered: " + number);
        } catch (NoSuchElementException e) {
           
            System.out.println("Oops! It looks like you didn't provide any input.");
            e.printStackTrace(); 
        } finally {
            sc.close(); 
            System.out.println("Scanner closed. The program has finished running safely.");
        }
    }
}

ArithMeticException

package com.mycompany.arithmeticfixed;

public class ArithmeticFixed {

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }

            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
           
            System.out.println("Error: " + e.getMessage());
        }

finally {
    System.out.print("Arithmetic is Completed.");
     
    System.out.println("Program finished safely.");
      
      
    
    }
}
}

RuntimeException
package com.mycompany.runtimefixed;


public class RuntimeFixed {

public static void main(String[] args) {
   int numerator = 10;
int denominator = 0;

try {

if (denominator == 0) {
throw new ArithmeticException("Oops! You can't divide by zero!");
     }
int result = numerator / denominator;
System.out.println("Result: " + result);

    
} catch (ArithmeticException e) {
System.out.println("Error: " + e.getMessage());
    }

finally {

 System.out.println("Runtime Is over.");
    
 System.out.println("The program keeps running");
}
   
 }
}
