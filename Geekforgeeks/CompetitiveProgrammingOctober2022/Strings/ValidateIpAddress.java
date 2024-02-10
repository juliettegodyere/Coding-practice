package Strings;

public class ValidateIpAddress {
    /**s = "222.111.111.111"
     * res = 0
     * str = ""
     * i = 0
     * '2' == '.' no
     * str = "2"
     * i = 1
     * '2' == '.' no
     * str = "22"
     * i = 2
     * '2' == '.' no
     * str = "222"
     * i = 3
     * '.' == '.' yes
     * str = ""
     * res = 1
     * i = 4
     * '1' == '.' no
     * str = "1"
     * i = 5
     * '1' == '.' no
     * str = "11"
     * i = 6
     * '1' == '.' no
     * str = "111"
     * i = 7
     * '.' == '.' yes
     * str = ""
     * res = 2
     * '1' == '.' no
     * str = "1"
     * i = 9
     * '1' == '.' no
     * str = "11"
     * i = 10
     * '1' == '.' no
     * str = "111"
     * i = 11
     * '.' == '.' yes
     * str = ""
     * res = 3
     * '1' == '.' no
     * str = "1"
     * i = 12
     * '1' == '.' no
     * str = "11"
     * i = 13
     * '1' == '.' no
     * str = "111"
     * i = 14
     * '.' == '.' yes
     * str = "111"
     * res = 4
     */
    static boolean isValid(String s) {
        // Write your code here
        int n = s.length();
        int res = 0;
        String str = "";
        // String charCheck = "";
        String regex = "[0-9]+";
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '.'){
                System.out.println("str " + str);
                //check if count is between 0 and 255
                if(str.length() != 3 && !str.matches(regex)){
                    return false;
                }
                if(0 <= Integer.parseInt(str) && Integer.parseInt(str) <= 255){
                    str = "";
                    res++;
                }else{
                    return false;
                }
                //increment res
            }else{
                str+=s.charAt(i);
                //Increment count
            }
        }
        res++;
        System.out.println("str " + str);
        //If res length > 4 it is ivalid
        System.out.println(res);
        return res == 4 ? true : false;
    }
    public static void main(String[] args) 
    {   
        String str = "11m.111.111.111";
        int n = str.length();
        System.out.println(isValid(str));
    }
}
