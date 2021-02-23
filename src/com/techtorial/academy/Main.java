package com.techtorial.academy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        swapNums();
        swapStrings();
        secondLargest();
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
        int[] arr = {5, 6, -2, 1, 10, 20, 1, 4};
        Arrays.sort(arr);
        int secondLargest = arr[arr.length - 2];
        System.out.println(secondLargest);
    }
}
