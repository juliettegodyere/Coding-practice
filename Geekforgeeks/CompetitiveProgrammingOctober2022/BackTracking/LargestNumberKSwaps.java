// /**
//  * Find Maximum number possible by doing at-most K swaps🔥 | Hard | Backtracking.
//  * https://www.youtube.com/watch?v=uJlI6XSaXhk
//  */
// package BackTracking;

// import java.util.Arrays;

// public class LargestNumberKSwaps {
   
//     public static String findMaximumNum(String str, int k){
//             //code here.
//             //find the max value in the string with the highest index.
//             String ans = str;
//             int n = str.length();
//             solve(str, n, k, ans, 0);
//             return ans;
//         }
//         static void solve(String str, int n, int k, String ans, int index){
//             char[] arr = str.toCharArray();
//             int max = arr[index];
//             int max_idx = index;
//             if(k == 0){
//                 return;
//             }
//             for(int i = index+1; i < str.length(); i++){
//                 int val = Integer.parseInt(""+arr[i]);
//                 if(val > max){
//                     max = val;
//                     max_idx = i;
//                 }
//             }
//             if(max != arr[index])
//                 k--;
//             for(int j = str.length()-1; j >= index; j--){
//                 swap(arr, index, j);
//                 solve(str, n, k, ans, index+1);
//                 swap(arr, index, j);

//                 String t = new String(arr);
//                 if(Integer.parseInt(t) > Integer.parseInt(max_ans))
//                     max_ans = t;
                
//                 if(ans < str)
//                     ans=str;
                
//                 solve(str, n, k, ans, index+1);
//                         System.out.println("New Ans " + t);
                        
//                         System.out.println("Max Ans " + max_ans);
//                         ch = under_test.toCharArray();
//                 swap(str, index, j);
//             }
//         }

//         static void swap(char[] ch, int i, int j){
//             //System.out.println("Before " + ""+ch[0]);

//             char temp = ch[i];
//             ch[i] = ch[j];
//             ch[j] = temp;
//             //System.out.println("After " + ""+ch[6]);
//         }
//         /**
//          * This is my Naive method but works
//          * @param str
//          * @param k
//          * @param n
//          * @return
//          */
//         static String mySolution(String str, int k, int n){
//             //System.out.println(ch);
//             String max_ans = str;
//             String under_test = str;
//             char[] ch = under_test.toCharArray();

//             //swap(ch, 0, 6);
//             //System.out.println(Integer.parseInt(new String(ch)));
//             //System.out.println("New Ans " + new_str);

//                 for(int i = 0; i < n && k > 0; i++, k--){
//                     for(int j = n-1; j > i; j--){
//                         swap(ch, i, j);
//                         String t = new String(ch);
//                         System.out.println("New Ans " + t);
//                         if(Integer.parseInt(t) > Integer.parseInt(max_ans)){
//                             max_ans = t;
//                         }
//                         System.out.println("Max Ans " + max_ans);
//                         ch = under_test.toCharArray();
//                     }
//                     under_test = max_ans;
//                     System.out.println("String Under tes " + under_test);
//                 }
               
            
//             return max_ans;
//         }

//     public static void main(String[] args){
//         String str1 = "3435335";  
//         int n = str1.length();    
//         System.out.println(mySolution(str1, 3, n));
//     }
// }
