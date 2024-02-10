package Hashing;

public class NumbersContaining12And3 {
    public static void findAll(int[] arr){
        // Iterate through the array
        for (int num : arr) {
            boolean allDigitsInSet = true;
            int temp = num;

            // Check each digit of the number
            while (temp > 0) {
                int digit = temp % 10;
                
                // Check if the digit is in the set {1, 2, 3}
                if (digit != 1 && digit != 2 && digit != 3) {
                    allDigitsInSet = false;
                    break;
                }

                temp /= 10;
            }

            // If all digits are in the set {1, 2, 3}, print the number
            if (allDigitsInSet) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
    
        findAll(arr);
    }

}
