package Hashing;

/**
 * Given an array of n names arr of candidates in an election, where each name is a string of lowercase characters. 
 * A candidate name in the array represents a vote casted to the candidate. 
 * Print the name of the candidate that received the maximum count of votes. 
 * If there is a draw between two candidates, then print lexicographically smaller name.
 */

import java.util.HashMap;
import java.util.Map;

public class ElectionWinner {

    // Function to find the winner of the election
    static String findWinner(String[] arr) {
        int n = arr.length;

        // Create a HashMap to store the count of votes for each candidate
        Map<String, Integer> voteCount = new HashMap<>();

        // Update the vote count in the HashMap
        for (String candidate : arr) {
            voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        }

        // Find the candidate with the maximum votes
        int maxVotes = 0;
        String winner = "";

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            String candidate = entry.getKey();
            int votes = entry.getValue();

            if (votes > maxVotes) {
                maxVotes = votes;
                winner = candidate;
            }//// If there is a tie, pick lexicographically
            // smaller.
            else if(votes == maxVotes && winner.compareTo(candidate) > 0){
                winner = candidate;
            }
        }

        return winner;
    }

    public static void main(String[] args) {
        int n = 13;
        String[] votes
            = { "john", "johnny", "jackie", "johnny",
                "john", "jackie", "jamie",  "jamie",
                "john", "johnny", "jamie",  "johnny",
                "john" };

        String winner = findWinner(votes);

        System.out.println("Winner of the election: " + winner);
    }
}
