package Strings;
/*
 * Check if a string can be obtained by rotating another string 2 places
 * https://www.geeksforgeeks.org/check-string-can-obtained-rotating-another-string-2-places/
 */
public class RotatedByTwoPlaces {
    // Method to check if string2 is obtained by
    // string 1
    static boolean isRotated(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        if (n != m)
            return false;
        if(n < 2){
            return str1.equals(str2);
        }
      
        String clock_rot = "";
        String anticlock_rot = "";
        int len = str2.length();
      
        // Initialize string as anti-clockwise rotation
        anticlock_rot = anticlock_rot +
                        str2.substring(len-2, len) +
                        str2.substring(0, len-2) ;
      
        // Initialize string as clock wise rotation
        clock_rot = clock_rot +
                    str2.substring(2) +
                    str2.substring(0, 2) ;
      
        // check if any of them is equal to string1
        return (str1.equals(clock_rot) ||
                str1.equals(anticlock_rot));
    }
    //Method 2
    static boolean isRotated2(String str1, String str2)
    {
        int n = str1.length();
        int m = str2.length();
        if (n != m) //check both the string length equal or not
            return false;
        boolean clockwise = true;
        boolean anticlockwise = true;
      //check clockwise rotation is possible or not
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i)!= str2.charAt((i + 2) % n)) {
                clockwise = false;
                break;
            }
        }
      // check anticlockwise rotation is possible or not
        for (int i = 0; i < m; i++) {
            if (str1.charAt((i + 2) % n)!= str2.charAt(i)) {
                anticlockwise = false;
                break;
            }
        }
        return (clockwise || anticlockwise);
    }

    public static boolean isRotatedByTwoPlacesNaive(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
    
        int len = str1.length();
    
        // Check right rotation
        String rightRotated = str1.substring(len - 2) + str1.substring(0, len - 2);
        if (rightRotated.equals(str2)) {
            return true;
        }
    
        // Check left rotation
        String leftRotated = str1.substring(2) + str1.substring(0, 2);
        return leftRotated.equals(str2);
    }
    
    public static boolean isRotatedByTwoPlacesEfficient(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
    
        int len = str1.length();
    
        // Check right rotation
        String rightRotated = str1.substring(len - 2) + str1.substring(0, len - 2);
        if (rightRotated.equals(str2)) {
            return true;
        }
    
        // Check left rotation
        String leftRotated = str1.substring(2) + str1.substring(0, 2);
        return leftRotated.equals(str2);
    }    
     
    // Driver method
    public static void main(String[] args)
    {
        String str1 = "amazon";
        String str2 = "azonam";
      
        System.out.println(isRotated(str1, str2) ?  "Yes"
                              : "No");
    }
}
