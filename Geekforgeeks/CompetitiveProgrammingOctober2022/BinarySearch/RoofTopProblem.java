package BinarySearch;

public class RoofTopProblem {

    static int maxStepNaive(int A[], int N) {
        int maxSteps = 0;

        for (int i = 0; i < N - 1; i++) {
            int currentSteps = 0;
            
            for (int j = i + 1; j < N && A[j] > A[j - 1]; j++) {
                currentSteps++;
            }

            maxSteps = Math.max(maxSteps, currentSteps);
        }

        return maxSteps;
    }

    static int maxStepEfficient(int A[], int N) {
        int maxSteps = 0;
        int currentSteps = 0;

        for (int i = 1; i < N; i++) {
            if (A[i] > A[i - 1]) {
                // Increase currentSteps if the current element is greater than the previous one
                currentSteps++;
            } else {
                // Reset currentSteps if the current element is not greater
                maxSteps = Math.max(maxSteps, currentSteps);
                currentSteps = 0;
            }
        }

        return Math.max(maxSteps, currentSteps);
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 2, 4, 5, 6, 1};

        int resultNaive = maxStepNaive(A, A.length);
        System.out.println("Naive Approach: " + resultNaive);
    }
}

