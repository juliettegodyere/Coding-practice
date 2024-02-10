package Stack;

/** 
 * Given an array of distinct integers, find closest (position-wise) greater on left of every element.
 * If there is no greater element on left, return -1.
 */

import java.util.Stack;

public class PreviousGreaterElement {
    static void printPrevGreater(int[] arr, int n){
        for(int i = 0; i < n; i++){
            int j =0;
            for(j = i -1; j >=0; j--){
                if(arr[i] < arr[j]){
                    System.out.print(arr[j] + ", ");
                    break;
                }
            }
            if(j == -1){
                System.out.print(-1 + ", ");
            }
        }
    }

     public static void printPrevGreater3(int arr[],int n){
        Stack<Integer> s=new Stack<>() ;
        s.add(arr[0]);
        System.out.print(-1+" ");
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false && s.peek()<=arr[i]){
                s.pop();
            }
            int span=s.isEmpty() ? -1 : s.peek();
            System.out.print(span+" ");
            s.push(arr[i]);
        }    
    }
    public static void printPrevGreater2(int arr[],int n){
    
        Stack <Integer> s=new Stack<>();
        s.add(arr[0]);
        for(int i=0;i<n;i++){
            while(s.isEmpty()==false && s.peek()<=arr[i])
                s.pop();
            int pg=s.isEmpty()?-1:s.peek();
            System.out.print(pg+" ");
            s.add(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr = {20, 30, 10, 5, 15};
        int n = arr.length;
        printPrevGreater(arr, n);
        printPrevGreater2(arr, n);
        printPrevGreater3(arr, n);
    }
}
