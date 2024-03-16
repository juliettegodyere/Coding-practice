package Strings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import Arrays.RemoveDuplicates;

public class RemoveAllAdjacentDuplicate {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().ch == ch) {
                stack.peek().count++;
                if (stack.peek().count == k) {
                    stack.pop();
                }
            } else {
                stack.push(new Pair(ch, 1));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (Pair pair : stack) {
            for (int i = 0; i < pair.count; i++) {
                sb.append(pair.ch);
            }
        }
        
        return sb.toString();
    }
    
    class Pair {
        char ch;
        int count;
        
        public Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
    
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicate solution = new RemoveAllAdjacentDuplicate();
        
        // Test cases
        String s1 = "abcd";
        int k1 = 2;
        System.out.println("Input: s = \"" + s1 + "\", k = " + k1);
        System.out.println("Output: " + solution.removeDuplicates(s1, k1));
        
        String s2 = "deeedbbcccbdaa";
        int k2 = 3;
        System.out.println("\nInput: s = \"" + s2 + "\", k = " + k2);
        System.out.println("Output: " + solution.removeDuplicates(s2, k2));
        
        String s3 = "pbbcggttciiippooaais";
        int k3 = 2;
        System.out.println("\nInput: s = \"" + s3 + "\", k = " + k3);
        System.out.println("Output: " + solution.removeDuplicates(s3, k3));
    }
}
