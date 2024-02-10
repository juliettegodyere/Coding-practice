package Stack;

import java.util.Stack;
/**
 * In this video, we will explore the problem of determining the Largest Rectangular Area in a Histogram. 
 * This shape will be comprised of a series of adjacent bars, each with a specified height stored in an array. 
 * To simplify the problem, we will assume that all bars possess the same width, measuring 1 unit. 
 * We will look at both the Naive solution and the Efficient solution (using stack) to solve this problem.
 */

public class LargestRectangularAreaHistogram {
    //Naive method

    public static int getMaxArea(int arr[],int n){
        int res=0;
       for(int i=0;i<n;i++){
           int curr=arr[i];
           for(int j=i-1;j>=0;j--){
               if(arr[j]>=arr[i])curr+=arr[i];
               else break;
           }
           for(int j=i+1;j<n;j++){
               if(arr[j]>=arr[i])curr+=arr[i];
               else break;
           }
           res=Math.max(res,curr);
       }
       return res;
   
   }
   //Better solution
   public static int getMaxArea2(int arr[],int n){
         int res=0;
         int[] ps=new int[n];int[] ns=new int[n];
    
        Stack <Integer> s=new Stack<>();
        s.add(0);
        for(int i=0;i<n;i++){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i])
                s.pop();
            int pse=s.isEmpty()?-1:s.peek();
            ps[i]=pse;
            s.push(i);
        }
        
        while(s.isEmpty()==false){
            s.pop();
        }
        
        s.push(n-1);
        for(int i=n-1;i>0;i--){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i])
                s.pop();
            int nse=s.isEmpty()?n:s.peek();
            ns[i]=nse;
            s.add(i);
        }
        
        for(int i=0;i<n;i++){
            int curr=arr[i];
            curr+=(i-ps[i]-1)*arr[i];
            curr+=(ns[i]-i-1)*arr[i];
            res=Math.max(res,curr);
        }
        return res;
    
    }
    //Optimized solution
    public static int getMaxArea3(int arr[],int n){
        Stack <Integer> s=new Stack<>();
        int res=0;
        int tp;
        int curr;
        for(int i=0;i<n;i++){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i]){
                tp=s.peek();s.pop();
                curr=arr[tp]* (s.isEmpty() ? i : i - s.peek() - 1);
                res=Math.max(res,curr);
            }
            s.add(i);
        }
        while(s.isEmpty()==false){
            tp=s.peek();s.pop();
            curr=arr[tp]* (s.isEmpty() ? n : n - s.peek() - 1);
            res=Math.max(res,curr);
        }
        
        return res;
    
    }
   public static void main (String[] args) {
   
       int[] arr=new int[]{6,2,5,4,1,5,6};
       
       System.out.print("Maximum Area: "+getMaxArea(arr,arr.length));   
     
   }
}
