package Arrays;

/**
 * https://www.codewars.com/kata/5679aa472b8f57fb8c000047
 */
public class RightSumLeftSum {
    public static int lrSum(int arr[]){
        int n = arr.length;

        for(int i = 1; i < n; i++){
             int lSum = 0;
             int rSum = 0;
            for(int j = 0; j < i; j++){
                lSum=lSum+arr[j];
            }
            for(int j = i+1; j < n; j++){
                rSum=rSum+arr[j];
            }
            if(lSum == rSum){
                return i;
            }
        }
        return -1;
    }

    public static int lrSum2(int arr[]){
        int n = arr.length;

        int totalSum = 0;
        for(int j = 0; j < n; j++){
            totalSum=totalSum+arr[j];
        }
         int lSum = 0;
         int rSum = totalSum;

        for(int i = 0; i < n; i++){
            rSum-=arr[i];

            if(lSum == rSum){
                return i;
            }

            lSum+=arr[i];
        }
        return -1;
    }

    public static void main (String[] args) {
        int arr[] = new int[]{1,2,3,4,3,2,1};
        int len = arr.length;
        
        System.out.println(lrSum(arr));
    }
}

