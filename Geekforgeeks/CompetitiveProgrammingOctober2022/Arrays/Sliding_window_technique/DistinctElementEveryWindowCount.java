
/**https://www.youtube.com/watch?v=NieY_gEQ5a8
 * Count the distinct elements in every window of size K.
 * Example 1:
 * input = [1, 5, 9.3.3,7,3]
 * k = 3
 * The size of the output array is n-k+1 = 7-3+1 = 5
 * output = [3,3,2,2,2]
 * 1st window [1,5,9] Distinct elements are 3
 * 2nd window [5,9,3] Distinct elements are 3
 * 3rd window [9,3,3] Distinct elements are 2
 * 4th window [3,3,7] Distinct elements are 2
 * 5th window [3,7,3] Distinct elements are 2
*/
package Arrays.Sliding_window_technique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctElementEveryWindowCount {
    public static List<Integer> distinctElements(int[] arr, int k){
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer,Integer> hash = new HashMap<>();
        int n = arr.length;
        /**
         * Create a first window using size k and put all the elements and 
         * it's count in the hashmap
         */
        for(int i = 0; i < k; i++){
            hash.put(arr[i], hash.getOrDefault(arr[i], 0)+1);
        }
        /**
         * Add the size of the current window to the Arraylist
         */
        result.add(hash.size());
        for(int i = 1; i <= n-k; i++){
            int removeElement = arr[i-1];
            int addElement = arr[i+k-1];

            removeElementFromHashMap(hash, removeElement);

            hash.put(addElement, hash.getOrDefault(addElement, 0)+1);
            result.add(hash.size());
        }
        return result;
    }
    static void countDistinct(int arr[], int K){
        // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
 
        // Traverse the first window and store count
        // of every element in hash map
        for (int i = 0; i < K; i++)
            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);
 
        // Print count of first window
        System.out.println(hM.size());
 
        // Traverse through the remaining array
        for (int i = K; i < arr.length; i++) {
 
            // Remove first element of previous window
            // If there was only one occurrence
            if (hM.get(arr[i - K]) == 1) {
                hM.remove(arr[i - K]);
            }else // reduce count of the removed element
                hM.put(arr[i - K], hM.get(arr[i - K]) - 1);
 
            // Add new element of current window
            // If this element appears first time,
            // set its count as 1,
            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);
 
            // Print count of current window
            System.out.println(hM.size());
        }
    }
    public static void removeElementFromHashMap(Map<Integer,Integer> hash, int element){
        Integer count = hash.get(element);
        if(count != null && count > 1){
            hash.put(element, count-1);
        }else{
            hash.remove(element);
        }
    }
}
