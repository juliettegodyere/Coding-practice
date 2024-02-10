package Strings;

import java.util.Map.Entry;
import java.util.*;

public class Singleton {
    public static int findSingleton(int[] student_list){
        int single_student_number = 0;
		int n = student_list.length;
        HashMap<Integer, Integer> hash = new HashMap<>();


        for(int i = 0; i < n; i++){
            if(hash.containsKey(student_list[i])){
                hash.put(student_list[i], hash.get(student_list[i])+1);
            }else{
                hash.put(student_list[i], 1);
            }
        }
        for(Entry<Integer, Integer> entry: hash.entrySet()) {
            if(entry.getValue() == 1){
                single_student_number = entry.getKey();
            }
          }
		return single_student_number;
		
    }
    public static void main (String[] args){
        int[] nums = {2,2,10,5,4,6,7,5,8,8,6,4,7};
        System.out.println(findSingleton(nums));
    }
}
