// Taks 1: Declaring Using varaibles
import java.util.Scanner;  

class FootballPlayer {  

    public static void main(String[] args) {  
        String name;  
        int age;  
        double height;  
        int weight;  
        int jerseyNumber;
        final double POUNDS_ = 0.45359237;
        final int METERS = 100;


        


    Scanner input = new Scanner(System.in);  

    System.out.println("Enter player's name:");  
        name = input.nextLine();  

    System.out.println("Enter player's age:");  
        age = input.nextInt();  

          System.out.println("Enter player's height (in meters):");  
    height = input.nextDouble();  

    System.out.println("Enter player's weight (in lbs):");  
          weight = input.nextInt();  

    System.out.println("Enter player's jersey number:");  
         jerseyNumber = input.nextInt();  

    input.close();






System.out.println("\n Player's Details:");  
        
System.out.println("Name: " + name);  
 System.out.println("Age: " + age); 

System.out.println("Height: " + height + " meters");  
System.out.println("Weight: " + weight + " kg");  
        
System.out.println("Jersey Number: " + jerseyNumber);  
    }  
} 