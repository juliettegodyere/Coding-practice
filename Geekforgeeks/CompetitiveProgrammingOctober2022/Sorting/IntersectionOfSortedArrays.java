/**
 * The task is to print the items that are present in both
 * arrays
 */
package Sorting;

public class IntersectionOfSortedArrays {
    public static void main (String[] args) 
    {
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};
        
        int m = a.length;
        int n = b.length;
	    intersection(a,b,m,n);
        
    }
    /**
     * Efficient solution.
     * @param a
     * @param b
     * @param m
     * @param n
     */
    static void intersection(int a[], int b[], int m, int n){
    
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                System.out.print(a[i]+" ");
                i++;j++;
            }
        }   
    }
    static void intersectionNaive(int a[], int b[], int m, int n){
    
        for(int i=0;i<m;i++){
            if(i>0 && a[i-1]==a[i])
                continue;
            for(int j=0;j<n;j++)
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
        }    
    }
}
