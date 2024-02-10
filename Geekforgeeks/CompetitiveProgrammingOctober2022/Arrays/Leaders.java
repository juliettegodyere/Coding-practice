/**A value is a leader if there is no value greater than it on the right side
 * For example [7, 10, 4, 3, 6, 5, 2]. 10 is a leader because there is no value 
 * greater than it on the right side
 */
package Arrays;

public class Leaders {
    //Naive appraoch. Time: O(n^2)
    /**
     * i = 0
     * flag = false 
     * j = 1
     * 7 < 10 -- 7 is not a leader
     * break loop
     * ---------
     * i = 1
     * flag = false
     * j = 2
     * 10 !< 4 
     * ...
     * j = 3
     * 10 !< 3
     * ...
     * j = 4
     * 10 !< 6
     * ...
     * j = 5
     * 10 !< 5
     * ...
     * j = 6
     * 10 !< 2
     * flag = false
     * print 10
     * ----------
     * i = 2
     * j = 3
     * 4 !< 3
     * ...
     * i = 2
     * j = 4
     * 4 < 6
     * break loop
     * 
     */
    static void isLeader(int arr[], int n){
        for(int i = 0; i < n; i++){
            boolean flag = false;
            for(int j = i + 1; j < n; j++){
                if(arr[i] <= arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.print(arr[i] + " ");
            }
        }
    }
    //Efficient solution. This method will print the leaders from right to left.Time: Theta(N)
    /**[7, 10, 4, 3, 6, 5, 2]
     * print 2
     * curr_idx = 2
     * 2 < 5 yes
     * curr_idx = 5
     * print 5
     * 5 < 6 yes
     * curr_idx = 6
     * print 6
     * 6 < 3 No
     * 6 < 4 No
     * 6 < 10 yes
     * curr+idx = 10
     * print 10
     * 10 < 7 No
     */
    static void isLeader2(int arr[], int n){
        int curr_idx = arr[n-1];
        System.out.println(curr_idx);
        for(int i = n-2; i >= 0; i--){
            if(curr_idx < arr[i]){
                curr_idx = arr[i];
                System.out.print(curr_idx + " ");
            }
        }
    }
    public static void main(String[] args) 
    {   
        int[] arr = {7, 10, 4, 3, 6, 5, 2};
        int n = arr.length;
        isLeader(arr, n);
        isLeader2(arr, n);

    }
}
