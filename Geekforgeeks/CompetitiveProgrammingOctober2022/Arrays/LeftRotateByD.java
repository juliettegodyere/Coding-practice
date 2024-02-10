package Arrays;
/**Left rotate is anti-clockwise rotate */
public class LeftRotateByD {
    static void lRotateByOne(int arr[], int n){
        int temp = arr[0];
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    //Naive method
    static void lRotateByD(int arr[], int n, int d){
        for(int i = 0; i < d; i++){
            lRotateByOne(arr, n);
        }
    }
    //Better approach. Time complexity is Theta(n). Space is Theta(d)
    static void lRotateByD2(int arr[], int n, int d){
        int temp[] = new int [d];
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }
        for(int i = d; i < n; i++){
            arr[i-d] = arr[i];
        }
        for(int i = 0; i < d; i++){
            arr[n-d+i] = temp[i];
        }
    }
    static void swap(int low, int high){
        int temp = low;
        low = high;
        high = temp;
    }
    static void reverse(int arr[], int low, int high){
        while(low<high){
            swap(arr[low], arr[high]);
            low++;
            high--;
        }
    }
    //Most efficient method. Time: Theta(n). Space: Theta(1)
    static void lRotateByD3(int arr[], int n, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

    
    public static void main(String[] args) 
    {   
        int[] arr = {0, 7, 0, 5, 10};
        int n = arr.length;
        int d = 3;
        lRotateByD(arr, n, d);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
