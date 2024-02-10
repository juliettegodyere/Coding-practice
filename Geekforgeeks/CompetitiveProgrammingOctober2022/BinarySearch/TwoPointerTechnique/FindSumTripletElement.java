package BinarySearch.TwoPointerTechnique;

public class FindSumTripletElement {
    public static boolean getTriplet(int aa[], int n, int sum){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(aa[i] + aa[j]+aa[k] == sum){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    /**
     * Using Two pointer technique https://ide.geeksforgeeks.org/dZdvRjkmkr
     * @param args
     */
    public static boolean getTriplet2(int arr[], int n, int targetSum){

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum == targetSum) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    return true;
                } else if (currentSum < targetSum) {
                    left++; 
                } else {
                    right--; 
                }
            }
        }

        return false; // No triplet found
    }
    static boolean isPair(int aa[], int l, int r, int x){
        return false;
    }
    public static void main(String[] args) 
	{ 
		int A[] = { 2, 3, 7, 8, 11 }; 
		int n = A.length;
        int x = 12; 
		System.out.println(getTriplet(A, n, x)); 
	} 
}
