/* Implement a method which performs basic string compression by counting sequences of repeating characters. Given "AABBBCCCD" it should return "A2B3C3D1". 
Sample Input:

AABBBCCCD
KKKKK
AABCA

Sample Output:

A2B3C3D1
K5
A2B1C1A1
*/

package AperxonCodingInterview;

import java.util.HashMap;
import java.util.Map;

public class PrintSequence {
    public static String compress(String str, int n){
        String result = "";
        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = i+1; j < n; j++){
            if(str.charAt(j) == str.charAt(i)){
                count++;
            }else{
                break;
            }
            }
            result+=str.charAt(i)+""+count;
            i+=count-1;
        }
        return result;
    }

    public static String compress2(String str, int n){
        String result = "";
        Map<Character, Integer> map = new HashMap<>();
        int count = 1, temp = 0;
        for(int i = 1; i < n; i++){
          if(str.charAt(i) != str.charAt(i-1)){
            map.put(str.charAt(temp), count);
            count = 1;
            temp = -1;
          }else{
            count++;
            temp = i;
          }
        }
        for(Map.Entry<Character, Integer> m: map.entrySet()){
            result+=m.getKey()+""+m.getValue();
        }
        return result;
    }

    public static void main(String[] args){
        String str = "Abcda";
        int n = str.length();

        System.out.println(compress(str, n));
        System.out.println(compress2(str, n));
    }
}

// @Test
    // public void test2() {
    //     String input = "ABCDE";
    //     String expected = "A1B1C1D1E1";
    //     String actual = compress(input);
    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void test3() {
    //     String input = "KKKKK";
    //     String expected = "K5";
    //     String actual = compress(input);
    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void test4() {
    //     String input = "";
    //     String expected = "";
    //     String actual = compress(input);
    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void test5() {
    //     String input = "aaa";
    //     String expected = "a3";
    //     String actual = compress(input);
    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void test6() {
    //     String input = "Abcda";
    //     String expected = "A1b1c1d1a1";
    //     String actual = compress(input);
    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void test7() {
    //     String input = "a";
    //     String expected = "a1";
    //     String actual = compress(input);
    //     assertEquals(expected, actual);
    // }

    // @Test
    // public void test8() {
    //     String input = "aaBBBa";
    //     String expected = "a2B3a1";
    //     String actual = compress(input);
    //     assertEquals(expected, actual);
    // }
