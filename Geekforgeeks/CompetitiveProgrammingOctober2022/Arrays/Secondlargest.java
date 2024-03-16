package Arrays;

public class Secondlargest {
    //My Naive approach. You can also find the largest in a different function
    static int getSecondlargest(int[] arr, int n){
        int index = -1;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] < max){
                if(arr[i] > smax){
                    smax = arr[i];
                    index = i;
                }
            }
        }
        return index;

    }
    //Efficient approach
    static int getSecondlargest2(int[] arr, int n){
        int second = -1;
        int largest = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[largest]){
                second = largest;
                largest = i;
            }else if(arr[i] != arr[largest]){
                if(second == -1 || arr[i] > arr[second]){
                    second = i;
                }
            }
        }
        return second;

    }

    public static void main(String[] args) 
    {   
        int[] arr = {10, 10, 10, 10, 10};
        int n = arr.length;
        System.out.print(getSecondlargest(arr, n));
    }
}
