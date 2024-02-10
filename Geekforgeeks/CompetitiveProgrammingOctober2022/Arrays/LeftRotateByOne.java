package Arrays;

public class LeftRotateByOne {
    //Anticlockwise rotation by one
    /**
     * i = 1
     * temp = 0;
     * {7, 7, 0, 5, 12}
     * i = 2
     * {7, 0, 0, 5, 12}
     * i = 3
     * {7, 0, 5, 5, 12}
     * i = 4
     * {7, 0, 5, 12, 12}
     * i = 5
     * {7, 0, 5, 12, 0}
     */
    static void lRotate(int arr[], int n){
        int temp = arr[0];
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    public static void main(String[] args) 
    {   
        int[] arr = {0, 7, 0, 5, 10};
        int n = arr.length;
        lRotate(arr, n);
    }
}
