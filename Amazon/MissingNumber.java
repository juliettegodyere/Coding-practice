package Amazon;

import java.util.*;

public class MissingNumber {
    static int missingNumber(int array[], int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(array[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args){
        int array[] = {6,1,2,8,3,4,7,10,5};
        System.out.println(missingNumber(array, array.length));
    }
}
