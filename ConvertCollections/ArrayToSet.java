package ConvertCollections;

import java.util.*;

public class ArrayToSet {
     public static void main(String[] args) {
            //Array to Set
            Integer[] temp = new Integer[]{
                1, 2, 3, 4
            };
            Set<Integer> set = new HashSet<>(Arrays.asList(temp));

            System.out.println(set);
            //set to array
            Set<Integer> set1 = new HashSet<>();
            set1.add(1);
            set1.add(2);
            set1.add(3);
            set1.add(4);
            set1.add(5);

            Integer[] arr = set1.toArray(new Integer[set1.size()]);
            System.out.println(Arrays.toString(arr));
    }
}
