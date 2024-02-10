package CompetitiveProgrammingOctober2022.Strings.Practice;

public class SumOfNumbersInstring {
    public static long findSum(String str)
    {
        // your code here
        int n = str.length();
        long num = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i)-'0' >= 0 && str.charAt(i)-'0' <= 9){
                num = num + str.charAt(i)-'0';
            }
        }
        return num;
    }
    public static void main(String[] args) 
    {   
        String s = "geeks4geeks";
        System.out.print(findSum(s));
    }
}
