package Arrays;

public class FrequencySortedArray {
    //Time: Theta(N)
    static void printFreq(int arr[], int n){
        int freq = 1; int i = 1;
        while(i < n){
            while(i < n && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.print(arr[i-1] + " " + freq);
            i++;
            freq=1;
        }
        if(n == 1 || arr[n-1] != arr[n-2]){
            System.out.print(arr[n-1] + " " + 1);
        }
    }
    public static void main(String[] args) 
    {   
        int[] arr = {5, 8, 20,10};
        int n = arr.length;
        printFreq(arr, n);
    }
}
