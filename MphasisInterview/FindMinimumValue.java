package MphasisInterview;

import java.util.Arrays;
import java.util.List;

//Find the minimum value from the list of Integer using stream APIs and without using the min method on Stream
//Java 8 program to Count Strings whose length is greater than 3 in List
public class FindMinimumValue {
     public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 7, 2);

        // Using reduce method to find minimum value
        int min = numbers.stream()
                        .reduce((a, b) -> a < b ? a : b)
                        .orElseThrow(); // If list is empty, throw an exception or handle appropriately

        System.out.println("Minimum value: " + min);
    }
}
