package Strings;

import java.lang.reflect.Method;

/**
 * return IPv4 if IP is a valid IPv4 address
 * return IPv6 if IP is a valid IPv6 address
 * return Neither if IP is Neither a valid IPv4 or IPv6 address
 * 
 * A valid IPv4 address is an IP in the form "x1.x2.x3.x4" where 0 <= xi <= 255 and xi cannot contain leading zeros. 
 * For example, "192.168.1.1" and "192.168.1.0" are valid IPv4 addresses while "192.168.01.1", "192.168.1.00", 
 * and "192.168@1.1" are invalid IPv4 addresses.
 * A valid IPv6 address is an IP in the form "x1:x2:x3:x4:x5:x6:x7:x8" where:

1 <= xi.length <= 4
xi is a hexadecimal string which may contain digits, lowercase English letter ('a' to 'f') 
and upper-case English letters ('A' to 'F').
Leading zeros are allowed in xi.
For example, "2001:0db8:85a3:0000:0000:8a2e:0370:7334" and "2001:db8:85a3:0:0:8A2E:0370:7334" are valid IPv6 addresses, 
while "2001:0db8:85a3::8A2E:037j:7334" and "02001:0db8:85a3:0000:0000:8a2e:0370:7334" are invalid IPv6 addresses.
 */
public class IpValidation {
    public static String validIPAddress(String queryIP) {
        String[] s;
        if (queryIP.contains(".")) {
            s = queryIP.split("\\.");
            if (validateIPv4(s)) {
                return "IPv4";
            }
        } else if (queryIP.contains(":")) {
            s = queryIP.split(":");
            if (validateIPv6(s)) {
                return "IPv6";
            }
        }
        return "Neither";
    }

    static boolean validateIPv4(String[] queryIP) {
        if (queryIP.length != 4) {
            return false; // IPv4 address should consist of exactly four segments
        }
    
        for (String s : queryIP) {
            if (!s.matches("\\d+")) {
                return false; // Each segment should consist of only digits
            }
    
            int num = Integer.parseInt(s);
            if (num < 0 || num > 255) {
                return false; // Each segment should be in the range 0-255
            }
    
            if (s.length() > 1 && s.charAt(0) == '0') {
                return false; // Leading zeros are not allowed unless the number is exactly '0'
            }
        }
    
        return true;
    }
    static boolean validateIPv6(String[] queryIP) {
        String regex = "^[0-9a-fA-F]+$";
    
        if (queryIP.length != 8) {
            return false; // IPv6 address should consist of exactly eight segments
        }
    
        for (String s : queryIP) {
            if (s.length() > 4) {
                return false; // Each segment should not exceed 4 characters
            }
            if (!s.matches(regex)) {
                return false; // Each segment should consist of only hexadecimal characters
            }
        }
    
        return true;
    }
    // Method to check if a string is a valid integer
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {   
        String str = "256.256.256.256";
        int n = str.length();
        System.out.println(validIPAddress(str));
    }
}
