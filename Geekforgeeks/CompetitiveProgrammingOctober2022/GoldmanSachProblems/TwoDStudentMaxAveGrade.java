package GoldmanSachProblems;

/***
 * given a 2D string array, that contains student name and grades, there can be one or more grades per student. Return the maximum average grade amongst all students
 */

import java.util.HashMap;
import java.util.Map;

public class TwoDStudentMaxAveGrade {
    public static double findMaxAverageGrade(String[][] grades) {
        Map<String, Integer> totalGrades = new HashMap<>();
        Map<String, Integer> gradeCount = new HashMap<>();

        for (String[] student : grades) {
            String name = student[0];
            int grade = Integer.parseInt(student[1]);

            // Update total grades and grade count for each student
            totalGrades.put(name, totalGrades.getOrDefault(name, 0) + grade);
            gradeCount.put(name, gradeCount.getOrDefault(name, 0) + 1);
        }

        double maxAverage = Double.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : totalGrades.entrySet()) {
            String name = entry.getKey();
            int total = entry.getValue();
            int count = gradeCount.get(name);
            
            double average = (double) total / count;

            // Update max average if the current average is greater
            maxAverage = Math.max(maxAverage, average);
        }

        return maxAverage;
    }

    public static void main(String[] args) {
        String[][] grades = {
                {"Alice", "90"},
                {"Bob", "80"},
                {"Alice", "95"},
                {"Bob", "75"},
                {"Charlie", "85"}
        };

        double result = findMaxAverageGrade(grades);
        System.out.println("Max Average Grade: " + result);
    }
}
