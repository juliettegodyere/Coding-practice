package ConvertCollections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapToArray {

    public static Integer[] mapToArray(Map<Integer, Integer> map){
        Collection<Integer> col = map.values();

        Integer[] arr = col.toArray(new Integer[col.size()]);

        return arr;
    }

    public static void main(String[] args) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(1, 10);
            map.put(2, 20);
            map.put(3, 30);
            map.put(4, 40);
            System.out.println(Arrays.toString(mapToArray(map)));
    }
    
}
