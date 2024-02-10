package ConvertCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {
    public static void main(String[] args) {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(1, 10);
            map.put(2, 20);
            map.put(3, 30);
            map.put(4, 40);
            List<Integer> list = new ArrayList<>(map.values());
            System.out.println(list);
    }
}
