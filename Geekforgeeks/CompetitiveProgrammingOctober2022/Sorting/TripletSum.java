package Sorting;

public class TripletSum {
    // returns true if there is triplet with sum equal
    // to 'sum' present in A[]. Also, prints the triplet
    static boolean find3Numbers(int A[], int arr_size, int sum)
    {
        int l, r;
 
        /* Sort the elements */
        quickSort(A, 0, arr_size - 1);
 
        /* Now fix the first element one by one and find the
           other two elements */
        for (int i = 0; i < arr_size - 2; i++) {
 
            // To find the other two elements, start two
            // index variables from two corners of the array
            // and move them toward each other
            l = i + 1; // index of the first element in the
                       // remaining elements
            r = arr_size - 1; // index of the last element
            while (l < r) {
                if (A[i] + A[l] + A[r] == sum) {
                    //System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]);
                    return true;
                }
                else if (A[i] + A[l] + A[r] < sum)
                    l++;
 
                else // A[i] + A[l] + A[r] > sum
                    r--;
            }
        }
 
        // If we reach here, then no triplet was found
        return false;
    }
 
    static int partition(int A[], int low, int high)
    {
        int x = A[high];
        int i = (low - 1);
        int j;
 
        for (j = low; j <= high - 1; j++) {
            if (A[j] <= x) {
                i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[high];
        A[high] = temp;
        return (i + 1);
    }
 
    /* Implementation of Quick Sort
    A[] --> Array to be sorted
    si  --> Starting index
    ei  --> Ending index
     */
    static void quickSort(int A[], int low, int high)
    {
        int pi;
 
        /* Partitioning index */
        if (low < high) {
            pi = partition(A, low, high);
            quickSort(A, low, pi - 1);
            quickSort(A, pi + 1, high);
        }
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;
 
        find3Numbers(A, arr_size, sum);
    }
}
