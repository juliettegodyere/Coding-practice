package Sorting;

public class MedianOfTwoSortedArrays {
    static int findMedian(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int i = 0, j = 0, k=0;
        int[] temp = new int[n+m];

        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                temp[k] = arr1[i];
                k++; i++;
            }else{
                temp[k] = arr2[j];
                k++; j++;
            }
        }
        while(i < n){
            temp[k] = arr1[i];
            k++; i++;
        }
        while(j < m){
            temp[k] = arr2[j];
            k++; j++;
        }
        int mid = temp.length / 2;
        if (temp.length % 2 == 0) {
            // If the length is even, average the two middle elements
            return (temp[mid] + temp[mid - 1]) / 2;
        } else {
            // If the length is odd, return the middle element
            return temp[mid];
        }
    }
    public static void main (String[] args) 
    {
        int a[] = new int[]{10,15,20,40};
        int b[] = new int[]{5,6,6,10,15};
        
        int m = a.length;
        int n = b.length;
       // merge(a,b,m,n);

        System.out.println(findMedian(a, b));
        
    }
}
