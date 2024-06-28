/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Riska
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Variables
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        
        char operator = 0;

        //Scanner Object
        Scanner input = new Scanner(System.in);

        while (true) {
            
            //Checing if the user entered the correct input
            try{
            //prompt user for 2 input
            System.out.println("Enter 2 integer numbers. Or enter 777 to terminate the program.");
            num1 = input.nextInt();
            
            if(num1 == 777){
                break;
            }
            
            num2 = input.nextInt();
            //Clearing the input buffer to prevent errors
            input.nextLine();
            
            } catch(Exception e){
            
                System.out.println("Invaild. Input must be a integer.Try again.");
                input.nextLine();
                continue; // Prompting for user input again.
            }
            

            //Asking user to select operator
            System.out.println("Select the operator ('+','-', '*','/')");
            operator = input.next().charAt(0);

            //User to select their operator
            switch (operator) {

                case '+':
                    answer = num1 + num2;
                    break;

                case '-':
                    answer = num1 - num2;
                    break;

                case '/':
                    try {
                        answer = num1 / num2;
                    } catch (Exception e) {
                        System.out.println("You cannot divide by zero");
                    }
                    continue;    
                    
                case '*':
                    answer = num1 * num2;
                    break;

                default:
                    System.out.println("Try Again. Please select +, -, / or *");
            }

            System.out.println("Answer: " + answer);
        }
        
        System.out.println("Bye From Simple Calculator!!!");
    }

}
