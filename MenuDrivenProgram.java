import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
                handleMenuChoice(choice);
                if (choice == 3) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
            }
        }
        
        scanner.close();
    }

    
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

   
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

   
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                number = Integer.parseInt(scanner.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
