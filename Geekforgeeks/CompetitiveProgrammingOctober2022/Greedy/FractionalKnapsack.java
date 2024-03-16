package Greedy;

import java.util.ArrayList;
import java.util.List;

class Pair {
    private int weight;
    private int value;
    private double ratio;

    public Pair(int weight, int value, double ratio) {
        this.weight = weight;
        this.value = value;
        this.ratio = ratio;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public double getRatio() {
        return ratio;
    }
}

public class FractionalKnapsack {
    public static int printMaxActivities(int A1[], int A2[], int n, int cap) {
        List<Pair> activities = new ArrayList<>();
        // 1. Calculate ratio for every Item
        double A3[] = new double[n];
        for (int i = 0; i < n; i++) {
            double ratio = (double) A1[i] / A2[i]; // Cast one of the operands to double
            A3[i] = ratio;
        }
        for (int i = 0; i < n; i++) {
            activities.add(new Pair(A1[i], A2[i], A3[i]));
        }
        // 2. Sort every item in decreasing order of the ratio
        activities.sort((a1, a2) -> Double.compare(a1.getRatio(), a2.getRatio())); // Use Double.compare for sorting

        //3.  Initialize res = 0, curr_cap = given_cap
        int res = 0;
        int curr = cap;
        for (int i = 0; i < activities.size(); i++) { // Corrected loop start index
            if (activities.get(i).getWeight() <= curr) { // Fixed cap to curr
                curr -= activities.get(i).getWeight();
                res += activities.get(i).getValue();
            } else {
                res += activities.get(i).getValue() * ((double) curr / activities.get(i).getWeight()); // Corrected formula
                break; // Added break to exit the loop
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int s[] = {50, 20, 30};
        int f[] = {600, 500, 400};
        int n = s.length;

        System.out.println(printMaxActivities(s, f, n, 70));
    }
}

