import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variables
        String name;
        int age;
        double heightMeters;
        double weightLbs;
        int jersey;

        // constants for completing task 2
        final int METER = 100;
        final double POUND = 0.45359237;

        // Requesting the user for inputs
        System.out.print("Enter player's name: ");
        name = input.nextLine();

        System.out.print("Enter player's age: ");
        age = input.nextInt();

        System.out.print("Enter player's height in meters: ");
        heightMeters = input.nextDouble();

        System.out.print("Enter player's weight in lbs: ");
        weightLbs = input.nextDouble();

        System.out.print("Enter player's jersey number: ");
        jersey = input.nextInt();

        // Task 1: output before conversions
        System.out.println("\nPlayer Details:");
        System.out.println("Name - " + name);    
        System.out.println("Age - " + age);
        System.out.println("Height  - " + heightMeters + " m");
        System.out.println("Weight  - " + weightLbs + " lbs");
        System.out.println("Jersey Number - " + jersey);

        // Task 2: conversions
        int heightCm = (int)(heightMeters * METER);
        double weightKg = weightLbs * POUND;
        int roundedWeight = (int) weightKg;   

        System.out.println("\nPlayer Details after Conversion:");
        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height in centimeters - " + heightCm + " cm");
        System.out.println("Weight in kilograms - " + roundedWeight + " kg");
        System.out.println("Jersey Number - " + jersey);
        System.out.println("\n");

        // Task 3: Incrementing and decrementing operators
        System.out.println("Player's name is " + name);
        age++;
        jersey--;
        System.out.println("New Age - " + age);
        System.out.println("New Jersey Number - " + jersey);

        // Task 4: Boolean Expressions and logical operators
        boolean eligibleToPlay = (age >= 18 && age <= 35 && roundedWeight < 90);
        if (eligibleToPlay) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        boolean underAge_overWeight = (age < 18 || roundedWeight >= 90);
        if (underAge_overWeight) {
            System.out.println("Player has a problem (either too young or too heavy)");
        }

        boolean notEligibleToPlay = !eligibleToPlay;
        if (notEligibleToPlay) {
            System.out.println("Not Eligible");
        } 

        // Task 5: Categorizing players based on age
        if (age < 20) {
    System.out.println("Rising Star");
        }
        else if (age >= 20 && age <= 30){
            System.out.println("Prime Player");
        } 
        else if (age > 30){
            System.out.println("Veteran Player");
        }
        else {
            System.out.println("May be error!!! or you entered something else not age");
}

        // Task 6: Switch Cases (Basic)
        switch (jersey) {
            case 1: 
             System.out.println("Goalkeeper"); 
            break;
          case 2: 
            System.out.println("defender"); break;
            case 3: 
            System.out.println("defender"); break;
            case 4: 
             System.out.println("defender"); break;
            case 5: 
         System.out.println("defender"); break;
            case 6: 
              System.out.println("midfielder"); break;
            case 7: 
            System.out.println("winger"); break;
    case 8: 
            System.out.println("midfielder"); break;
            case 9: 
         System.out.println("striker"); break;
            case 10: 
            System.out.println("playmaker"); break;
            case 11: 
            System.out.println("winger"); break;
            default: 
            System.out.println("Player position not known");
        }

        // Task 7 part 1: Fall-Through (without break)
        switch (jersey) {
             case 1:
                System.out.println("Goalkeeper");
                break;
        case 2:
                 System.out.println("defender");
                // break;
             case 3:
                System.out.println("defender");
          break;
            case 4:
                System.out.println("defender");
                break;
         case 5:
                System.out.println("defender");
                break;
            case 6:
                System.out.println("midfielder");
                // break;
            case 7:
                System.out.println("winger");
                // break;
               case 8:
                System.out.println("midfielder");
                   break;
        case 9:
                System.out.println("striker");
                break;
            case 10:
                System.out.println("playmaker");
                break;
            case 11:
                System.out.println("winger");
                break;
              default:
                System.out.println("Player position not known");
        }

        // Task 7 part 2: Grouped cases
        switch (jersey) {
            case 1: 
            System.out.println("Goalkeeper"); 
            break;
            case 2: case 3: case 4: case 5: 
         System.out.println("defender"); 
            break;
            case 6: case 8: 
             System.out.println("midfielder"); 
            break;
            case 7: case 11: 
            System.out.println("winger");
               break;
            case 9: 
     System.out.println("striker"); 
            break;
            case 10: 
            System.out.println("playmaker");
             break;
            default: 
  System.out.println("Player position not known");
        }

        // Task 8: Nested ifs
        if (age >= 20 && age <= 30) {
            if (roundedWeight < 80) {
                System.out.println("Player in starting line up"); } 
            else {
                System.out.println("Player on bench because of weigght");
            }
        } 
        else {
            System.out.println("Player on bench because of age");
        }

        // Task 9: Conditional Expression (Ternary Operator)
        String playerfinalStatus = (eligibleToPlay) ? "Play": "Rest";
        System.out.println("Player's final status: " + playerfinalStatus);

        // Task 10: Final Player Report 
        System.out.println("\nFinal Player Report");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age);

        if (age < 20) {
            System.out.println("Category: Rising Star");
        } 
    else if (age >= 20 && age <= 30) {
            System.out.println("Category: Prime Player");
        } 
        else {
            System.out.println("Category: Veteran Player");}

System.out.println("Height: " + (int)heightCm + " cm");
     System.out.println("Weight: " + roundedWeight + " kg");
    System.out.println("Jersey: " + jersey);

        switch (jersey) {
            case 1: 
              System.out.println("Position: Goalkeeper"); 
              break;
            case 2: 
            System.out.println("Position: defender"); 
            break;
              case 3: 
              System.out.println("Position: defender"); 
            break;
            case 4: 
         System.out.println("Position: defender"); 
            break;
            case 5: 
        System.out.println("Position: defender"); 
            break;
            case 6: 
              System.out.println("Position: midfielder"); 
            break;
            case 7: 
            System.out.println("Position: winger"); 
            break;
            case 8: 
            System.out.println("Position: midfielder"); 
            break;
            case 9: 
         System.out.println("Position: striker"); 
            break;
            case 10: 
        System.out.println("Position: playmaker"); 
            break;
            case 11: 
    System.out.println("Position: winger"); 
            break;
            default: System.out.println("Position: not known");
        }

        if (jersey == 7 || jersey == 9 || jersey == 10 || jersey == 11) {
            System.out.println("Attacker jersey: Yes");
        } 
        else {
            System.out.println("Attacker jersey: No");
    }

        if (eligibleToPlay) {
            System.out.println("Eligibility: Eligible");
        } 
        else {
            System.out.println("Eligibility: Not Eligible");
        }

        if (age >= 20 && age <= 30) {
            if (roundedWeight < 80) {
                System.out.println("Lineup Decision: Starting lineup");
            } 
            else {
                System.out.println("Lineup Decision: Bench");
            }
        }
         else {
            System.out.println("Lineup Decision: Bench");
        }

        System.out.println("Final Decision: " + playerfinalStatus);

        
        
        input.close();
    }
}
