package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class IPAddressGeneration {
    public static List<String> genIp(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        if(result.size() == 0){
            result.add("-1");
        }
        return result;
    }

    private static void backtrack(String s, int start, List<String> current, List<String> result) {
        // If we have found four segments and used all characters in the string
        if (current.size() == 4 && start == s.length()) {
            result.add(String.join(".", current));
            return;
        }

        // If we have found four segments but there are remaining characters in the string
        if (current.size() == 4 || start == s.length()) {
            return;
        }

        // Try all possible segment lengths (1 to 3 digits)
        for (int len = 1; len <= 3 && start + len <= s.length(); len++) {
            String segment = s.substring(start, start + len);
            // Skip segments with leading zeros unless they are single-digit
            if (segment.startsWith("0") && segment.length() > 1 || Integer.parseInt(segment) > 255) {
                continue;
            }
            current.add(segment);
            backtrack(s, start + len, current, result);
            current.remove(current.size() - 1);
        }
    }
    

    public static void main(String[] args) {
        String s = "557898";
        List<String> result = genIp(s);
        System.out.println("Generated IP Addresses:");
        for (String ip : result) {
            System.out.println(ip);
        }
    }
}
