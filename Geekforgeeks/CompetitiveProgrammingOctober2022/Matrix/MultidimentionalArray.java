package Matrix;

public class MultidimentionalArray {
    static void printArray(int[][] arr, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
   
        int[][] arr={
            {1, 2, 3, 4},
            {5, 6, 7, 8, 9, 10}};
        int n = arr.length;
       printArray(arr,n);
      
    }
}
