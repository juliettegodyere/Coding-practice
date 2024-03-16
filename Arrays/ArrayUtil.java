package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayUtil {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Jane", "Blessing", "Gab");

        //Binary Search
        int arr[] = {3, 2, 7};
        int res = Arrays.binarySearch(arr, 7);

        //DeepEquals
        Integer arr1[] = {3, 2, 7};
        Integer arr2[] = {7, 2, 3};
        boolean de = Arrays.deepEquals(arr1, arr2);
        System.out.println(de);

         //Equals
         Integer arr3[] = {3, 2, 7};
         Integer arr4[] = {1, 2, 4};
         boolean e = Arrays.equals(arr3, arr4);
        

         //Fill
         int arr5[] = new int[10];
         Arrays.fill(arr5, 5);
         Arrays.toString(arr5);
        

         //parallelPrefix
        //Arrays.parallelPrefix(arr4, (a, b) -> a+b);
        // for(int i = 0; i < arr4.length; i++){
        //     System.out.print(arr4[i] + ",");
        // }
        
        //parallelSetAll
        int arr6[] = {1, 2, 3};
        //This sets the index instead of the values
        Arrays.parallelSetAll(arr6, (index) -> index*index);
        // for(int i = 0; i < arr6.length; i++){
        //     System.out.print(arr6[i] + ",");
        // }

        Arrays.parallelSetAll(arr6, (index) -> arr6[index] * arr6[index]);
        // for(int i = 0; i < arr6.length; i++){
        //     System.out.print(arr6[i] + ",");
        // }
        //System.out.print(arr4[arr4.length-1]);

        //	parallelSort
        int arr7[] = {12, 2, 3, 17, 19, 0, 4};
        Integer arr8[] = {12, 2, 3, 17, 19, 0, 4};
        Arrays.parallelSort(arr7);
        Arrays.parallelSort(arr8, Comparator.reverseOrder());

         //	Sort
         int arr9[] = {6,1,2,8,3,4,7,10,5};
         Integer arr10[] = {12, 2, 3, 17, 19, 0, 4};
        //  Arrays.parallelSort(arr7);
        //  Arrays.parallelSort(arr8, Comparator.reverseOrder());

         //Stream
         List<Integer> ist = Arrays.stream(arr10).sorted().collect(Collectors.toList());
         //System.out.println(ist);

    }
}
