package MphasisInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Return the array of strings that their length is greater than 3

public class FindLength {
    public List<String> countString(ArrayList<String> list){
   List<String> result = new ArrayList<>();
 	result = list.stream().filter((l) -> l.length() > 3)
	  .collect(Collectors.toList());
   return result;
 }
}
