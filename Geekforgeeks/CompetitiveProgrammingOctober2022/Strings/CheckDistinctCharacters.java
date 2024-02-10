package Strings;

/**
 * Check if all the charcaters in the string are distinct
 */
public class CheckDistinctCharacters {
    static boolean isDistinct(String str, int i, int j){
        boolean[] visited = new boolean[256];
        for(int k = i; k < j; k++){
            if(visited[str.charAt(k)] == true){
                return false;
            }
            visited[str.charAt(k)] = true;
        }
        return true;
    }
    
    public static void main(String args[]) 
    { 
        String str = "geeksforgeeks"; 
        System.out.print(isDistinct(str, 5, 8)); 
    }
}
