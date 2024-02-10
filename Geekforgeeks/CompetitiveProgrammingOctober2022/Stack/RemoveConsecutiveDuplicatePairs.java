package Stack;

public class RemoveConsecutiveDuplicatePairs {
    public static String removePair(String str)
    {
        StringBuilder result = new StringBuilder();

        int n = str.length();
        int i = 0;

        while (i < n - 1) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                i += 2;
            } else {
                result = result.append(str.charAt(i));
                i++;
            }
        }

        // Check if there's a single character left at the end
        if (i < n) {
            result = result.append(str.charAt(i));
        }

        return result.toString();
    }
    public static void main(String[] args)
    {
        String str = "aaabbaaccd";
        // a=a => i = 2; newStr = aaabbaaccd
        // a = b => i = 3; newStr = aaabbaaccd result = a
        // b = b => i = 5; newStr = aaabbaaccd result = a
        // a = a => i = 7; newStr = aaabbaaccd result = a
        // c = c => i = 9; newStr = aaabbaaccd result = a


        System.out.println(removePair(str));
    }
}
