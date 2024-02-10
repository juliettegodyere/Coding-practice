package Arrays;

public class MaximumConsecutiveOnes {
    //naive appraoch Time:0(N^2), Space 0(1)
    static int maxConsecutiveOnes(int arr[], int n){
        int res = 0;
        for(int i =0; i < n; i++){
            int curr = 0;
            for(int j = i; j < n; j++){
                if(arr[j] == 1) curr++;
                else break;
            }
            res = Math.max(res, curr);
        }
        return res;
    }
    //Efficient appraoch
    /**{0, 1, 1, 1, 0, 1, 1};
     * res = 0
     * curr = 0
     * i = 0
     * 0 == 0 yes
     * curr = 0
     * res = 0
     * i = 1
     * 1 == 0 No
     * curr = 1
     * res = 1
     * i = 2
     * 1 == 0 No
     * curr = 2
     * res = 2
     * i = 3
     * 1 == 0 No
     * curr = 3
     * res = 3
     * i = 4
     * 0 == 0 yes
     * curr = 0
     * res = 3
     * i = 5
     * 1 == 0 no
     * curr = 1
     * res = 3
     * i = 6
     * 1 == 0 no
     * curr = 2
     * res = 3
     */
    static int maxConsecutiveOnes2(int arr[], int n){
        int res = 0; int curr = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0) curr = 0;
            else {
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    public static void main(String[] args) 
    {   
        int[] arr = {0, 1, 1, 1, 0, 1, 1};
        int n = arr.length;
        System.out.print(maxConsecutiveOnes(arr, n));
    }
}
