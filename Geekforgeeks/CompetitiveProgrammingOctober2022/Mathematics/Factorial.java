package Mathematics;

public class Factorial {
    static int findFactorial(int num){
        int res = 1;
        for(int i = 2; i <= num; i++){
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args){
        int num = 5;

        System.out.println(findFactorial(num));
    }
}
