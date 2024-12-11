//  Implement a generic program using any collection class to count the number of 
// elements in a collection that have a specific property such as even numbers, odd 
// number, prime number and palindromes.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionPropertyCounter {

    // Method to count even numbers
    public static <T extends Number> int countEven(List<T> list) {
        int count = 0;
        for (T number : list) {
            if (number.intValue() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Method to count odd numbers
    public static <T extends Number> int countOdd(List<T> list) {
        int count = 0;
        for (T number : list) {
            if (number.intValue() % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to count prime numbers
    public static <T extends Number> int countPrime(List<T> list) {
        int count = 0;
        for (T number : list) {
            if (isPrime(number.intValue())) {
                count++;
            }
        }
        return count;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    // Method to count palindromes
    public static <T extends Number> int countPalindromes(List<T> list) {
        int count = 0;
        for (T number : list) {
            if (isPalindrome(number.intValue())) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Input numbers
        System.out.println("Enter numbers (type 'done' to finish):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Please enter a valid integer or 'done' to finish.");
            }
        }

        // Count and display results
        System.out.println("Count of even numbers: " + countEven(numbers));
        System.out.println("Count of odd numbers: " + countOdd(numbers));
        System.out.println("Count of prime numbers: " + countPrime(numbers));
        System.out.println("Count of palindromes: " + countPalindromes(numbers));

        scanner.close();
    }
}