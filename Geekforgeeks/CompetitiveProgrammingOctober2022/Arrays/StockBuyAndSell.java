package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class StockBuyAndSell {
    //Function to find the days of buying and selling stock for max profit.
    static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int start = 0;
        int i;
        for(i = 1; i < n; i++){
            if(A[i] > A[i-1]){
                continue;
            }else if(A[i-1] >= A[i]){
                start = i;
            }else{
                res.add(start);
                res.add(i);
                //list.add(res);
                start = i;
            }
        }
        res.add(start);
        res.add(i-1);
        list.add(res);
        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,2,2,2,4};
        int n = arr1.length;
        System.out.println(stockBuySell(arr1, n));
    }
}
