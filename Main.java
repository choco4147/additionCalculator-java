import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // instantiating variables
        Scanner scan = new Scanner(System.in); // scanner, used to get input from console
        String input = new String(); // will contain user input from console
        int answer = 0; // contains final answer
        // say the instructions
        sayInstructions();
        input = scan.nextLine(); 
        while (!input.contains("=")) { // program stops scanning and prints answer if user inputs "="
            if (input.contains("help")) { // prints the "help" text 
                needHelp();
            }
            else if (isNumeric(input)) { // adds numeric input to the final answer
                answer = answer + Integer.parseInt(input);
            }
            else { // tells user to input a number 
                System.out.println ("Your input did not contain a valid value (number, help, =)");
            }
            input = scan.nextLine(); // gets next user input 
        }
        System.out.print(answer); // prints final answer
    }
    public static void sayInstructions() {
        // prints instructions in the console
        System.out.println ("This is a simple calculator made with java");
        System.out.println ("It can solve addition and subtraction problems");
        System.out.println ("To use it, input each value in the console individually");
        System.out.println ("For subtraction, input a negative value");
        System.out.println ("When you are done, input an equals sign (=)");
        System.out.println ("For help, type ''help''");
    }
    public static void needHelp() {
        // will trigger if the user types "help" in the console
        System.out.println ("To use the calculator, type a number in the console");
        System.out.println ("If you wish to subtract the number, type the number like ''-5''");
        System.out.println ("If you wish to add the number, type the number like ''5''");
        System.out.println ("Only one number should be input at a time");
        System.out.println ("Press enter/return before typing the next number");
    }
    public static boolean isNumeric (String input) { // determines if an input is numeric or not
        try {  
        Double.parseDouble(input); // parse int, returns true if it is an int
        return true;
        } 
        catch(NumberFormatException e) {   // returns false if previous parseInt does not return true
        return false;  
        }  
    }
}

