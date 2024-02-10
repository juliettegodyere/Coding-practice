package Arrays;

public class RightRotateArray {
    static void rightRotate(int arr[], int d, int n)
    {
        for (int i = n; i > d; i--)
            rightRotatebyOne(arr, n);
    }
 
    static void rightRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args)
    {
         int arr[] = { 1, 2, 3, 4, 5 };
 
        rightRotate(arr, 2, arr.length);
        printArray(arr, arr.length);
    }
}
