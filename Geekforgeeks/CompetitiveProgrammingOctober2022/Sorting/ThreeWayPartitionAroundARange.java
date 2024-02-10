package Sorting;

//https://www.geeksforgeeks.org/problems/three-way-partitioning/1

public class ThreeWayPartitionAroundARange {
    public static void threeWayPartition(int array[], int a, int b)
    {
        
       int n = array.length, l = 0, h = n -1, m = 0;

       while(m <= h){
            if(array[m] < a){
                swap(array, l, m);
                l++; m++;
            }else if(array[m] >= a && array[m] <= b ){
                m++;
            }else{
                swap(array, h, m);
                h--;
            }
       }
    }

    static void swap(int array[], int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main (String[] args) 
    {
        int arr[] = new int[]{1, 4, 3, 6, 2, 1};
        
        int n = arr.length;
        
        threeWayPartition(arr, 1, 3);
	
	    for(int x:arr)
            System.out.print(x+" ");
        
    }
}
