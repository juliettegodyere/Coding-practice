package Sorting;

public class PairInSortedArray {
    //Pair with given sum in a sorted array
    static int Countpair(int a[], int n, int sum)
    {
        // Complete the function
        int i = 0;
        int j = n -1;
        int count = 0;
        while(i < j){
            if(a[i] + a[j] == sum){
                count++;
                i++;
                j--;
            }else if(a[i] + a[j] < sum){
                i++;
            }else{
                j--;
            }
        }
        return count == 0 ? -1 : count;
    }
    public static void main (String[] args) {
        int arr[] = new int[]{3, 8, 4, 7, 6, 1};
        int len = arr.length;
        int x = 14;
        System.out.println(Countpair(arr, len, x));
    }
    
}
