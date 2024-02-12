package Strings;

import java.util.*;

public class AlienDictionary {
    public static void main(String[] args) {
        String[] words = {"baa","abcd","abca","cab","cad"};
        int n = words.length;
        int k = 4;
        String order = findOrder(words, n, k);
        System.out.println("Order of characters in the alien language: " + order);
    }

    public static String findOrder(String[] words, int n, int k) {
        StringBuilder result = new StringBuilder();
        
        // Create an adjacency list representation of the graph
        Map<Character, List<Character>> graph = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();
        
        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.put(c, new ArrayList<>());
                indegree.put(c, 0);
            }
        }
        
        // Compare adjacent words to find order of characters
        for (int i = 0; i < n - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            int len = Math.min(word1.length(), word2.length());
            
            for (int j = 0; j < len; j++) {
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);
                
                if (c1 != c2) {
                    graph.get(c1).add(c2);
                    indegree.put(c2, indegree.get(c2) + 1);
                    break;
                }
            }
        }
        
        // Perform topological sort
        Queue<Character> queue = new LinkedList<>();
        for (char c : indegree.keySet()) {
            if (indegree.get(c) == 0) {
                queue.offer(c);
            }
        }
        
        while (!queue.isEmpty()) {
            char c = queue.poll();
            result.append(c);
            
            for (char neighbor : graph.get(c)) {
                indegree.put(neighbor, indegree.get(neighbor) - 1);
                if (indegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        
        // If the result string does not contain all characters, there's a cycle
        if (result.length() != indegree.size()) {
            return "";
        }
        
        return result.toString();
    }
}

