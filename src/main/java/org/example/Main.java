package org.example;

import static org.example.ArrayProcessor.processArray;

public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidArraySize = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"10", "11", "12"}
        };

        String[][] invalidArrayData = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "eleven", "12"},
                {"13", "14", "15", "16"}
        };


        try {
            int result = processArray(validArray);
            System.out.println("Sum of validArray: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            int result = processArray(invalidArraySize);
            System.out.println("Sum of invalidArraySize: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            int result = processArray(invalidArrayData);
            System.out.println("Sum of invalidArrayData: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }
}
