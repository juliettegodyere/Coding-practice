package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    //Remove duplicates from sorted array
    /**
     * {3, 7, 6, 5, 10, 10, 3, 4};
     * temp = [3]
     * res = 1
     * i = 1
     * 3 != 7 yes
     * temp=[3, 7]
     * res = 2
     * i = 2
     * 7 !=6 yes
     * temp=[3,7,6]
     * res = 3
     * i = 3
     * 6 !=5 yes
     * temp=[3,7,6,5]
     * res = 4
     * i =4
     * 5 != 10 yes
     * temp=[3,7,6,5,10]
     * res = 5
     * i = 5
     * 10 != 10 N0
     * temp = [3, 7, 6, 5, 10, 0, 0, 0]
     * res = 5
     * i = 6
     * 10 != 3 yes
     * temp = [3, 7, 6, 5, 10, 3, 0, 0]
     * res = 6
     * i = 7
     * 10 != 4 yes
     * temp = [3, 7, 6, 5, 10, 3, 4, 0]
     * res = 7
     * i = 8
     * 
     */
    static int[] removeDup(int[] arr, int n){
        int[] temp = new int [n];
        int res = 1;
        temp[0] = arr[0];
        for(int i = 1; i < n; i++){
            if(temp[res-1] != arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
        return arr;
    }
    //Efficient Solution
    /** 
     * 
     */
    static int[] removeDup2(int[] arr, int n){
        int res = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
            //System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
    public static void main(String[] args) 
    {   
        int[] arr = {3, 7, 6, 5, 10, 10, 3, 4};
        int n = arr.length;
        int[] reveresed = removeDup2(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(reveresed[i] + ",");
        }

    }
}
