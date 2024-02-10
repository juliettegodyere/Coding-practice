package Arrays;

public class PrintSubArrays {
    public static void subArray(int arr[], int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) 
    {
       int arr[] = new int[]{1, 2, 3, 4};
       int n = arr.length;
        System.out.println("All Non-empty Subarrays");
        subArray(arr, n);
         
    }
}
