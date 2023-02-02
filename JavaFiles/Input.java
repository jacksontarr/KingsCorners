package JavaFiles;
import java.util.Scanner;  //Import scanner

 public class Input {
     /** Reads user input */
     private static Scanner keyboard = new Scanner(System.in);  //Creating scanner object
     
     /**
      * The readInt method returns a valid integer
      * @param prompt Prompt the user receives.
      * @return Valid integer.
      */
     public static int readInt(String prompt) {
         int var = 0;
         boolean invalid = true;  //Declare variables
         
         do {
             System.out.println(prompt);  //Printing specialized prompt
             
             if (keyboard.hasNextInt()) {  //If input is an int
                 var = keyboard.nextInt();  //Puts input into var
                 invalid = false;  //Input is valid if it is false, loop won't repeat
             }
             else {
                 System.out.println("You have entered an invalid number");  //Print error message if not an int
             }
             keyboard.nextLine();  //Remove [ENTER] from buffer
         } while (invalid);  //Repeat if invalid
         
         return var;  //Return whatever is in the variable
     }
     
 //-------------------------------------------------------------------------------------------------------------------------------------------------	
     
     /**
      * The readDouble method returns a valid double
      * @param prompt Prompt the user receives.
      * @return Valid double.
      */
     public static double readDouble(String prompt) {
         double var = 0;
         boolean invalid = true;  //Declare variables
         
         do {
             System.out.println(prompt);  //Printing specialized prompt
             
             if (keyboard.hasNextDouble()) {  //If input is an double
                 var = keyboard.nextDouble();  //Puts input into var
                 invalid = false;  //Input is valid if it is false, loop won't repeat
             }
             else {
                 System.out.println("You have entered an invalid number");  //Print error message if not an double
             }
             keyboard.nextLine();  //Remove [ENTER] from buffer
         } while (invalid);  //Repeat if invalid
         
         return var;  //Return whatever is in the variable
     }
     
 //-------------------------------------------------------------------------------------------------------------------------------------------------	
         
     /**
      * The readNum method returns a valid integer
      * @param prompt Prompt the user receives.
      * @param max The maximum value for the integer.
      * @return Valid integer.
      */
     public static int readNum(String prompt, int max) {
         int var;  //Declare variable
         
         do {
             System.out.println(prompt);  //Printing specialized prompt
             
             var = max + 1;  //Set var to invalid number
             
             if (keyboard.hasNextInt()) {  //If input is an int
                 var = keyboard.nextInt();  //Puts input into var
                 
                 if (var > max) {
                     System.out.println("You have entered an invalid number");  //Print error message if out of range
                 }
             }
             else {
                 System.out.println("You have entered an invalid number");  //Print error message if not an int
             }
             keyboard.nextLine();  //Remove [ENTER] from buffer
         } while (var > max);  //Repeat if invalid
         
         return var;  //Return whatever is in the variable
     }
     
 //-------------------------------------------------------------------------------------------------------------------------------------------------	
             
     /**
      * The readNum method returns a valid integer
      * @param min The minimum value for the integer.
      * @param prompt Prompt the user receives.
      * @return Valid integer.
      */
     public static int readNum(int min, String prompt) {
         int var;  //Declare variable
         
         do {
             System.out.println(prompt);  //Printing specialized prompt
             
             var = min - 1;  //Set var to invalid number
             
             if (keyboard.hasNextInt()) {  //If input is an int
                 var = keyboard.nextInt();  //Puts input into var
                 
                 if (var < min) {
                     System.out.println("You have entered an invalid number");  //Print error message if out of range
                 }
             }
             else {
                 System.out.println("You have entered an invalid number");  //Print error message if not an int
             }
             keyboard.nextLine();  //Remove [ENTER] from buffer
         } while (var < min);  //Repeat if invalid
         
         return var;  //Return whatever is in the variable
     }
         
 //-------------------------------------------------------------------------------------------------------------------------------------------------	
                 
     /**
      * The readNum method returns a valid integer
      * @param prompt Prompt the user receives.
      * @param min The minimum value for the integer.
      * @param max The maximum value for the integer.
      * @return Valid integer.
      */
     public static int readNum(String prompt, int min, int max) {
         int var;  //Declare variable
         
         do {
             System.out.println(prompt);  //Printing specialized prompt
             
             var = min - 1;  //Set var to invalid number
             
             if (keyboard.hasNextInt()) {  //If input is an int
                 var = keyboard.nextInt();  //Puts input into var
                 
                 if (var > max || var < min) {
                     System.out.println("You have entered an invalid number");  //Print error message if out of range
                 }
             }
             else {
                 System.out.println("You have entered an invalid number");  //Print error message if not an int
             }
             keyboard.nextLine();  //Remove [ENTER] from buffer
         } while (var < min || var > max);  //Repeat if invalid
         
         return var;  //Return whatever is in the variable
     }
     
 //-------------------------------------------------------------------------------------------------------------------------------------------------	
             
     /**
      * The readNum method returns a valid double
      * @param prompt Prompt the user receives.
      * @param max The maximum value for the double.
      * @return Valid double.
      */
     public static double readNum(String prompt, double max) {
         double var;  //Declare variable
         
         do {
             System.out.println(prompt);  //Printing specialized prompt
             
             var = max + 1;  //Set var to invalid number
             
             if (keyboard.hasNextDouble()) {  //If input is an double
                 var = keyboard.nextDouble();  //Puts input into var
                 
                 if (var > max) {
                     System.out.println("You have entered an invalid number");  //Print error message if out of range
                 }
             }
             else {
                 System.out.println("You have entered an invalid number");  //Print error message if not an double
             }
             keyboard.nextLine();  //Remove [ENTER] from buffer
         } while (var > max);  //Repeat if invalid
         
         return var;  //Return whatever is in the variable
     }
         
 //-------------------------------------------------------------------------------------------------------------------------------------------------	
                 
     /**
      * The readNum method returns a valid double
      * @param min The minimum value for the double.
      * @param prompt Prompt the user receives.
      * @return Valid double.
      */
     public static double readNum(double min, String prompt) {
         double var;  //Declare variable
         
         do {
             System.out.println(prompt);  //Printing specialized prompt
             
             var = min - 1;  //Set var to invalid number
             
             if (keyboard.hasNextDouble()) {  //If input is an double
                 var = keyboard.nextDouble();  //Puts input into var
                 
                 if (var < min) {
                     System.out.println("You have entered an invalid number");  //Print error message if out of range
                 }
             }
             else {
                 System.out.println("You have entered an invalid number");  //Print error message if not an double
             }
             keyboard.nextLine();  //Remove [ENTER] from buffer
         } while (var < min);  //Repeat if invalid
         
         return var;  //Return whatever is in the variable
     }
             
 //-------------------------------------------------------------------------------------------------------------------------------------------------	
                     
     /**
      * The readNum method returns a valid double
      * @param prompt Prompt the user receives.
      * @param min The minimum value for the double.
      * @param max The maximum value for the double.
      * @return Valid double.
      */
     public static double readNum(String prompt, double min, double max) {
         double var;  //Declare variable
         
         do {
             System.out.println(prompt);  //Printing specialized prompt
             
             var = min - 1;  //Set var to invalid number
             
             if (keyboard.hasNextDouble()) {  //If input is an double
                 var = keyboard.nextDouble();  //Puts input into var
                 
                 if (var > max || var < min) {
                     System.out.println("You have entered an invalid number");  //Print error message if out of range
                 }
             }
             else {
                 System.out.println("You have entered an invalid number");  //Print error message if not an double
             }
             keyboard.nextLine();  //Remove [ENTER] from buffer
         } while (var > max || var < min);  //Repeat if invalid
         
         return var;  //Return whatever is in the variable
     }
     
 //-------------------------------------------------------------------------------------------------------------------------------------------------
             
     /**
      * The readNum method returns a valid integer
      * @param prompt Prompt the user receives.
      * @param limit Either the minimum or maximum value for the integer.
      * @param minMax Tells whether the limit is the minimum or maximum value.
      * @return Valid integer.
      */
     public static int readNum(String prompt, int limit, boolean minMax) {
         int var;  //Declare variable
         
         if (minMax) {
             do {
                 System.out.println(prompt);  //Printing specialized prompt
                 
                 var = limit - 1;  //Set var to invalid number
                 
                 if (keyboard.hasNextInt()) {  //If input is an int
                     var = keyboard.nextInt();  //Puts input into var
                     
                     if (var < limit) {
                         System.out.println("You have entered an invalid number");  //Print error message if out of range
                     }
                 }
                 else {
                     System.out.println("You have entered an invalid number");  //Print error message if not an int
                 }
                 keyboard.nextLine();  //Remove [ENTER] from buffer
             } while (var < limit);  //Repeat if invalid
         }
         else {
             do {
                 System.out.println(prompt);  //Printing specialized prompt
                 
                 var = limit + 1;  //Set var to invalid number
                 
                 if (keyboard.hasNextInt()) {  //If input is an int
                     var = keyboard.nextInt();  //Puts input into var
                     
                     if (var > limit) {
                         System.out.println("You have entered an invalid number");  //Print error message if out of range
                     }
                 }
                 else {
                     System.out.println("You have entered an invalid number");  //Print error message if not an int
                 }
                 keyboard.nextLine();  //Remove [ENTER] from buffer
             } while (var > limit);  //Repeat if invalid
         }
         
         return var;  //Return whatever is in the variable
     }
     
 //-------------------------------------------------------------------------------------------------------------------------------------------------	
                 
     /**
      * The readNum method returns a valid double
      * @param prompt Prompt the user receives.
      * @param limit Either the minimum or maximum value for the integer.
      * @param minMax Tells whether the limit is the minimum or maximum value.
      * @return Valid double.
      */
     public static double readNum(String prompt, double limit, boolean minMax) {
         double var;  //Declare variable
         
         if (minMax) {
             do {
                 System.out.println(prompt);  //Printing specialized prompt
                 
                 var = limit - 1;  //Set var to invalid number
                 
                 if (keyboard.hasNextDouble()) {  //If input is an double
                     var = keyboard.nextDouble();  //Puts input into var
                     
                     if (var < limit) {
                         System.out.println("You have entered an invalid number");  //Print error message if out of range
                     }
                 }
                 else {
                     System.out.println("You have entered an invalid number");  //Print error message if not an double
                 }
                 keyboard.nextLine();  //Remove [ENTER] from buffer
             } while (var < limit);  //Repeat if invalid
         }
         else {
             do {
                 System.out.println(prompt);  //Printing specialized prompt
                 
                 var = limit + 1;  //Set var to invalid number
                 
                 if (keyboard.hasNextDouble()) {  //If input is an double
                     var = keyboard.nextDouble();  //Puts input into var
                     
                     if (var > limit) {
                         System.out.println("You have entered an invalid number");  //Print error message if out of range
                     }
                 }
                 else {
                     System.out.println("You have entered an invalid number");  //Print error message if not an double
                 }
                 keyboard.nextLine();  //Remove [ENTER] from buffer
             } while (var > limit);  //Repeat if invalid
         }
         
         return var;  //Return whatever is in the variable
     }
 }