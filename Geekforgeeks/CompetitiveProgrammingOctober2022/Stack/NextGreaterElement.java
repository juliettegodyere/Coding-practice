package Stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {
    static void printNextGreater(int[] arr, int n){
        for(int i = 0; i < n; i++){
            int j =-1;
            for(j = i + 1; j < n; j++){
                if(arr[j] > arr[i]){
                    System.out.print(arr[j] + ", ");
                    break;
                }
            }
            if(j == n){
                System.out.print(-1 + ", ");
            }
        }
    }
     public static List<Integer> printNextGreater3(int arr[],int n){
        List<Integer> list = new ArrayList<>();
        Stack<Integer> s=new Stack<>() ;
        s.add(arr[n-1]);
        System.out.print(-1+" ");
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=arr[i]){
                s.pop();
            }
            int span=s.isEmpty() ? -1 : s.peek();
            System.out.print(span+" ");
            list.add(span);
            s.push(arr[i]);
        } 
        Collections.reverse(list); 
        return  list;
    }
    public static void main(String[] args){
        int[] arr = {20, 30, 10, 5, 15};
        int n = arr.length;
        printNextGreater(arr, n);
        printNextGreater3(arr, n);
    }
}
