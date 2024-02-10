/**We are given a binary array or a boolean array. Our target is to make all elements of 
 * this binary array same. Note that we can make all elements same, either by flipping 
 * all 0's or by flipping all 1's. We are allowed to do flip of all 0's or all 1's.
 * When you are flipping 0's, you are allowed to do consecutive all zero flips in one
 * goal. So we can flip consecutive 0's or 1's.
 * Example: {1,1,0,0,0,1}
 * You have two options; either you flip the 1st two 1's (index 0-1 & 4-4) and then then 
 * last 1's. Or you flip the three zeros from index 2-4.
 * Another example: {1,0,0,0,1,0,0,1,1,1,1}
 * We have two options
 * (1) Flip 1's (index 0 - 0, 4-4 , & 7-10) 3 flips
 * (2) index 1-3, 5-6 - 2 flips
 * Note: if all elements are 1's or 0's, then we don't need to flip. eg {1, 1, 1} or {0, 0, 0}.
 * 
 */
package Arrays;

public class MinimumConsecutiveFlips {
    /**Naive appraoch. transverse the array from left to right.  
     * Count the groups of 1's and 0's in one transversal. 
     * Example: {1, 0,0,0,1,0,0,1,1,1,1} 
     * Here, the groups of 1's is 3 while that of 0's is 2.
     * we then compare these two and find that the groups of 0's are lesser.
     * Then I will decide that i need to flip groups of zeros.
     * Then I will have to transverse this array again and print that i need to flip
     * from index 1-3. How do i print it, as soon as I find the first zero, I will print from
     * current index, when I find a one after the zero, I will print the index before the current.
     * The final answer will be index 1-3 and 5-6
     * This process will occur in two transversals.
     */
    static void minFlip(int arr[], int n){

    }
    /* Efficient apprach. if you always flip the second group in the array, you will always get the 
    minimum flip.
    Example: {1,1, 0,0,0, 1,1,1, 0,0,1}
     * here you flip all zeros which is the second group (index 2-4, 8-9). Because second group is the only group
     * which will either have equal number of counts as the first group or will have one less count, 
     * you want to minimize the flips
     * Example:{0,0,1,1,0,0,0,1,1,0,0}
     * The second group is one. (index 2-3, 7-8)
     */
    static void minFlip2(int arr[], int n){
        for(int i =1; i < n; i++){
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0]){
                    System.out.print("From " + i + " to ");
                }else{
                    System.out.print(i - 1);
                }
            }
            if(arr[n-1] != arr[0]){
                System.out.print(n-1);
            }
        }
    }
    public static void main(String[] args) 
    {   
        int[] arr = {0, 0, 1, 1, 0, 0, 1,1,0,1};
        int n = arr.length;
        minFlip2(arr, n);
    }
}
