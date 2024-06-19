import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list of numbers
        List<Integer> numbers = new ArrayList<>();

        // Prompt the user to enter numbers
        System.out.println("Enter numbers (type 'done' to finish):");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        // Print the square of each number
        System.out.println("Squares of the numbers:");
        for (int number : numbers) {
            System.out.println(number + " squared is " + (number * number));
        }

        scanner.close();
    }
}