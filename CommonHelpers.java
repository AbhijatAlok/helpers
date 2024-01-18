import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommonHelpers {

    // Function to find the minimum value in an array of integers
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Function to calculate the average of an array of integers
    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string must not be null");
        }

        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    // Function to shuffle a list of elements
    public static <T> void shuffleList(List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("List must not be null");
        }

        Collections.shuffle(list);
    }

    // Function to generate a list of prime numbers up to a given limit
    public static List<Integer> generatePrimes(int limit) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    // Function to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Function to calculate the factorial of a non-negative integer
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        // Example usage of additional helper functions
        int[] numbers = {5, 2, 8, 1, 6};
        System.out.println("Minimum value: " + findMin(numbers));
        System.out.println("Average: " + calculateAverage(numbers));

        String palindromeTest = "radar";
        System.out.println("Is '" + palindromeTest + "' a palindrome? " + isPalindrome(palindromeTest));

        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        shuffleList(integerList);
        System.out.println("Shuffled list: " + integerList);

        int primeLimit = 20;
        System.out.println("Prime numbers up to " + primeLimit + ": " + generatePrimes(primeLimit));

        int evenNumber = 10;
        System.out.println("Is " + evenNumber + " even? " + isEven(evenNumber));

        int factorialNumber = 5;
        System.out.println("Factorial of " + factorialNumber + ": " + calculateFactorial(factorialNumber));
    }
}
