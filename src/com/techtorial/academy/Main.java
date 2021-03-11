package com.techtorial.academy;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== swapNums ===");
        swapNums();
        System.out.println("\n=== swapStrings ===");
        swapStrings();
        System.out.println("\n=== secondLargest ===");
        secondLargest();
        System.out.println("\n=== numberOfAlphaChars ===");
        numberOfAlphaChars();
        System.out.println("\n=== reverseString ===");
        reverseString();
        System.out.println("\n=== reverseStringWordByWord ===");
        reverseStringWordByWord();
        System.out.println("\n=== palindrome ===");
        palindrome();
        System.out.println("\n=== isPrime ===");
        for (int i = 2; i <= 12; i++) {
            isPrime(i);
        }
        System.out.println("\n=== characterCount ===");
        characterCount();
    }

    private static void swapNums() {
        int a = 2;
        int b = 4;

        a = a + b; // 6
        b = a - b; // 2
        a = a - b; // 4
        System.out.println(a);
        System.out.println(b);
    }

    private static void swapStrings() {
        String a = "Hello";
        String b = "world";
        int aLength = a.length(); // 5

        a = a + b; // Helloworld
        b = a.substring(0, aLength); // Hello
        a = a.substring(aLength); // world

        System.out.println(a);
        System.out.println(b);
    }

    private static void secondLargest() {
        int[] arr = {5, 5, 5, 1, 4, 2, 8, 9, 9};

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);
    }

    private static void numberOfAlphaChars() {
        String s = "123wdasd102e=1-!!##$%k1mf01f191f";

        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            s = s.toLowerCase();
            char currentChar = s.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                counter++;
            }
        }

        System.out.println(counter);
    }

    private static void reverseString() {
        String str = "I love Java";
        String reverse = "";
        // Iterate over characters of the string starting from the end
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    private static void reverseStringWordByWord() {
        String str = "I love Java";
        // Create an array with individual words
        String[] words = str.split(" ");
        // Create a variable to hold the reversed string
        String reverse = "";
        // Iterate over the words
        for (int i = 0; i <= words.length - 1; i++) {
            // Get the word at index i
            String word = words[i];
            // Iterate over characters of the word starting from the end
            for (int j = word.length() - 1; j >= 0; j--) {
                reverse += word.charAt(j);
            }
            // When we iterated over the word, add a space to separate the words
            reverse += " ";
        }
        // When iterated over all words, print the reversed string
        System.out.println(reverse);
    }

    private static void palindrome() {
        boolean isPalindrome = true;
        String palindrome = "dad";

        for (int i = 0; i < palindrome.length() / 2; i++) {
            if(palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1 - i)) {
                isPalindrome = false;
            }
        }

        System.out.println(isPalindrome);
    }

    private static void isPrime(int number) {
        boolean isPrime = true;
        for (int divisor = 2; divisor < number; divisor++) {
            if(number % divisor == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }

    private static void characterCount() {
        String str = "Hello world";
        Map<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(counter.containsKey(currentChar)) {
                int currentNumberOfOccurrences = counter.get(currentChar);
                counter.put(currentChar, currentNumberOfOccurrences + 1);
            } else {
                counter.put(currentChar, 1);
            }
        }

        System.out.println(counter);
    }
}
