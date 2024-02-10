package Arrays;

public class LargestElement {
    //My efficient approach
    static int getLargestElement(int[]arr, int n){
        int index = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
    //Teacher's efficient approach
    static int getLargestElement2(int[]arr, int n){
        int res = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[res]){
                res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {   
        int[] arr = {5, 8, 20,10};
        int n = arr.length;
        System.out.print(getLargestElement(arr, n));
        System.out.print(getLargestElement2(arr, n));

    }
}
