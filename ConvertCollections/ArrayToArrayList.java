package ConvertCollections;

import java.util.*;

public class ArrayToArrayList {
    public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1, 2, 3, 4);

            Integer[] arr = list.toArray(new Integer[list.size()]);

            System.out.println(list);
            System.out.println(Arrays.toString(arr));

            List<Integer> list2 = Arrays.asList(arr);
            System.out.println(list2);
    }

}
