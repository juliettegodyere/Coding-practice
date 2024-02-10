package Strings;

public class DistinctCharacter {
    static boolean isDistinct(String str, int n){
        boolean[] visited = new boolean[256];
        for(int k = 0; k < n; k++){
            if(visited[str.charAt(k)] == true){
                return false;
            }
            visited[str.charAt(k)] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "BDCAA";
        int n = str.length();
        System.out.println(isDistinct(str, n));
    }
}
