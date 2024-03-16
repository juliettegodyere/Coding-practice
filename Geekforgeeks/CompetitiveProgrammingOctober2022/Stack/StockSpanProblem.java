package Stack;

/**
 * In this video we will take a look at the Stock Span problem. We have a series of N daily price quotes for a 
 * stock and we need to calculate the span of the stock's price for all N days. 
 * The span Si of the stock's price on a given day i is defined as the maximum number of consecutive days just before the given day, 
 * for which the price of the stock on the current day is less than its price on the given day. 
 * 
 * 
 */

import java.util.Stack;

public class StockSpanProblem {
    static void printSpan(int[] arr, int n){
        for(int i = 0; i < n; i++){
            int span = 1;

            for(int j = i -1; j >=0; j--){
                if(arr[j] > arr[i]){
                    break;
                }else{
                    span++;
                }
            }
            System.out.print(span + ", ");
        }
    }
    //The tutor's approach
    static void printSpan2(int[] arr, int n){
        for(int i = 0; i < n; i++){
            int span = 1;
            for(int j = i -1; j >=0 && arr[j] <= arr[i]; j--){
                span++;
            }
            System.out.print(span + ", ");
        }
    }
    /**
     * Efficient approach: A span of current element is equal to the index of current 
     * minus index of closest element greater element on the left side if the is greater element.
     * Otherwise index of current element plus 1;
     * @param args
     */
        public static void printSpan3(int arr[],int n){
            Stack<Integer> s=new Stack<>() ;
            s.add(0);
            System.out.print(1+" ");
            for(int i=1;i<n;i++){
                while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                    s.pop();
                }
                int span=s.isEmpty() ? i+1 : i-s.peek();
                System.out.print(span+" ");
                s.push(i);
            }    
        }
    public static void main(String[] args){
        int[] arr = {30, 20, 25, 28, 27,29};
        int n = arr.length;
        printSpan(arr, n);
        printSpan2(arr, n);
        printSpan3(arr, n);
    }
}
