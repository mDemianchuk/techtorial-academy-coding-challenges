package com.techtorial.academy;

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
}
