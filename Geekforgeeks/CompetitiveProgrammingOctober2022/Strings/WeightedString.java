/**
 * https://www.hackerrank.com/challenges/weighted-uniform-string/problem?isFullScreen=true
 */
package Strings;

import java.util.*;

public class WeightedString {
    //The working code
    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        Set<Integer> weights = new HashSet<>();
        char prevChar = 0;
        int count = 0;
        
        // Iterate through the string to calculate the weights of uniform substrings
        for (char c : s.toCharArray()) {
            int weight = c - 'a' + 1; // Calculate the weight of the current character
            if (c == prevChar) {
                count++;
                weight *= count;
            } else {
                count = 1;
            }
            weights.add(weight); // Add the calculated weight to the set
            prevChar = c;
        }
        
        // Check if each query weight exists in the set of uniform substring weights
        List<String> res = new ArrayList<>();
        for (int query : queries) {
            res.add(weights.contains(query) ? "Yes" : "No");
        }
        
        return res;
    }
    //This code failed some test cases because it exceeded the time limit    
     public static List<String> weightedUniformStrings2(String s, List<Integer> queries) {
        // Write your code here
            ArrayList<String> list = new ArrayList<>();
          
            char alphabets[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            HashMap<Character, Integer> letters = new HashMap<>();
            HashMap<String, Integer> count = new HashMap<>();
            
            List<String> res = new ArrayList<>();
            for(int i = 0; i < alphabets.length; i++){
                letters.put(alphabets[i], (alphabets[i]-'a')+1);
            }
            String ss = ""+s.charAt(0);
            int valCount = letters.get(s.charAt(0));
            count.put(ss,valCount);
            int i;
            for(i = 1; i < s.length(); i++){
                if(s.charAt(i) != s.charAt(i-1)){
                    valCount = 0;
                    ss = "";
                }
                ss +=s.charAt(i);
                valCount += letters.get(s.charAt(i));
                System.out.println("Index of i  " + i);
                System.out.println("Count so far "+ valCount);
                System.out.println("String " + ss);
                count.put(ss,valCount);
                
                System.out.println("Count when not equal "+ valCount);
                System.out.println("String when not equal" + ss);
                System.out.println("Index of i " + i);
            }
            for(int j = 0; j < queries.size(); j++){
                System.out.println("Queries " + queries.get(j));

                if(count.containsValue(queries.get(j))){
                    System.out.println(queries.get(j));
                    //System.out.println(letters.get(s.charAt(i)));
                    //System.out.println(count.get(s.charAt(i)));
                    res.add("YES");
                }else{
                    res.add("NO");
                }
            }
           System.out.println(res);
            System.out.println(letters);
            System.out.println(count);
            //System.out.println(count);
            return list;
        }

        public static void main(String[] args) 
    {   
        String str1 = "abccddde";
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(5);
        list.add(4);
        list.add(15);
        int n = str1.length();
        System.out.println(weightedUniformStrings2(str1, list));
    }
}
