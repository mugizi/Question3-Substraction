package question3.substraction;

import java.util.Random;
import java.util.Scanner;
public class subtraction {
    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            int number1 = random.nextInt(10); 
            int number2 = random.nextInt(10); 
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("What is " + number1 + " - " + number2 + "?");
            int studentAnswer = scanner.nextInt();
            int correctAnswer = number1 - number2;
            if (studentAnswer == correctAnswer) {
                System.out.println("Correct! The answer is " + correctAnswer + ".");
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
            }
            System.out.println("Type 'exit' to stop, or press Enter to solve another problem:");
            scanner.nextLine(); // Consume the newline character
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("q")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Thank you for practicing!");
    }
}
